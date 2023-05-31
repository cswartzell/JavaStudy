
public class StringMethods {

	public static void main(String[] args) {
		String names = "Cam, Kaj, Caitlyn, teefer";
//		int slen = names.length();
//		System.out.println("Names is "+slen+" chars wide");
//		
//		char ch = names.charAt(3);
//		System.out.println("Char 4 is "+ch);
//
//		ch = names.charAt(slen - 1);
//		System.out.println("Last char is "+ch);
//
//		int idx = names.indexOf("t");
//		System.out.println("First T found at idx "+idx);
//		
//		idx = names.lastIndexOf("t");
//		System.out.println("Last T found at idx "+idx);
//		
//		idx = names.indexOf("Kaj");
//		System.out.println("Kaj starts at idx "+idx);
//		
//		//REMEMBER, STRINGS ARE IMMUTABLE
//		names.toUpperCase(); //DOES NOTHING
//		String upnames = names.toUpperCase();
//		System.out.println(upnames);
//	
//		String replaced = names.replace("K", "D");
//		System.out.println(replaced);
//		
//		String slice = names.substring(idx); //from idx to end
//		System.out.println("slice is: "+slice);
//
//		slice = names.substring(idx, idx+3); //from idx to 3
//		System.out.println("slice is: "+slice);
//		
//		
//		
//		String[] res = names.split(",");
//		for (String name : res) {
//			System.out.println(name.trim());
//		}
//		
//		String fname = "Cam";
//		String lname = "Swartzell";
////		String fullName = fname + " " + lname;
//		String fullName = fname.concat(" ");
//		fullName = fullName.concat(lname);
//		System.out.println(fullName);
//		
//		String email = "c@gmail.com";
//		email = "c@3mail.com";
////		email = "";
//		if (email.isEmpty()) {
//			System.out.println("Email Cant be empty");
//		} else {
//			if (!email.contains("@") || !email.endsWith(".com")) {
//				System.out.println("Not a valid email address");
//			} else {
//				System.out.println("Ok");
//			}
//		}
		
		String[] phoneNumbers = {"+3 8675309", "+02 9035768", "+3 5309867", "+4 7530986"};
		String search = "+3";
		for (int idx = 0; idx < phoneNumbers.length ; idx++) {
			if (phoneNumbers[idx].startsWith(search)) {
				System.out.println(phoneNumbers[idx]);
			}
		}
		
		int count = 0;
		char[] charNames = names.toCharArray();
		for (char ch: charNames) {
			System.out.print(ch+" ");
			if (ch == 'e') {   //SINGLE quote means char, double is string
				count++;	
			}
		}
		System.out.println();
		System.out.println("Number of 'e' characters: "+count);
		
		
		
	}

}
