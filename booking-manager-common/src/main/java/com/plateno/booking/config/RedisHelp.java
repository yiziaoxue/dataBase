//package com.plateno.booking.config;
//
//import java.util.List;
//import java.util.Map;
//import java.util.Map.Entry;
//import java.util.Set;
//
//import org.springframework.beans.factory.annotation.Autowired;
//
//import redis.clients.jedis.BinaryClient.LIST_POSITION;
//import redis.clients.jedis.DebugParams;
//import redis.clients.jedis.JedisCluster;
//import redis.clients.jedis.JedisPool;
//import redis.clients.jedis.ScanResult;
//import redis.clients.jedis.SortingParams;
//import redis.clients.jedis.Tuple;
//
///**
//* @author zhenhua.chun 
//* @version 2017年1月19日 下午3:03:14
//* @Description
//*/
//public class RedisHelp{
//	
//	@Autowired
//    private static JedisCluster jedisCluster;
//	
//	 
//	public static Long append(String key, String value) {
//		// TODO Auto-generated method stub
//		return jedisCluster.append(key, value);
//	}
//
//	 
//	public static String auth(String password) {
//		// TODO Auto-generated method stub
//		return jedisCluster.auth(password);
//	}
//
//	 
//	public static String bgrewriteaof() {
//		// TODO Auto-generated method stub
//		return jedisCluster.bgrewriteaof();
//	}
//
//	 
//	public static String bgsave() {
//		// TODO Auto-generated method stub
//		return jedisCluster.bgsave();
//	}
//
//	 
//	public static Long bitcount(String key, long start, long end) {
//		// TODO Auto-generated method stub
//		return jedisCluster.bitcount(key, start, end);
//	}
//
//	 
//	public static Long bitcount(String key) {
//		// TODO Auto-generated method stub
//		return jedisCluster.bitcount(key);
//	}
//
//	 
//	public static List<String> blpop(int timeout, String key) {
//		// TODO Auto-generated method stub
//		return jedisCluster.blpop(timeout, key);
//	}
//
//	 
//	public static List<String> blpop(String arg) {
//		// TODO Auto-generated method stub
//		return jedisCluster.blpop(arg);
//	}
//
//	 
//	public static List<String> brpop(int timeout, String key) {
//		// TODO Auto-generated method stub
//		return jedisCluster.brpop(timeout, key);
//	}
//
//	 
//	public static List<String> brpop(String arg) {
//		// TODO Auto-generated method stub
//		return jedisCluster.brpop(arg);
//	}
//
//	 
//	public static void close() {
//		// TODO Auto-generated method stub
//		jedisCluster.close();
//	}
//
//	 
//	public static String configResetStat() {
//		// TODO Auto-generated method stub
//		return jedisCluster.configResetStat();
//	}
//
//	 
//	public static Long dbSize() {
//		// TODO Auto-generated method stub
//		return jedisCluster.dbSize();
//	}
//
//	 
//	public static String debug(DebugParams params) {
//		// TODO Auto-generated method stub
//		return jedisCluster.debug(params);
//	}
//
//	 
//	public static Long decr(String key) {
//		// TODO Auto-generated method stub
//		return jedisCluster.decr(key);
//	}
//
//	 
//	public static Long decrBy(String key, long integer) {
//		// TODO Auto-generated method stub
//		return jedisCluster.decrBy(key, integer);
//	}
//
//	 
//	public static Long del(String key) {
//		// TODO Auto-generated method stub
//		return jedisCluster.del(key);
//	}
//
//	 
//	public static String echo(String string) {
//		// TODO Auto-generated method stub
//		return jedisCluster.echo(string);
//	}
//
//	 
//	public static Boolean exists(String key) {
//		// TODO Auto-generated method stub
//		return jedisCluster.exists(key);
//	}
//
//	 
//	public static Long expire(String key, int seconds) {
//		// TODO Auto-generated method stub
//		return jedisCluster.expire(key, seconds);
//	}
//
//	 
//	public static Long expireAt(String key, long unixTime) {
//		// TODO Auto-generated method stub
//		return jedisCluster.expireAt(key, unixTime);
//	}
//
//	 
//	public static String flushAll() {
//		// TODO Auto-generated method stub
//		return jedisCluster.flushAll();
//	}
//
//	 
//	public static String flushDB() {
//		// TODO Auto-generated method stub
//		return jedisCluster.flushDB();
//	}
//
//	 
//	public static String get(String key) {
//		// TODO Auto-generated method stub
//		return jedisCluster.get(key);
//	}
//
//	 
//	public static Map<String, JedisPool> getClusterNodes() {
//		// TODO Auto-generated method stub
//		return jedisCluster.getClusterNodes();
//	}
//
//	 
//	public static Long getDB() {
//		// TODO Auto-generated method stub
//		return jedisCluster.getDB();
//	}
//
//	 
//	public static String getSet(String key, String value) {
//		// TODO Auto-generated method stub
//		return jedisCluster.getSet(key, value);
//	}
//
//	 
//	public static Boolean getbit(String key, long offset) {
//		// TODO Auto-generated method stub
//		return jedisCluster.getbit(key, offset);
//	}
//
//	 
//	public static String getrange(String key, long startOffset, long endOffset) {
//		// TODO Auto-generated method stub
//		return jedisCluster.getrange(key, startOffset, endOffset);
//	}
//
//	 
//	public static Long hdel(String key, String... field) {
//		// TODO Auto-generated method stub
//		return jedisCluster.hdel(key, field);
//	}
//
//	 
//	public static Boolean hexists(String key, String field) {
//		// TODO Auto-generated method stub
//		return jedisCluster.hexists(key, field);
//	}
//
//	 
//	public static String hget(String key, String field) {
//		// TODO Auto-generated method stub
//		return jedisCluster.hget(key, field);
//	}
//
//	 
//	public static Map<String, String> hgetAll(String key) {
//		// TODO Auto-generated method stub
//		return jedisCluster.hgetAll(key);
//	}
//
//	 
//	public static Long hincrBy(String key, String field, long value) {
//		// TODO Auto-generated method stub
//		return jedisCluster.hincrBy(key, field, value);
//	}
//
//	 
//	public static Set<String> hkeys(String key) {
//		// TODO Auto-generated method stub
//		return jedisCluster.hkeys(key);
//	}
//
//	 
//	public static Long hlen(String key) {
//		// TODO Auto-generated method stub
//		return jedisCluster.hlen(key);
//	}
//
//	 
//	public static List<String> hmget(String key, String... fields) {
//		// TODO Auto-generated method stub
//		return jedisCluster.hmget(key, fields);
//	}
//
//	 
//	public static String hmset(String key, Map<String, String> hash) {
//		// TODO Auto-generated method stub
//		return jedisCluster.hmset(key, hash);
//	}
//
//	 
//	public static ScanResult<Entry<String, String>> hscan(String key, int cursor) {
//		// TODO Auto-generated method stub
//		return jedisCluster.hscan(key, cursor);
//	}
//
//	 
//	public static ScanResult<Entry<String, String>> hscan(String key, String cursor) {
//		// TODO Auto-generated method stub
//		return jedisCluster.hscan(key, cursor);
//	}
//
//	 
//	public static Long hset(String key, String field, String value) {
//		// TODO Auto-generated method stub
//		return jedisCluster.hset(key, field, value);
//	}
//
//	 
//	public static Long hsetnx(String key, String field, String value) {
//		// TODO Auto-generated method stub
//		return jedisCluster.hsetnx(key, field, value);
//	}
//
//	 
//	public static List<String> hvals(String key) {
//		// TODO Auto-generated method stub
//		return jedisCluster.hvals(key);
//	}
//
//	 
//	public static Long incr(String key) {
//		// TODO Auto-generated method stub
//		return jedisCluster.incr(key);
//	}
//
//	 
//	public static Long incrBy(String key, long integer) {
//		// TODO Auto-generated method stub
//		return jedisCluster.incrBy(key, integer);
//	}
//
//	 
//	public static Double incrByFloat(String key, double value) {
//		// TODO Auto-generated method stub
//		return jedisCluster.incrByFloat(key, value);
//	}
//
//	 
//	public static String info() {
//		// TODO Auto-generated method stub
//		return jedisCluster.info();
//	}
//
//	 
//	public static String info(String section) {
//		// TODO Auto-generated method stub
//		return jedisCluster.info(section);
//	}
//
//	 
//	public static Long lastsave() {
//		// TODO Auto-generated method stub
//		return jedisCluster.lastsave();
//	}
//
//	 
//	public static String lindex(String key, long index) {
//		// TODO Auto-generated method stub
//		return jedisCluster.lindex(key, index);
//	}
//
//	 
//	public static Long linsert(String key, LIST_POSITION where, String pivot, String value) {
//		// TODO Auto-generated method stub
//		return jedisCluster.linsert(key, where, pivot, value);
//	}
//
//	 
//	public static Long llen(String key) {
//		// TODO Auto-generated method stub
//		return jedisCluster.llen(key);
//	}
//
//	 
//	public static String lpop(String key) {
//		// TODO Auto-generated method stub
//		return jedisCluster.lpop(key);
//	}
//
//	 
//	public static Long lpush(String key, String... string) {
//		// TODO Auto-generated method stub
//		return jedisCluster.lpush(key, string);
//	}
//
//	 
//	public static Long lpushx(String key, String... string) {
//		// TODO Auto-generated method stub
//		return jedisCluster.lpushx(key, string);
//	}
//
//	 
//	public static List<String> lrange(String key, long start, long end) {
//		// TODO Auto-generated method stub
//		return jedisCluster.lrange(key, start, end);
//	}
//
//	 
//	public static Long lrem(String key, long count, String value) {
//		// TODO Auto-generated method stub
//		return jedisCluster.lrem(key, count, value);
//	}
//
//	 
//	public static String lset(String key, long index, String value) {
//		// TODO Auto-generated method stub
//		return jedisCluster.lset(key, index, value);
//	}
//
//	 
//	public static String ltrim(String key, long start, long end) {
//		// TODO Auto-generated method stub
//		return jedisCluster.ltrim(key, start, end);
//	}
//
//	 
//	public static Long move(String key, int dbIndex) {
//		// TODO Auto-generated method stub
//		return jedisCluster.move(key, dbIndex);
//	}
//
//	 
//	public static Long persist(String key) {
//		// TODO Auto-generated method stub
//		return jedisCluster.persist(key);
//	}
//
//	 
//	public static Long pexpire(String key, long milliseconds) {
//		// TODO Auto-generated method stub
//		return jedisCluster.pexpire(key, milliseconds);
//	}
//
//	 
//	public static Long pexpireAt(String key, long millisecondsTimestamp) {
//		// TODO Auto-generated method stub
//		return jedisCluster.pexpireAt(key, millisecondsTimestamp);
//	}
//
//	 
//	public static Long pfadd(String key, String... elements) {
//		// TODO Auto-generated method stub
//		return jedisCluster.pfadd(key, elements);
//	}
//
//	 
//	public static long pfcount(String key) {
//		// TODO Auto-generated method stub
//		return jedisCluster.pfcount(key);
//	}
//
//	 
//	public static String ping() {
//		// TODO Auto-generated method stub
//		return jedisCluster.ping();
//	}
//
//	 
//	public static String quit() {
//		// TODO Auto-generated method stub
//		return jedisCluster.quit();
//	}
//
//	 
//	public static String rpop(String key) {
//		// TODO Auto-generated method stub
//		return jedisCluster.rpop(key);
//	}
//
//	 
//	public static Long rpush(String key, String... string) {
//		// TODO Auto-generated method stub
//		return jedisCluster.rpush(key, string);
//	}
//
//	 
//	public static Long rpushx(String key, String... string) {
//		// TODO Auto-generated method stub
//		return jedisCluster.rpushx(key, string);
//	}
//
//	 
//	public static Long sadd(String key, String... member) {
//		// TODO Auto-generated method stub
//		return jedisCluster.sadd(key, member);
//	}
//
//	 
//	public static String save() {
//		// TODO Auto-generated method stub
//		return jedisCluster.save();
//	}
//
//	 
//	public static Long scard(String key) {
//		// TODO Auto-generated method stub
//		return jedisCluster.scard(key);
//	}
//
//	 
//	public static String select(int index) {
//		// TODO Auto-generated method stub
//		return jedisCluster.select(index);
//	}
//
//	 
//	public static String set(String key, String value, String nxxx, String expx, long time) {
//		// TODO Auto-generated method stub
//		return jedisCluster.set(key, value, nxxx, expx, time);
//	}
//
//	 
//	public static String set(String key, String value) {
//		// TODO Auto-generated method stub
//		return jedisCluster.set(key, value);
//	}
//
//	 
//	public static Boolean setbit(String key, long offset, boolean value) {
//		// TODO Auto-generated method stub
//		return jedisCluster.setbit(key, offset, value);
//	}
//
//	 
//	public static Boolean setbit(String key, long offset, String value) {
//		// TODO Auto-generated method stub
//		return jedisCluster.setbit(key, offset, value);
//	}
//
//	 
//	public static String setex(String key, int seconds, String value) {
//		// TODO Auto-generated method stub
//		return jedisCluster.setex(key, seconds, value);
//	}
//
//	 
//	public static Long setnx(String key, String value) {
//		// TODO Auto-generated method stub
//		return jedisCluster.setnx(key, value);
//	}
//
//	 
//	public static Long setrange(String key, long offset, String value) {
//		// TODO Auto-generated method stub
//		return jedisCluster.setrange(key, offset, value);
//	}
//
//	 
//	public static String shutdown() {
//		// TODO Auto-generated method stub
//		return jedisCluster.shutdown();
//	}
//
//	 
//	public static Boolean sismember(String key, String member) {
//		// TODO Auto-generated method stub
//		return jedisCluster.sismember(key, member);
//	}
//
//	 
//	public static String slaveof(String host, int port) {
//		// TODO Auto-generated method stub
//		return jedisCluster.slaveof(host, port);
//	}
//
//	 
//	public static String slaveofNoOne() {
//		// TODO Auto-generated method stub
//		return jedisCluster.slaveofNoOne();
//	}
//
//	 
//	public static Set<String> smembers(String key) {
//		// TODO Auto-generated method stub
//		return jedisCluster.smembers(key);
//	}
//
//	 
//	public static List<String> sort(String key, SortingParams sortingParameters) {
//		// TODO Auto-generated method stub
//		return jedisCluster.sort(key, sortingParameters);
//	}
//
//	 
//	public static List<String> sort(String key) {
//		// TODO Auto-generated method stub
//		return jedisCluster.sort(key);
//	}
//
//	 
//	public static Set<String> spop(String key, long count) {
//		// TODO Auto-generated method stub
//		return jedisCluster.spop(key, count);
//	}
//
//	 
//	public static String spop(String key) {
//		// TODO Auto-generated method stub
//		return jedisCluster.spop(key);
//	}
//
//	 
//	public static List<String> srandmember(String key, int count) {
//		// TODO Auto-generated method stub
//		return jedisCluster.srandmember(key, count);
//	}
//
//	 
//	public static String srandmember(String key) {
//		// TODO Auto-generated method stub
//		return jedisCluster.srandmember(key);
//	}
//
//	 
//	public static Long srem(String key, String... member) {
//		// TODO Auto-generated method stub
//		return jedisCluster.srem(key, member);
//	}
//
//	 
//	public static ScanResult<String> sscan(String key, int cursor) {
//		// TODO Auto-generated method stub
//		return jedisCluster.sscan(key, cursor);
//	}
//
//	 
//	public static ScanResult<String> sscan(String key, String cursor) {
//		// TODO Auto-generated method stub
//		return jedisCluster.sscan(key, cursor);
//	}
//
//	 
//	public static Long strlen(String key) {
//		// TODO Auto-generated method stub
//		return jedisCluster.strlen(key);
//	}
//
//	 
//	public static String substr(String key, int start, int end) {
//		// TODO Auto-generated method stub
//		return jedisCluster.substr(key, start, end);
//	}
//
//	 
//	public static Long ttl(String key) {
//		// TODO Auto-generated method stub
//		return jedisCluster.ttl(key);
//	}
//
//	 
//	public static String type(String key) {
//		// TODO Auto-generated method stub
//		return jedisCluster.type(key);
//	}
//
//	 
//	public static Long waitReplicas(int replicas, long timeout) {
//		// TODO Auto-generated method stub
//		return jedisCluster.waitReplicas(replicas, timeout);
//	}
//
//	 
//	public static Long zadd(String key, double score, String member) {
//		// TODO Auto-generated method stub
//		return jedisCluster.zadd(key, score, member);
//	}
//
//	 
//	public static Long zadd(String key, Map<String, Double> scoreMembers) {
//		// TODO Auto-generated method stub
//		return jedisCluster.zadd(key, scoreMembers);
//	}
//
//	 
//	public static Long zcard(String key) {
//		// TODO Auto-generated method stub
//		return jedisCluster.zcard(key);
//	}
//
//	 
//	public static Long zcount(String key, double min, double max) {
//		// TODO Auto-generated method stub
//		return jedisCluster.zcount(key, min, max);
//	}
//
//	 
//	public static Long zcount(String key, String min, String max) {
//		// TODO Auto-generated method stub
//		return jedisCluster.zcount(key, min, max);
//	}
//
//	 
//	public static Double zincrby(String key, double score, String member) {
//		// TODO Auto-generated method stub
//		return jedisCluster.zincrby(key, score, member);
//	}
//
//	 
//	public static Long zlexcount(String key, String min, String max) {
//		// TODO Auto-generated method stub
//		return jedisCluster.zlexcount(key, min, max);
//	}
//
//	 
//	public static Set<String> zrange(String key, long start, long end) {
//		// TODO Auto-generated method stub
//		return jedisCluster.zrange(key, start, end);
//	}
//
//	 
//	public static Set<String> zrangeByLex(String key, String min, String max, int offset, int count) {
//		// TODO Auto-generated method stub
//		return jedisCluster.zrangeByLex(key, min, max, offset, count);
//	}
//
//	 
//	public static Set<String> zrangeByLex(String key, String min, String max) {
//		// TODO Auto-generated method stub
//		return jedisCluster.zrangeByLex(key, min, max);
//	}
//
//	 
//	public static Set<String> zrangeByScore(String key, double min, double max, int offset, int count) {
//		// TODO Auto-generated method stub
//		return jedisCluster.zrangeByScore(key, min, max, offset, count);
//	}
//
//	 
//	public static Set<String> zrangeByScore(String key, double min, double max) {
//		// TODO Auto-generated method stub
//		return jedisCluster.zrangeByScore(key, min, max);
//	}
//
//	 
//	public static Set<String> zrangeByScore(String key, String min, String max, int offset, int count) {
//		// TODO Auto-generated method stub
//		return jedisCluster.zrangeByScore(key, min, max, offset, count);
//	}
//
//	 
//	public static Set<String> zrangeByScore(String key, String min, String max) {
//		// TODO Auto-generated method stub
//		return jedisCluster.zrangeByScore(key, min, max);
//	}
//
//	 
//	public static Set<Tuple> zrangeByScoreWithScores(String key, double min, double max, int offset, int count) {
//		// TODO Auto-generated method stub
//		return jedisCluster.zrangeByScoreWithScores(key, min, max, offset, count);
//	}
//
//	 
//	public static Set<Tuple> zrangeByScoreWithScores(String key, double min, double max) {
//		// TODO Auto-generated method stub
//		return jedisCluster.zrangeByScoreWithScores(key, min, max);
//	}
//
//	 
//	public static Set<Tuple> zrangeByScoreWithScores(String key, String min, String max, int offset, int count) {
//		// TODO Auto-generated method stub
//		return jedisCluster.zrangeByScoreWithScores(key, min, max, offset, count);
//	}
//
//	 
//	public static Set<Tuple> zrangeByScoreWithScores(String key, String min, String max) {
//		// TODO Auto-generated method stub
//		return jedisCluster.zrangeByScoreWithScores(key, min, max);
//	}
//
//	 
//	public static Set<Tuple> zrangeWithScores(String key, long start, long end) {
//		// TODO Auto-generated method stub
//		return jedisCluster.zrangeWithScores(key, start, end);
//	}
//
//	 
//	public static Long zrank(String key, String member) {
//		// TODO Auto-generated method stub
//		return jedisCluster.zrank(key, member);
//	}
//
//	 
//	public static Long zrem(String key, String... member) {
//		// TODO Auto-generated method stub
//		return jedisCluster.zrem(key, member);
//	}
//
//	 
//	public static Long zremrangeByLex(String key, String min, String max) {
//		// TODO Auto-generated method stub
//		return jedisCluster.zremrangeByLex(key, min, max);
//	}
//
//	 
//	public static Long zremrangeByRank(String key, long start, long end) {
//		// TODO Auto-generated method stub
//		return jedisCluster.zremrangeByRank(key, start, end);
//	}
//
//	 
//	public static Long zremrangeByScore(String key, double start, double end) {
//		// TODO Auto-generated method stub
//		return jedisCluster.zremrangeByScore(key, start, end);
//	}
//
//	 
//	public static Long zremrangeByScore(String key, String start, String end) {
//		// TODO Auto-generated method stub
//		return jedisCluster.zremrangeByScore(key, start, end);
//	}
//
//	 
//	public static Set<String> zrevrange(String key, long start, long end) {
//		// TODO Auto-generated method stub
//		return jedisCluster.zrevrange(key, start, end);
//	}
//
//	 
//	public static Set<String> zrevrangeByLex(String key, String max, String min, int offset, int count) {
//		// TODO Auto-generated method stub
//		return jedisCluster.zrevrangeByLex(key, max, min, offset, count);
//	}
//
//	 
//	public static Set<String> zrevrangeByLex(String key, String max, String min) {
//		// TODO Auto-generated method stub
//		return jedisCluster.zrevrangeByLex(key, max, min);
//	}
//
//	 
//	public static Set<String> zrevrangeByScore(String key, double max, double min, int offset, int count) {
//		// TODO Auto-generated method stub
//		return jedisCluster.zrevrangeByScore(key, max, min, offset, count);
//	}
//
//	 
//	public static Set<String> zrevrangeByScore(String key, double max, double min) {
//		// TODO Auto-generated method stub
//		return jedisCluster.zrevrangeByScore(key, max, min);
//	}
//
//	 
//	public static Set<String> zrevrangeByScore(String key, String max, String min, int offset, int count) {
//		// TODO Auto-generated method stub
//		return jedisCluster.zrevrangeByScore(key, max, min, offset, count);
//	}
//
//	 
//	public static Set<String> zrevrangeByScore(String key, String max, String min) {
//		// TODO Auto-generated method stub
//		return jedisCluster.zrevrangeByScore(key, max, min);
//	}
//
//	 
//	public static Set<Tuple> zrevrangeByScoreWithScores(String key, double max, double min, int offset, int count) {
//		// TODO Auto-generated method stub
//		return jedisCluster.zrevrangeByScoreWithScores(key, max, min, offset, count);
//	}
//
//	 
//	public static Set<Tuple> zrevrangeByScoreWithScores(String key, double max, double min) {
//		// TODO Auto-generated method stub
//		return jedisCluster.zrevrangeByScoreWithScores(key, max, min);
//	}
//
//	 
//	public static Set<Tuple> zrevrangeByScoreWithScores(String key, String max, String min, int offset, int count) {
//		// TODO Auto-generated method stub
//		return jedisCluster.zrevrangeByScoreWithScores(key, max, min, offset, count);
//	}
//
//	 
//	public static Set<Tuple> zrevrangeByScoreWithScores(String key, String max, String min) {
//		// TODO Auto-generated method stub
//		return jedisCluster.zrevrangeByScoreWithScores(key, max, min);
//	}
//
//	 
//	public static Set<Tuple> zrevrangeWithScores(String key, long start, long end) {
//		// TODO Auto-generated method stub
//		return jedisCluster.zrevrangeWithScores(key, start, end);
//	}
//
//	 
//	public static Long zrevrank(String key, String member) {
//		// TODO Auto-generated method stub
//		return jedisCluster.zrevrank(key, member);
//	}
//
//	 
//	public static ScanResult<Tuple> zscan(String key, int cursor) {
//		// TODO Auto-generated method stub
//		return jedisCluster.zscan(key, cursor);
//	}
//
//	 
//	public static ScanResult<Tuple> zscan(String key, String cursor) {
//		// TODO Auto-generated method stub
//		return jedisCluster.zscan(key, cursor);
//	}
//
//	 
//	public static Double zscore(String key, String member) {
//		// TODO Auto-generated method stub
//		return jedisCluster.zscore(key, member);
//	}
//
//}
