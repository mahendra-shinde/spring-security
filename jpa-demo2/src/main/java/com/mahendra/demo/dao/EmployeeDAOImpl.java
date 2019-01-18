package com.mahendra.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mahendra.demo.model.DepartmentEntity;
import com.mahendra.demo.model.EmployeeEntity;

@Repository
@Transactional
public class EmployeeDAOImpl implements EmployeeDAO 
{
	
	@PersistenceContext
	private EntityManager manager;
	

	public void populateDepartments() {
		DepartmentEntity d1 = new DepartmentEntity();
		d1.setName("Accounts");
		manager.persist(d1);
	
		DepartmentEntity d2 = new DepartmentEntity();
		d2.setName("Sales");
		manager.persist(d2);		
	}

	public List<EmployeeEntity> getAllEmployees() 
	{
		List<EmployeeEntity> employees = manager.createQuery("Select a From EmployeeEntity a", EmployeeEntity.class).getResultList();
        return employees;
	}
	
	public List<DepartmentEntity> getAllDepartments() 
	{
		List<DepartmentEntity> depts = manager.createQuery("Select a From DepartmentEntity a", DepartmentEntity.class).getResultList();
        return depts;
	}
	
	public DepartmentEntity getDepartmentById(Integer id) 
	{
        return manager.find(DepartmentEntity.class, id);
	}
	
	public void addEmployee(EmployeeEntity employee) 
	{
		//Use null checks and handle them
		employee.setDepartment(getDepartmentById(employee.getDepartment().getId()));
		manager.persist(employee);
	}
	
}