package com.ojas.model1;

public class Company {
	
	private String cname;
	private String clevel;
	private double salary;
	public Company() {
		super();
	}
	public Company(String cname, String clevel, double salary) {
		super();
		this.cname = cname;
		this.clevel = clevel;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Company [cname=" + cname + ", clevel=" + clevel + ", salary=" + salary + "]";
	}
	
	

}
