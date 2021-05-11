package com.student.dto;


import com.student.entity.Student;

public class DetailsRequest {
	
	private Student stud;
	
	

	public DetailsRequest() {
		super();
	}

	public DetailsRequest(Student stud) {
		super();
		this.stud = stud;
	}

	public Student getStud() {
		return stud;
	}

	public void setStud(Student stud) {
		this.stud = stud;
	}

	@Override
	public String toString() {
		return "DetailsRequest [stud=" + stud + "]";
	}
	
	

}
