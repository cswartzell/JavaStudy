package bean;

public class manager extends Employee {
	public void disEmployeeInfo() {
		//all 4 accesss specifiers
//		System.out.println("id: "+id);// ONLY private isnt accessible from inherited

		System.out.println("name: "+name);

		System.out.println("salary: "+salary);

		System.out.println("designation: "+designation);
	}

}
