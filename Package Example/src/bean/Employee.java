package bean;

public class Employee {
	private int id;
	String name; //default access
	protected float salary;
	public int designation;
	
	public void disEmployeeInfo() {
		//all 4 accesss specifiers
		System.out.println("id: "+id);

		System.out.println("name: "+name);

		System.out.println("salary: "+salary);

		System.out.println("designation: "+designation);
	}
}
