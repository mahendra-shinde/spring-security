package com.mahendra.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mahendra.entities.Person;

@Repository
public class PersonDAOImpl implements PersonDAO{

  @PersistenceContext
  private EntityManager em;
  
  public Long save(Person person) {
    em.persist(person);
    return person.getId();
  }
  
  public List<Person>getAll() {
    return em.createQuery("SELECT p FROM Person p", Person.class).getResultList();
  }
  
}