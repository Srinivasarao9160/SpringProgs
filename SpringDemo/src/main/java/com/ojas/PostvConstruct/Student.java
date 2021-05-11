package com.ojas.PostvConstruct;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Student {
	private int sno;
	private String sname;
	
	public Student() {
		System.out.println("Default construct");
	}

	public Student(int sno, String sname) {
		super();
		this.sno = sno;
		this.sname = sname;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("init method invoked");
	}
	@PreDestroy
	public void destory() {
		System.out.println("Destory method invoked");
	}

}
