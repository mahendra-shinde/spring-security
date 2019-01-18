package com.mahendra.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mahendra.dao.PersonDAO;
import com.mahendra.entities.Person;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired private PersonDAO dao;
	
	@Transactional
	public Long save(Person person) {
		return dao.save(person);
	}

	public List<Person> getAll() {
		return dao.getAll();
	}

}
