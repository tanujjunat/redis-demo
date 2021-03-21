package com.redis.redisdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.redis.redisdemo.dao.Person;
import com.redis.redisdemo.service.PersonService;

@RestController
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	@PostMapping("/person")
	public void addTopic(@RequestBody Person person) throws JsonProcessingException {
		
		ObjectMapper mapper = new ObjectMapper();
		personService.setPersonAsString(String.valueOf(person.getId()), 
				mapper.writeValueAsString(person));
		
	}
	
	@GetMapping("/person/{id}")
	public String addTopic(@PathVariable String id) throws JsonProcessingException {
		
		return personService.getPersonAsString(id);
		
	}

}
