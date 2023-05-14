package inheritance;

import java.util.Scanner;

public class Employee {
	private int id;
	private String name;
	private float salary;
	private Scanner sc = new Scanner(System.in);
	
	public void readEmp() {
//		System.out.println("Enter Eployee Details");
		System.out.println("Enter ID: ");
		this.id = sc.nextInt();

		System.out.println("Enter Name: ");
		this.name = sc.next();

		System.out.println("Enter Salary1"
				+ ": ");
		this.salary = sc.nextFloat();
	}
	
	public void dispEmp() {
		System.out.println("ID: "+this.id);
		System.out.println("Name: "+this.name);
		System.out.println("Salary: "+this.salary);
	}
}
