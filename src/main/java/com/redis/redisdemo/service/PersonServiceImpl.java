package com.redis.redisdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.redis.redisdemo.repository.PersonRepository;

@Component
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	private PersonRepository personRepository;

	@Override
	public void setPersonAsString(String key, String person) {
		personRepository.setPersonAsString(key, person);
		
	}

	@Override
	public String getPersonAsString(String key) {
		return personRepository.getPersonAsString(key);
	}

}
