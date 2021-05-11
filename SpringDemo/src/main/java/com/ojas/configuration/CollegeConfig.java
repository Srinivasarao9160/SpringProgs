package com.ojas.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.ojas.college.College;

@Configuration
@ComponentScan(basePackages ="com.ojas.college")
public class CollegeConfig {
	@Bean
	public College collegeBean() {
		System.out.println("hello bean");
		return new College();
	}

}
