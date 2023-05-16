package main;
import bean.Employee;



public class PackageTest {   

	public static void main(String[] args) {
		Employee emp1 = new Employee();
//		System.out.println("id: "+emp1.id);   //scope/access error
//		System.out.println("name: "+emp1.name);//scope/access error
//		System.out.println("salary: "+emp1.salary);//scope/access error
		System.out.println("designation: "+emp1.designation);
	}

}
