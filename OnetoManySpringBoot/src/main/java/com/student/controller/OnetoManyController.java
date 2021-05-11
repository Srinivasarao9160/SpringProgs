package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.dao.LaptopsDao;
import com.student.dao.StudentDao;
import com.student.dto.DetailsRequest;
import com.student.entity.Student;


@RestController
public class OnetoManyController {
	@Autowired
	private StudentDao studentdao;
	@Autowired
	private LaptopsDao laptopdao;
	
	@PostMapping("/addstudent")
	public Student aboutStudent(@RequestBody DetailsRequest request) {
		return studentdao.save(request.getStud());
		}
	@GetMapping("/allstudents")
	public List<Student> findAllstudent(){
		return studentdao.findAll();
	}

}
