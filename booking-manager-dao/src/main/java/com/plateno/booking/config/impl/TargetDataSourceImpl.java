package com.plateno.booking.config.impl;

import java.beans.PropertyDescriptor;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.beanutils.PropertyUtilsBean;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.plateno.booking.annotation.TargetDataSource;
import com.plateno.booking.common.bean.exception.NotDataSourceException;
import com.plateno.booking.config.DataSourceKeys;
import com.plateno.booking.config.DynamicDataSourceContextHolder;
import com.plateno.booking.mapper.GsOrderInnMapper;
import com.plateno.booking.model.GsOrderInn;
import com.plateno.cache.RedisHelper;
import com.plateno.privilege.util.StringUtil;
/**
* @author zhenhua.chun 
* @version 2016年12月16日 下午1:57:09
* @Description
*/
@Aspect
@Order(-1)//保证该AOP在@Transactional之前执行
@Component
public class TargetDataSourceImpl {
	
	private static final Logger log = LoggerFactory.getLogger(TargetDataSourceImpl.class);
	
	@Autowired
	private GsOrderInnMapper gsOrderInnMapper;
	
	@Pointcut("execution (* com.plateno.booking.service.impl.*.*(..))")
	public void allMethod() {
	}
    /*
     * @Before("@annotation(ds)")
     * 的意思是：
     *
     * @Before：在方法执行之前进行执行：
     * @annotation(targetDataSource)：
     * 会拦截注解targetDataSource的方法，否则不拦截;
     */
	@Before("@annotation(targetDataSource)")
    public void changeDataSource(JoinPoint joinPoint) throws Throwable {
    	Object[] args = joinPoint.getArgs();
    	Integer memberId = 0; 
        String orderCode = "";
        if (args != null && args.length > 0) {
        	System.out.println(args[0].getClass());
        	Map<String, Object> m = beanToMap(args[0]);
        	memberId = (Integer)m.get("bkMebId");
        	orderCode = (String)m.get("orderCode");
        }
        if (!StringUtil.isBlank(String.valueOf(memberId)) && StringUtil.isNotBlank(String.valueOf(orderCode))) {
			memberId = getMemberIdByOrderCode(orderCode);
		}
		// 如果找到的memberId为空的话则抛错
		if (memberId == null || memberId == 0){
			throw new NotDataSourceException("memberId为空，无法识别分片");
		}
		selectDatasourceByMemberId(memberId);
    }
   
    @After("@annotation(targetDataSource)")
    public void restoreDataSource(JoinPoint point, TargetDataSource targetDataSource) {
       //方法执行完毕之后，销毁当前数据源信息，进行垃圾回收。
       DynamicDataSourceContextHolder.clearDataSourceType();
    }
   
    /**
	 * 根据OrderCode获取memberid
	 * 
	 * @param orderCode
	 * @return
	 */
	public Integer getMemberIdByOrderCode(String orderCode) {
		Integer memberId = 0;
		// 从redis缓存中找映射
//		memberId = RedisHelp.hget("orderCodeMemberIdMap", orderCode, Integer.class);
//		memberId = (Integer)map.get(orderCode);
//		// 如果memberId为空表示缓存中没有映射关系
		if (memberId == null || memberId == 0) {
			// 遍历所有数据源找到该数据直到找到
			for (Integer datasourceKey : DataSourceKeys.getDataSourceKeyList()) {
				DynamicDataSourceContextHolder.setDataSourceType(datasourceKey);
				memberId = findInOrderInn(orderCode);
				//如果找到了
				if (memberId != null && memberId > 0) {
					// 加入缓存
//					cacheOrderCodeMemberIdMap(orderCode, memberId);
					return memberId;
				}
			}
		}
		return memberId;
	}
	
	/**
	 * @param memberId
	 */
	public void selectDatasourceByMemberId(Integer memberId) {
		int num = memberId % DataSourceKeys.getDataSourceKeyList().size();
		DynamicDataSourceContextHolder.setDataSourceType(DataSourceKeys.getDataSourceKeyList().get(num));
	}
	
	/**
	 * 缓存orderCode和MemberId的映射关系
	 * 
	 * @param orderCode
	 * @param memberId
	 */
	private void cacheOrderCodeMemberIdMap(String orderCode, Integer memberId) {
		RedisHelper.hset("orderCodeMemberIdMap", orderCode, memberId, 5184000);
	}
	
	/**
	 * 在OrderInn表里找orderCode对应的memberId
	 * 
	 * @param orderCode
	 * @param datasource
	 * @return
	 */
	private Integer findInOrderInn(String orderCode) {
		GsOrderInn model = new GsOrderInn();
		model.setOrderCode(orderCode);
		GsOrderInn orderInn = gsOrderInnMapper.getBkMebIdByOrderCode(model);
		if(orderInn!=null){
			Integer memberId = orderInn.getBkMebId();
			if (memberId != null && memberId > 0) {
				return memberId;
			}
		}
		return null;
	}
	
	/**
	 * 将javabean实体类转为map类型，然后返回一个map类型的值
	 * @param obj
	 * @return
	 */
    public static Map<String, Object> beanToMap(Object obj) { 
        Map<String, Object> params = new HashMap<String, Object>(0); 
        try { 
            PropertyUtilsBean propertyUtilsBean = new PropertyUtilsBean(); 
            PropertyDescriptor[] descriptors = propertyUtilsBean.getPropertyDescriptors(obj); 
            for (int i = 0; i < descriptors.length; i++) { 
                String name = descriptors[i].getName(); 
                if (!"class".equals(name)) { 
                    params.put(name, propertyUtilsBean.getNestedProperty(obj, name)); 
                } 
            } 
        } catch (Exception e) { 
            e.printStackTrace(); 
        } 
        return params; 
    }
}
