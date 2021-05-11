package com.ojas.model;

public class Emp {

	int no;
	String name;
	double sal;

	Emp() {

	}

	public Emp(int no, String name, double sal) {
		super();
		this.no = no;
		this.name = name;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Emp [no=" + no + ", name=" + name + ", sal=" + sal + "]";
	}

}
