package com.ojas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext cac =SpringApplication.run(SpringDemoApplication.class, args);

		Hello h = (Hello) cac.getBean("myBean");
		System.out.println(h.getMessage());
		
//		Hello h = (Hello) cac.getBean("sri");
//		System.out.println(h.getMessage());

//		Hello h1 = (Hello) cac.getBean("sri");
//		System.out.println(h1.getMessage());
		disp();
	}

	public static void disp() {
		System.out.println("welcome");
	}
}
