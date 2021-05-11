package com.student.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Laptop_Info")
public class Laptops {
	@Id
	private int lid;
	private String lname;
	
	public Laptops() {
		super();
	}
	public Laptops(int lid, String lname) {
		super();
		this.lid = lid;
		this.lname = lname;
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	@Override
	public String toString() {
		return "Laptops [lid=" + lid + ", lname=" + lname + "]";
	}
	
	
}
