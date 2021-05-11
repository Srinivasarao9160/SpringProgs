package com.onetoone.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "laptop")
public class Laptop {
	@Id
	private int laptopid;
	private String laptopname;
	@OneToOne(mappedBy = "laptop")
	private Student student;
	
	public Laptop() {
		super();
	} 
	
	public Laptop(int laptopid, String laptopname) {
		super();
		this.laptopid = laptopid;
		this.laptopname = laptopname;
		
	}

	public int getLaptopid() {
		return laptopid;
	}

	public void setLaptopid(int laptopid) {
		this.laptopid = laptopid;
	}

	public String getLaptopname() {
		return laptopname;
	}

	public void setLaptopname(String laptopname) {
		this.laptopname = laptopname;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Laptop [laptopid=" + laptopid + ", laptopname=" + laptopname + "]";
	}
	
	
	
	
	
	

}
