package com.student.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Student_Info")
public class Student {
	@Id
	@GeneratedValue
	private int  sid;
	private String sname;
	private int smarks;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Laptops> laptops;
	public Student() {
		super();
	}
	public Student(int sid, String sname, int smarks, List<Laptops> laptops) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.smarks = smarks;
		this.laptops = laptops;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSmarks() {
		return smarks;
	}
	public void setSmarks(int smarks) {
		this.smarks = smarks;
	}
	public List<Laptops> getLaptops() {
		return laptops;
	}
	public void setLaptops(List<Laptops> laptops) {
		this.laptops = laptops;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", smarks=" + smarks + ", laptops=" + laptops + "]";
	}
	

}
