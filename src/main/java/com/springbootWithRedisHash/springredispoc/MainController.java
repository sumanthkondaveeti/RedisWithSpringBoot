package com.springbootWithRedisHash.springredispoc;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import redis.clients.jedis.Jedis;

@RestController
public class MainController {

	@GetMapping("/healthcheck")
	public String healthCheck(){
		return "I am healthy";
	}
	
	@RequestMapping("/user/{name}")
	public String getName(@PathVariable String name){
		return "name is"+name;
	}
	
	@RequestMapping(value = "/Insertintoredis", method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<Response> insertIntoredis(@RequestBody MapUtil util){
		
		Response response = new Response(Response.OK, Response.NOOP);
		
		Jedis jedis = RedisConnection.getConnection(0);
		jedis.hmset(util.getKey(), util.getValue());
		jedis.expire(util.getKey(), 10000);
		
		jedis.close();
		
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
	
	@RequestMapping("/gethashmap/{key}")
	public ResponseEntity<Response> getHashmapfromredis(@PathVariable String key){
		
		Response response = new Response(Response.OK, Response.NOOP);
		
		Jedis jedis = RedisConnection.getConnection(0);
		response.setData(jedis.hgetAll(key));
		
		jedis.close();
		
		return ResponseEntity.status(HttpStatus.OK).body(response);
		
		
	}
}
