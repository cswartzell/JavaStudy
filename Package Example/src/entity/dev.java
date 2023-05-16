package entity;
import bean.Employee;

public class dev extends Employee{
	public void disEmployeeInfo()  {
		//all 4 accesss specifiers
//		System.out.println("id: "+id);// private isnt accessible from inherited

//		System.out.println("name: "+name); //default not accissble from seperate package

		System.out.println("salary: "+salary); //protected still visible

		System.out.println("designation: "+designation);
	}

}
