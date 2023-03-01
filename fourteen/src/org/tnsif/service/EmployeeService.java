package org.tnsif.service;

import java.util.List;

import org.tnsif.entity.Employee;


public interface EmployeeService {
	public boolean addEmployee(Employee employee);
	public Employee updateEmployee(Employee employee);
	public boolean deleteEmployee(int userid);
	public Employee getEmployee(int userid);
	public List<Employee>getAll();

	
	

}
