package inheritance;

class A {
	void dis1() {
		System.out.println("this is method from Class A");
	}
}

class B extends A{
	//OVERWRITES partent class function
	void dis1( int num) {
		System.out.println("this is method from Class B prints num : "+num);
	}
	void dis2() {
		System.out.println("this is method from Class B");
	}
}


public class inheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj1 = new A();
		B obj2 = new B();
		
		obj1.dis1();
		obj2.dis2();
		obj2.dis1();
		obj2.dis1(2);
		
	}

}
