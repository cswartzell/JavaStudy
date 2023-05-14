package inheritance;

public class Manager extends Employee{
	private int numberOfEmp;
	private Address addr = new Address();
	
	public void readMgr() {
		System.out.println("Enter number of employees under manager: ");
		this.numberOfEmp = sc.nextInt();
		addr.readAdd();
	}
	
	public void dispMgr () {
		this.dispEmp();
		System.out.println("Number of Subordinates: "+this.numberOfEmp);
		addr.dispAdd();
	}
}
