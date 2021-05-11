package com.ojas.studentcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Test implements CommandLineRunner{

	@Autowired
	ConfigurableApplicationContext ctx = null;
	public static void main(String[] args) {
		SpringApplication.run(Test.class, args);
		}

	@Override
	public void run(String... args) throws Exception {
		Student s1 = ctx.getBean(Student.class);
		 s1.setSname("sri");
		 s1.setSno(1);
		 Course c1 = ctx.getBean(Course.class);
		 c1.setCname("java");
		 c1.setCprice(3400);
		 c1.setCid(100);
		 c1.setStud1(s1);
		 System.out.println(c1);
	}
	public  void test() {
		System.out.println("TestBook instated");
		
	}

}
