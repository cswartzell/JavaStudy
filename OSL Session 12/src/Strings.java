
public class Strings {
	//All string types extend and can be referenced as charsequence
	static void printString(CharSequence str) {
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		String s1 = new String("Hello");
		s1.concat(" world!"); //DOESNT concat. String Object.
		System.out.println(s1);
//		s1 = s1.concat(" world"); //Works
//		System.out.println(s1);		
		
		
		//Mutable Strings: 
		//Thread Safe
		StringBuffer  buffer = new StringBuffer("Hello");
		buffer.append(" world!"); //DOES work
		System.out.println(buffer);
		buffer.replace(0, 1, "osd");
		
		
		//NOT thread safe, but faster
		StringBuilder builder = new StringBuilder("Hello ");
		builder.append("world!"); //Also Works
		System.out.println(builder);
		
		//make plain strings, char sequences
		String str1 = buffer.toString();
		String str2 = builder.toString();
		

		Strings.printString(str1);
		Strings.printString(buffer);
		Strings.printString(builder);
	}

}
