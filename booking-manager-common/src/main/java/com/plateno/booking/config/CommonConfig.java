package com.plateno.booking.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import com.plateno.booking.util.RedisHelp;

/**
* @author zhenhua.chun 
* @version 2017年1月6日 下午7:50:37
* @Description
*/
@Configuration
public class CommonConfig {
	
	private Logger log = LoggerFactory.getLogger(CommonConfig.class);
	
	@Autowired
	private RedisTemplate redisTemplate;
	
	@Bean
	public RedisHelp redisHelp(){
		RedisSerializer stringSerializer = new StringRedisSerializer();
	    redisTemplate.setKeySerializer(stringSerializer);
	    log.info("------------加载redis-------------");
	    return new RedisHelp(redisTemplate);
	}
}
