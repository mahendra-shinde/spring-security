package com.mahendra.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mahendra.demo.dao.EmployeeDAO;
import com.mahendra.demo.model.DepartmentEntity;
import com.mahendra.demo.model.EmployeeEntity;


@Service
public class EmployeeManagerImpl implements EmployeeManager {

	EmployeeDAO dao;
	
	@Autowired
	public EmployeeManagerImpl(EmployeeDAO dao) {
		this.dao = dao;
		dao.populateDepartments();
	}
	
	public List<EmployeeEntity> getAllEmployees() {
		return dao.getAllEmployees();
	}

	public List<DepartmentEntity> getAllDepartments() {
		return dao.getAllDepartments();
	}

	public void addEmployee(EmployeeEntity employee) {
		dao.addEmployee(employee);
	}
}
