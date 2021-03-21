package com.redis.redisdemo.repository;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class PersonRepositoryImpl implements PersonRepository {
	
	@Autowired
	private RedisTemplate redisTemplate;
	

	@Override
	public void setPersonAsString(String key, String person) {
		redisTemplate.opsForValue().set(key, person);
		redisTemplate.expire(key, 10, TimeUnit.SECONDS);
		
	}

	@Override
	public String getPersonAsString(String key) {
		// TODO Auto-generated method stub
		return (String) redisTemplate.opsForValue().get(key);
	}

}
