package inheritance;

public class Manager extends Employee{
	private int numberOfEmp;
	
	public void readMgr() {
		System.out.println("Enter number of employees under manager: ");
		this.numberOfEmp = sc.nextInt();
	}
	
	public void dispMgr () {
		this.dispEmp();
		System.out.println("Number of Subordinates: "+this.numberOfEmp);
	}
}
