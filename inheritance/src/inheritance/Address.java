package inheritance;

import java.util.Scanner;

public class Address {
	private String city;
	private String state;
	private Scanner sc = new Scanner(System.in);
	
	public void readAdd() {
		System.out.println("Enter City");
		city = sc.next();
		System.out.println("Enter State");
		state = sc.next();
	}
	
	public void dispAdd() {
		System.out.println("City: "+city);
		System.out.println("State: "+state);
	}
	
}
