package com.journaldev.spring.mongodb.dao;

import java.util.List;

import com.journaldev.spring.mongodb.model.Person;

public interface PersonDAO {
	 void create(Person p);
	 Person readById(String id);
	 List<Person> getAllPersons();    
	 void update(Person p);
	 int deleteById(String id);
}
