package com.mahendra.dao;

import java.util.List;

import com.mahendra.entities.Person;

public interface PersonDAO {
	public Long save(Person person);

	public List<Person> getAll();
}
