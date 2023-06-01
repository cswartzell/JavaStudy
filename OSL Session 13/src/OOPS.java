import java.util.Date;
//import java.sql.Date;
//NOTE! The wrong date class got autoadded here!

// Identify the Object and write its attributes:
//	User: name, phone, email, gender, birthdate, password

class User {
	//Attributes
	String name;
	String phone;
	String email;
	Date birthdate;
	String password; //lol
	
	//Constructor- No Arg
	User(){
		name = "John Doe";
		phone = "NA";
		email = "default@email.com";
		birthdate = new Date();
		password = "password";		
	}
	
	//Paramaterized constructor
 	User(String name, String phone, String email, Date birthdate, String password){
 		
 		//use this keyword to distinguish the object instantiation vs the arges passed in
 		this.name = name;
 		this.phone = phone;
 		this.email = email;
 		this.birthdate = birthdate;
 		this.password = password;
 	}
 	
 	//Method that sets ALL fields
 	void setUserData(String name, String phone, String email, Date birthdate, String password){
 		this.name = name;
 		this.phone = phone;
 		this.email = email;
 		this.birthdate = birthdate;
 		this.password = password;
 	}
	
 	void showUserData() {
 		System.out.println(name+": "+phone+", "+email); 
 	}
}

public class OOPS {
	
	public static void main(String[] args) {
//		//Create real object in memory
//		User usr1 = new User(); //object construction statement
//		User usr2 = new User();
//		User usr3 = usr2; //REF to user 2. SAME OBJECT
//		User usr4 = new User();
//		User usr5 = new User("Tom", "15554564567", "Tman@email.com", new Date(), "coolboy123");
//	
////		System.out.println(usr1); //prints mem address
////		System.out.println(usr2);
//	
//
//		//need to write/udpate data. Need setters and getters. 
//		usr1.name = "John";
//		usr2.name = "Fiona";
//		usr3.name = "John Watson";
//		
//		usr1.phone = "15555567423";
//		usr1.email = "jawn@email.com";
//		usr1.birthdate = new Date();
//		
//		usr2.phone = "15555567414";
//		usr2.email = "fi@email.com";
//		usr2.birthdate = new Date();
//
//		//AS usr3 is a ref TO usr2 this overwrites the data of usr2
//		usr3.phone = "15555563333";   
//		usr3.email = "JW@email.com";
//		usr3.birthdate = new Date(3, 14, 1985);
//	
//		usr2.setUserData("Fiona", "1555555789", "fi@email.com", new Date(), "1!");
////		
////		System.out.println("Read from users: ");
////		System.out.println(usr1.name+": "+usr1.phone+", "+usr1.email); 
////		System.out.println(usr2.name+": "+usr2.phone+", "+usr2.email); 
////		System.out.println(usr3.name+": "+usr3.phone+", "+usr3.email); 		
////		System.out.println(usr4.name+": "+usr4.phone+", "+usr4.email); 	
////		System.out.println(usr5.name+": "+usr5.phone+", "+usr5.email); 	
//		
//		//data deletion happens automatically. Garbage collection looks
//		// for unused/unreferenced objects and deletes them. Presumably every
//		// block end at least
//		
//		usr1.showUserData();
//		usr2.showUserData();
//		usr3.showUserData();
//		usr4.showUserData();
//		usr5.showUserData();
		
		Product p1 = new Product();
		Product p2 = new Product("iPhone", 4.7, "An Apple iPhone 13 Max", 1349.99);
		Product p3 = new Product();
		p3.setProductData("XBOX X", 4.3, "The new fangled xbox",500);
		
		p1.showProductData();
		p2.showProductData();
		p3.showProductData();
		
		System.gc();
	}
}
