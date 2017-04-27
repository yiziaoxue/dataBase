package com.plateno.booking.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
* @author zhenhua.chun 
* @version 2016年12月16日 下午12:57:39
* @Description 在方法上使用，用于指定使用哪个数据源
*/
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TargetDataSource {
	
    String name() default "";
    
    String value() default "";
}
