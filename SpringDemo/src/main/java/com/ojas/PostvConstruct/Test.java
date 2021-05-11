package com.ojas.PostvConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
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
		Student s = (Student)ctx.getBean("student");
		s.setSno(10);
		s.setSname("srinivas");
		System.out.println(s.getSno()+" "+s.getSname());

		
	}

}
