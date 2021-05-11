package com.onetoone;

import java.util.List;

import javax.transaction.Transactional;

import org.apache.catalina.authenticator.SavedRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.onetoone.dao.LaptopDao;
import com.onetoone.dao.StudentDao;
import com.onetoone.model.Laptop;
import com.onetoone.model.Student;

@SpringBootApplication
@EnableTransactionManagement
public class OnetoOneUsingSpringBootApplication implements CommandLineRunner {
	@Autowired
	private LaptopDao laptopdao;
	@Autowired
	private StudentDao studentdao;
	
	public static void main(String[] args) {
		SpringApplication.run(OnetoOneUsingSpringBootApplication.class, args);
		System.out.println("welcome");
	}
	

	@Transactional
	private void saveData() {
		Laptop laptop1 = new Laptop(3,"lenova");
		laptopdao.save(laptop1);
		
		Student stud1 = new Student(1,"venu",34,laptop1);
		studentdao.save(stud1);
		System.out.println("inserted");
	}
	@Transactional
	private void showDate() {
		List<Laptop> laptops = laptopdao.findAll();
		List<Student> students = studentdao.findAll();
		System.out.println("====students=====");
		
		students.forEach(System.out::println);
		System.out.println("=====laptop====");
		laptops.forEach(System.out::println);
		
	}


	@Override
	public void run(String... args) throws Exception {
		saveData();
		
	}
	

}
