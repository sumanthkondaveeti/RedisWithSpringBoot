package com.springbootWithRedisHash.springredispoc;

import java.util.Map;

public class MapUtil {
	
	private String key;
	private Map<String, String> value;
	private int expiration;
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public Map<String, String> getValue() {
		return value;
	}
	public void setValue(Map<String, String> value) {
		this.value = value;
	}
	public int getExpiration() {
		return expiration;
	}
	public void setExpiration(int expiration) {
		this.expiration = expiration;
	}
	

}
