
class Employee {
	int id;
	String name;
	static int mgrId;
	void disEmpInfo() {
		System.out.println("id: "+id);
		System.out.println("name: "+name);
		System.out.println("manger id: "+mgrId);
	}
}


public class StaticExampleTwo {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		emp1.id = 100;
		emp1.name="Lex";
		emp1.mgrId=200;
		Employee.mgrId=201;
		emp1.disEmpInfo();

		emp2.id = 101;
		emp2.name="Nina";
		emp2.mgrId=202;
		Employee.mgrId=203;
		emp1.disEmpInfo();
		emp2.disEmpInfo();
	}

}
