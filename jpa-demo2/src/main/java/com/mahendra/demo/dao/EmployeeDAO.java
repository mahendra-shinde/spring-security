package com.mahendra.demo.dao;

import java.util.List;

import com.mahendra.demo.model.DepartmentEntity;
import com.mahendra.demo.model.EmployeeEntity;

public interface EmployeeDAO 
{
	public List<EmployeeEntity> getAllEmployees();
	public List<DepartmentEntity> getAllDepartments();
	public void addEmployee(EmployeeEntity employee);

	public void populateDepartments();
}