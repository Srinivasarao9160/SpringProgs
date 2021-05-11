package com.ojas;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ojas.model.Sample;

public class AppTest {
	
	public static void main( String[] args )
	{
	AbstractApplicationContext ac = new ClassPathXmlApplicationContext("applicationContent.xml");
	Sample s = (Sample)ac.getBean("sampleObj");
	s.display();
	Sample s1 = (Sample)ac.getBean("sampleObj");
	s1.display();
	ac.registerShutdownHook();
	}
	}

