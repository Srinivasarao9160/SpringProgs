package com.ojas;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ojas.model.Emp1;

public class Emp1Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("emp1context.xml");
		Emp1 emp =  (Emp1) ctx.getBean("empobj");
		System.out.println(emp);
	}

}

