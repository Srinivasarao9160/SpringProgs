package com.ojas.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ojas.Hello;

@Configuration
public class MyconfigDemo {
@Bean(name="myBean")
public  Hello getHello() {
	return new Hello();
	
}
}
