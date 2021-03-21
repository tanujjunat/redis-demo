package com.redis.redisdemo.repository;

public interface PersonRepository {
	
	public void setPersonAsString(String key, String person);
	
	public String getPersonAsString(String key);

}
