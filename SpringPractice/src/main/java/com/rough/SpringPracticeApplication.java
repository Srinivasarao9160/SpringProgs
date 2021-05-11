package com.rough;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.rough.entity.Course;
import com.rough.entity.Student;

@SpringBootApplication
public class SpringPracticeApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringPracticeApplication.class, args);

		Student s1 = ctx.getBean(Student.class);

		s1.setSid(1);
		s1.setSname("srinivas");

		Course c = ctx.getBean(Course.class);

		c.setCid(100);
		c.setCname("java");
		c.setPrice(200.0);
		c.setStud(s1);

	}
	public void SpringApplication() {
		System.out.println("test book instatied");
	}

}
