package com;

public class Employee {
	String name;
	int eid;
	float salary;
	
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

	// setter method
	void setValue(String name, int eid, float salary) {
		this.name = name;
		this.eid = eid;
		if(salary<0) {
			this.salary = 9001;
		} else {
			this.salary = salary;
		}
		
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
