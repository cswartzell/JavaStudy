package com;

public class Employee {
	String name;
	int eid;
	
	public Employee() {
		this.name = "unknown";
		// "Cannot cast from String to int?! Fine. Lazy ass language
		this.eid = 0;
	}
	
	public Employee(String name, String eid) {
		this.name = name;
		// "Cannot cast from String to int?! Fine. Lazy ass language
		this.eid = Integer.parseInt(eid);
	}

	
//	public Employee(String[] args) {
//		this.name = args[0];
//		this.eid = Integer.parseInt(args[1]);
//	}
//	
	void display() {
		System.out.println("Employee : "+this.name);
		System.out.println("Employee ID: "+this.eid);
	}
}
