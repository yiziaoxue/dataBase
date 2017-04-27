//package com.plateno.booking.config;
//
//import org.springframework.dao.DataAccessException;
//import org.springframework.data.redis.connection.RedisConnection;
//import org.springframework.data.redis.core.RedisCallback;
//import org.springframework.data.redis.core.RedisTemplate;
//
//import com.plateno.booking.common.bean.ResultVo;
//import com.plateno.cache.RedisHelper;
//import com.plateno.cache.lock.LockCallback;
//
///**
//* @author zhenhua.chun 
//* @version 2017年1月19日 下午3:36:39
//* @Description
//*/
//public class BookingRedisHelper extends RedisHelper {
//	
//	public static <T> ResultVo<T> distributedLock(LockCallback<ResultVo<T>> action, String key, int expireSeconds, String errorCode, String errorMsg) {
//		if (setnx(key + "_disLockExec", "TRUE", Integer.valueOf(expireSeconds))) {
//			try {
//				ResultVo<T> t = action.exec();
//				ResultVo<T> localObject2 = t;
//				return localObject2;
//			} finally {
//				del(key + "_disLockExec");
//			}
//		}
//		ResultVo<T> resultVo = new ResultVo<T>();
//		resultVo.setResultCode(BookingRedisHelper.class, errorCode);
//		resultVo.setResultMsg(errorMsg);
//
//		return resultVo;
//	}
//	
//
//
//	public static Long incr(final String key, final Integer expireSeconds) {
//		RedisTemplate redisTemplate = getRedisTemplate();
//		Long count = (Long) redisTemplate.execute(new RedisCallback<Long>() {
//			public Long doInRedis(RedisConnection connection) throws DataAccessException {
//				try {
//					byte[] byteKey = RedisHelper.serialize(key);
//					connection.expire(byteKey, expireSeconds);
//					return connection.incr(byteKey);
//				} catch (Exception e) {
//					throw new RuntimeException(e);
//				}
//			}
//		}, true);
//
//		return count;
//	}
//	
//	public static Long decr(final String key, final Integer expireSeconds) {
//		RedisTemplate redisTemplate = getRedisTemplate();
//		Long count = (Long) redisTemplate.execute(new RedisCallback<Long>() {
//			public Long doInRedis(RedisConnection connection) throws DataAccessException {
//				try {
//					byte[] byteKey = RedisHelper.serialize(key);
//					connection.expire(byteKey, expireSeconds);
//					return connection.decr(byteKey);
//				} catch (Exception e) {
//					throw new RuntimeException(e);
//				}
//			}
//		}, true);
//		
//		return count;
//	}
//	
//	public static Long decr(final String key) {
//		RedisTemplate redisTemplate = getRedisTemplate();
//		Long count = (Long) redisTemplate.execute(new RedisCallback<Long>() {
//			public Long doInRedis(RedisConnection connection) throws DataAccessException {
//				try {
//					byte[] byteKey = RedisHelper.serialize(key);
//					return connection.decr(byteKey);
//				} catch (Exception e) {
//					throw new RuntimeException(e);
//				}
//			}
//		}, true);
//		
//		return count;
//	}
//	
//}
