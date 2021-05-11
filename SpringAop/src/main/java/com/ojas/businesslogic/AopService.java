package com.ojas.businesslogic;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AopService {
	@Pointcut("execution(public void com.ojas.businesslogic.BusinessLogic.saveEmployee())")
	public void p1() {

	}
	@AfterReturning("p1()")
	public void commit() {
		System.out.println("Tx commited");
	}
	
	public void commitAr() {
		System.out.println("AfterReturning");
	}

	@AfterThrowing(value = "p1()", throwing = "th")
	public void commitTh(Throwable th) {
		System.out.println("Ater Throeing Demo" + th.getMessage());
	}

	@Around("p1()")
	public void aroundDemo(ProceedingJoinPoint jp) {
		System.out.println("Befor business method");

		try {
			jp.proceed();
		} catch (Throwable e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("After bussiness method");
	}

}
