//package com.plateno.booking.config;
//
//import java.util.HashSet;
//import java.util.Set;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
//import org.springframework.boot.context.properties.EnableConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import redis.clients.jedis.HostAndPort;
//import redis.clients.jedis.JedisCluster;
//
///**
//* @author zhenhua.chun 
//* @version 2017年1月19日 下午2:45:34
//* @Description
//*/
//@Configuration
//@ConditionalOnClass({JedisCluster.class})
//@EnableConfigurationProperties(RedisProperties.class)
//public class JedisClusterConfig {
//
//    @Autowired
//    private RedisProperties redisProperties;
//
//    @Bean
//    public JedisCluster jedisCluster() {
//        String[] serverArray = redisProperties.getClusterNodes().split(",");
//        Set<HostAndPort> nodes = new HashSet<>();
//        for (String ipPort: serverArray) {
//            String[] ipPortPair = ipPort.split(":");
//            nodes.add(new HostAndPort(ipPortPair[0].trim(),Integer.valueOf(ipPortPair[1].trim())));
//        }
//        return new JedisCluster(nodes, redisProperties.getCommandTimeout());
//    }
//}
