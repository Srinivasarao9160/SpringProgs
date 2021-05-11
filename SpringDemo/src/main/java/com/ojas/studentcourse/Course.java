package com.ojas.studentcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class Course {
	private int cid;
	private String cname;
	private int cprice;
	@Autowired
	@Qualifier("stud1")
	private Student stud1;
	
	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getCprice() {
		return cprice;
	}

	public void setCprice(int cprice) {
		this.cprice = cprice;
	}

	public Student getStud1() {
		return stud1;
	}

	public void setStud1(Student stud1) {
		this.stud1 = stud1;
	}

	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", cprice=" + cprice + ", stud1=" + stud1 + "]";
	}
	
}
