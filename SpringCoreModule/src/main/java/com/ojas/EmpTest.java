package com.ojas;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ojas.model.Emp;

public class EmpTest 
{
    public static void main( String[] args )
    {
        ApplicationContext ac = new ClassPathXmlApplicationContext("empconfig.xml");
        Emp e = (Emp)ac.getBean("emp");
        System.out.println(e);
    }
}
