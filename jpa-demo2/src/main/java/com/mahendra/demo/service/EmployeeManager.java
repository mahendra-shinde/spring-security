package com.mahendra.demo.service;

import java.util.List;

import com.mahendra.demo.model.DepartmentEntity;
import com.mahendra.demo.model.EmployeeEntity;


public interface EmployeeManager 
{
	public List<EmployeeEntity> getAllEmployees();
	public List<DepartmentEntity> getAllDepartments();
	public void addEmployee(EmployeeEntity employee);
}
