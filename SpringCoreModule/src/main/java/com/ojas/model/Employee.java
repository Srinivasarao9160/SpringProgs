package com.ojas.model;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {

	private List<String> emplist;
	private Set<String> empset;
	private Map<String, String> empmap;
	private Properties empProperties;
	@Override
	public String toString() {
		return "Employee [emplist=" + emplist + ", empset=" + empset + ", empmap=" + empmap + ", empProperties="
				+ empProperties + "]";
	}
	public List<String> getEmplist() {
		return emplist;
	}
	public void setEmplist(List<String> emplist) {
		this.emplist = emplist;
	}
	public Set<String> getEmpset() {
		return empset;
	}
	public void setEmpset(Set<String> empset) {
		this.empset = empset;
	}
	public Map<String, String> getEmpmap() {
		return empmap;
	}
	public void setEmpmap(Map<String, String> empmap) {
		this.empmap = empmap;
	}
	public Properties getEmpProperties() {
		return empProperties;
	}
	public void setEmpProperties(Properties empProperties) {
		this.empProperties = empProperties;
	}
	
	
}
