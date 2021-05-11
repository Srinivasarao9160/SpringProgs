package com.ojas.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp1 {
	private int id;
	private String name;
	private List<String> skils;
	private Set<String> mobile;
	private Map<String, String> project;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getSkils() {
		return skils;
	}
	public void setSkils(List<String> skils) {
		this.skils = skils;
	}
	public Set<String> getMobile() {
		return mobile;
	}
	public void setMobile(Set<String> mobile) {
		this.mobile = mobile;
	}
	public Map<String, String> getProject() {
		return project;
	}
	public void setProject(Map<String, String> project) {
		this.project = project;
	}
	@Override
	public String toString() {
		return "Emp1 [id=" + id + ", name=" + name + ", skils=" + skils + ", mobile=" + mobile + ", project=" + project
				+ "]";
	}
	

}
