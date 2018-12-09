package com.springbootWithRedisHash.springredispoc;

import redis.clients.jedis.Jedis;

public class RedisConnection {
	
	private static final Integer redisPort = 6379;
	private static Jedis jedis;
	
	public static Jedis getConnection(Integer dbNumber){
		
		if (jedis == null) {
			jedis = new Jedis("localhost", redisPort);
			jedis.select(dbNumber);
		} else {
			jedis.select(dbNumber);
		}
		return jedis;
		
	}

}
