package com.onetoone.model;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Student {
	@Id
	private int studentid;
	private String studentname;
	private int  studentmarks;
	
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name="laptopid")
	
	private Laptop laptop;
	public Student() {
		super();
	}
	public Student(int studentid, String studentname, int studentmarks, Laptop laptop) {
		super();
		this.studentid = studentid;
		this.studentname = studentname;
		this.studentmarks = studentmarks;
		this.laptop = laptop;
	}
	
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public int getStudentmarks() {
		return studentmarks;
	}
	public void setStudentmarks(int studentmarks) {
		this.studentmarks = studentmarks;
	}
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", studentname=" + studentname + ", studentmarks=" + studentmarks
				+ ", laptop=" + laptop + "]";
	}
	
	}
