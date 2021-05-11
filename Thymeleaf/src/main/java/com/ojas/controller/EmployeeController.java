package com.ojas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ojas.model.Employee;
import com.ojas.service.EmployeeService;

@Controller
@RequestMapping("/emps")
public class EmployeeController {
	@Autowired
	private EmployeeService empservice;
	@RequestMapping("/reg")
	public String rePage(ModelMap map) {
		Employee e = new Employee();
		map.addAttribute("employee", e);
		return "Register";
	}
	@PostMapping("/save")
	public String addEmployee(@ModelAttribute Employee employee,ModelMap map) {
		empservice.save(employee);
		map.addAttribute("emp",employee);
		return "info";
	}
	@GetMapping("/all")
	public String showDates(ModelMap map) {
		map.addAttribute("message","Hello ui");
		List<Employee> emps = empservice.findAll();
		map.addAttribute("list",emps);
		return "Data";
	}
	
	
	
	
	
	
	

}
