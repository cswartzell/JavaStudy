
class Abc {
	int a; //instance var
	static int b; //static var
	
	void dis1() {
		System.out.println("Non static method");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		
	}
	

	static void dis2() {
		System.out.println("Static method");
//		System.out.println("a: "+a);//ERROR: trying to use a nonstatic var in a static method
		System.out.println("b: "+b);
	}
}


public class StaticExample {

	public static void main(String[] args) {
		Abc obj = new Abc();
		obj.dis1();
		obj.dis2();
		Abc.dis2(); //so you can call the function direct without making an object
		
		obj.a=10;
		obj.b=10; //?
//		Abc.a = 10; //ERROR, cannot assign a non static var of just class
		Abc.b = 20; //What happens here? Where is this even stored? 
		
		
	}

}
