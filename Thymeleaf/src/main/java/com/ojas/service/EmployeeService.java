package com.ojas.service;

import java.util.List;

import com.ojas.model.Employee;

public interface EmployeeService  {
	public List<Employee> findAll();
	
	public void save(Employee themployee);
	public void deleteById(Integer eid);

}
