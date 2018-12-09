package com.springbootWithRedisHash.springredispoc;

public class Response {
	
	public static final String NOOP = "NOOP"; // no operation has occured yet
	public static final String OK = "OK";
	public static final String ERROR = "ERROR";

	private String status;
	private Object data;

	public Response(String status, Object data) {
		super();
		this.status = status;
		this.data = data;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
