package com.mahendra.services;

import java.util.List;

import com.mahendra.entities.Person;

public interface PersonService {

	public Long save(Person person);
	public List<Person> getAll();
}
