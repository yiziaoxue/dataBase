package com.plateno.booking.config;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
* @author zhenhua.chun 
* @version 2016年12月16日 下午12:59:36
* @Description 动态数据源上下文.
*/
public class DynamicDataSourceContextHolder {
	public static Logger log = LoggerFactory.getLogger(DynamicDataSourceContextHolder.class);
    /*
     * 当使用ThreadLocal维护变量时，ThreadLocal为每个使用该变量的线程提供独立的变量副本，
     * 所以每一个线程都可以独立地改变自己的副本，而不会影响其它线程所对应的副本。
     */
	private static final ThreadLocal<ThreadHolder> contextHolder = new ThreadLocal<ThreadHolder>() {  
        public ThreadHolder initialValue() {  
            return new ThreadHolder();  
        }  
    };  
    /*
     * 管理所有的数据源id;
     * 主要是为了判断数据源是否存在;
     */
    public static List<Integer> dataSourceIds = new ArrayList<Integer>();
 
    /**
     * 使用setDataSourceType设置当前的
     * @param dataSourceType
     */
    public static void setDataSourceType(int dataSourceType) {
        ThreadHolder threadHolder = contextHolder.get();
	    threadHolder.setDataSourceType(dataSourceType);
        contextHolder.set(threadHolder);
    } 
 
    public static Integer getDataSourceType() {
    	ThreadHolder threadHolder = contextHolder.get();
       return threadHolder.getDataSourceType();
    }
 
    public static void clearDataSourceType() {
       contextHolder.remove();
    }
   
    /**
     * 判断指定DataSrouce当前是否存在
     *
     * @param dataSourceId
     * @return
     * @author SHANHY
     * @create  2016年1月24日
     */
    public static boolean containsDataSource(int dataSourceId){
        return dataSourceIds.contains(dataSourceId);
    }
}