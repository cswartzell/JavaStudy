package service;

import bean.Employee;

public class dept {
	Employee emp = new Employee();
	
	public void disEmployeeInfo() {
	//all 4 access specifiers
//	System.out.println("id: "+id);// private isnt accessible from inherited

//	System.out.println("name: "+name); //default not accessible from separate package

//	System.out.println("salary: "+salary); //protected no longer accessible

//	System.out.println("designation: "+designation); // NO access even public without object specifier
	System.out.println("designation: "); // Only way
	}

}
