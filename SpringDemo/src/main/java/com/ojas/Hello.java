package com.ojas;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("sri")
//@Scope(scopeName = "prototype")
public class Hello {
	public Hello() {
		System.out.println("default constracter");
}
	public String getMessage() {
		return "Hello Spring boot";
		
	}

}
