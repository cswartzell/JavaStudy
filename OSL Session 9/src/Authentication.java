
public class Authentication {
	
//	void registration (String email, String password, String phone, int otp) {
//		if (!email.isEmpty()) {
//			System.out.println("Register the User with Email and Password");
//		} else if (!phone.isEmpty()) {
//			System.out.println("Register the User with Phone and OTP");
//		} else if (true) {
//			
//		} else {
//			
//		}
//	}
	
	void register(String email, String Password) {
		System.out.println("Register the User with Email and Password");
	}
	
	void register(String phone, int otp) {
		System.out.println("Register the User with Phone and OTP");		
	}
	
	void register(String gmail) {
		if(gmail.endsWith("gmail.com")) {
		System.out.println("Register the User with Gmail Account");
		} else {
			System.out.println("Not a valid gmail account");
		}
	}
	
	
	public static void main(String[] args) {
		Authentication auth = new Authentication();
		auth.register("can@email.com", "password123");
		auth.register("1-510-750-7423", 123456789);

		auth.register("can@email.com");
		auth.register("can@gmail.com");
	}
}
