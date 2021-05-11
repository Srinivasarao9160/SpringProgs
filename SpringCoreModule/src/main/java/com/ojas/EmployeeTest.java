package com.ojas;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ojas.model.Employee;

public class EmployeeTest {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("empcontext.xml");
		Employee emp = (Employee) ctx.getBean("empobj");
		System.out.println(emp);
	}

}
