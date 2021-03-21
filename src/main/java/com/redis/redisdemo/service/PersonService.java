package com.redis.redisdemo.service;

public interface PersonService {
	
	public void setPersonAsString(String key, String person);
	
	public String getPersonAsString(String key);

}
