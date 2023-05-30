
public class Overloading {
	//Same name, Unique args list (number, type, just sequence etc)
	// RETURN TYPE DOES NOT OVERLOAD alone
	
	static void add(int a, int b) {
		System.out.println(a+" + "+b+" = "+(a+b));
	}
	
	//DOES NOT CAUSE OVERLOADING BY JUST CHANING RETURN TYPE
//	int add(int a, int b) {
//		System.out.println(a+" + "+b+" b = "+(a+b));
//	}
	
	static void add(int a, int b, int c) {
		System.out.println(a+" + "+b+" + "+c+" = "+(a+b+c));
	}
	
	static void add(double a, double b) {
		System.out.println(a+" + "+b+" = "+(a+b));
	}
	
	public static void main(String[] args) {
		Overloading.add(10, 10);
		Overloading.add(10, 14, 20);
		Overloading.add(10.15, 123.25);
	}

}
