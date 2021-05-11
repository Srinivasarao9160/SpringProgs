package com.ojas.model;

public class Customer {

	private int cno;
	private String cname;
	private Address address;

	public Customer() {
		super();
	}

	public Customer(int cno, String cname, Address address) {
		super();
		this.cno = cno;
		this.cname = cname;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [cno=" + cno + ", cname=" + cname + ", address=" + address + "]";
	}

}
