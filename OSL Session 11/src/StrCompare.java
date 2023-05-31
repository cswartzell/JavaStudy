import java.util.Scanner;

public class StrCompare {

	public static void main(String[] args) {
		String email = "cam@gmail.com"; //Interned Objects
		String email2 = "cam@gmail.com"; //Interned Objects
		String password = "123";        //Interned Objects

		if(email == email2) {  
			System.out.println("You can naively compare interned strings, but not string objects");
		}

		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Email: ");
		String userEmail = sc.nextLine();
		System.out.println("Enter Password: ");
		String userPassword = sc.nextLine();
		
		String myemail = new String("cam@gmail.com");
		String mypassword = new String("123");
		
//		if(email == userEmail && password == userPassword) { //WONT MATCH: compares REF not data 
//			System.out.println("Logged In");
//		} else {
//			System.out.println("Wrong email/password");
//		}
		
		if(myemail.equals(userEmail) && mypassword.equals(userPassword)) {  
			System.out.println("Logged In");
		} else {
			System.out.println("Wrong email/password");
		}

		sc.close();
	}
}
