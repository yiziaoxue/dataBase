package com.plateno.booking.config;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.PropertyValues;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.bind.RelaxedDataBinder;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.support.DefaultConversionService;
import org.springframework.core.env.Environment;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

/**
* @author zhenhua.chun 
* @version 2016年12月16日 下午1:46:26
* @Description
*/
@Configuration 
@MapperScan("com.plateno.booking.mapper")
public class DynamicDataSourceRegister  implements EnvironmentAware {
	private Logger log = LoggerFactory.getLogger(DynamicDataSourceRegister.class);
    //如配置文件中未指定数据源类型，使用该默认值
    private static final Object DATASOURCE_TYPE_DEFAULT = "org.apache.tomcat.jdbc.pool.DataSource";
    private ConversionService conversionService = new DefaultConversionService();
    private PropertyValues dataSourcePropertyValues;
   
    private Map<Object, Object> customDataSources = new HashMap<Object, Object>();
   
    /**
     * 加载多数据源配置
     */
    @Override
    public void setEnvironment(Environment environment) {
       System.out.println("DynamicDataSourceRegister.setEnvironment()");
       initCustomDataSources(environment);
    }
   
    //提供SqlSeesion
    @Bean
    public SqlSessionFactory sqlSessionFactoryBean(DynamicDataSource ds) throws Exception {
 
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(ds);
 
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath:/mybatis/*.xml"));
        return sqlSessionFactoryBean.getObject();
    }
    
    /**
     * 初始化更多数据源
     *
     * @author SHANHY
     * @create 2016年1月24日
     */
    @Bean
    @Primary
    public DynamicDataSource initCustomDataSources(Environment env) {
        // 读取配置文件获取更多数据源，也可以通过defaultDataSource读取数据库获取更多数据源
        RelaxedPropertyResolver propertyResolver = new RelaxedPropertyResolver(env, "spring.datasource.");
        String dsPrefixs = propertyResolver.getProperty("names");
        for (String dsPrefix : dsPrefixs.split(",")) {// 多个数据源
        	int index = Integer.valueOf(dsPrefix.substring(dsPrefix.length()-1, dsPrefix.length()));
        	DataSourceKeys.dataSourceKeyList.add(index);
            Map<String, Object> dsMap = propertyResolver.getSubProperties(dsPrefix + ".");
            DataSource ds = buildDataSource(dsMap);
            customDataSources.put(index, ds);
            log.info("------------加载数据源"+index+"："+ds+"------------");
            dataBinder(ds, env);
        }
        
        DynamicDataSource dataSource = new DynamicDataSource();
        dataSource.setTargetDataSources(customDataSources);// 该方法是AbstractRoutingDataSource的方法
        dataSource.setDefaultTargetDataSource(customDataSources.get(0));// 默认的datasource设置为myTestDbDataSource
        return dataSource;
    }
   
    /**
     * 创建datasource.
     * @param dsMap
     * @return
     */
    @SuppressWarnings("unchecked")
    public DataSource buildDataSource(Map<String, Object> dsMap) {
       Object type = dsMap.get("type");
        if (type == null){
            type = DATASOURCE_TYPE_DEFAULT;// 默认DataSource
        }
        Class<? extends DataSource> dataSourceType;
       
       try {
           dataSourceType = (Class<? extends DataSource>) Class.forName((String) type);
           String driverClassName = dsMap.get("driverClassName").toString();
           String url = dsMap.get("url").toString();
           String username = dsMap.get("username").toString();
           String password = dsMap.get("password").toString();
           DataSourceBuilder factory =   DataSourceBuilder.create().driverClassName(driverClassName).url(url).username(username).password(password).type(dataSourceType);
           return factory.build();
       } catch (ClassNotFoundException e) {
           e.printStackTrace();
       }
       return null;
    }
   
    /**
     * 为DataSource绑定更多数据
     * @param dataSource
     * @param env
     */
    private void dataBinder(DataSource dataSource, Environment env){
       RelaxedDataBinder dataBinder = new RelaxedDataBinder(dataSource);
       dataBinder.setConversionService(conversionService);
       dataBinder.setIgnoreNestedProperties(false);//false
       dataBinder.setIgnoreInvalidFields(false);//false
       dataBinder.setIgnoreUnknownFields(true);//true
       
       if(dataSourcePropertyValues == null){
            Map<String, Object> rpr = new RelaxedPropertyResolver(env, "spring.datasource").getSubProperties(".");
            Map<String, Object> values = new HashMap<>(rpr);
            // 排除已经设置的属性
            values.remove("type");
            values.remove("driverClassName");
            values.remove("url");
            values.remove("username");
            values.remove("password");
            dataSourcePropertyValues = new MutablePropertyValues(values);
        }
        dataBinder.bind(dataSourcePropertyValues);
       
    }
   
    @Bean
    public DataSourceTransactionManager transactionManager(DynamicDataSource dataSource) throws Exception {
         return new DataSourceTransactionManager(dataSource);
    }
 
}