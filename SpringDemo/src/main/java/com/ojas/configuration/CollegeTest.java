package com.ojas.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CollegeTest implements CommandLineRunner {

	@Autowired
	ApplicationContext ctx ;
	public static void main(String[] args) {

		SpringApplication.run(CollegeTest.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {

		CollegeConfig ci = ctx.getBean(CollegeConfig.class);
		ci.collegeBean().test();
		
	}

}
