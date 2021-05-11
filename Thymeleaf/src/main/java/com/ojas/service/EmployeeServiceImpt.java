package com.ojas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.dao.EmployeeDao;
import com.ojas.model.Employee;
@Service
public class EmployeeServiceImpt implements EmployeeService{
	@Autowired
	private EmployeeDao empdao;

	@Override
	public List<Employee> findAll() {

		return empdao.findAll();
	}

	@Override
	public void save(Employee themployee) {

		empdao.save(themployee);
		
	}

	@Override
	public void deleteById(Integer eid) {

		empdao.deleteById(eid);
		
	}
	

}
