package inheritance;

//class A {
//	void dis1() {
//		System.out.println("this is method from Class A");
//	}
//}
//
//class B extends A{
//	//OVERWRITES partent class function
//	void dis1( int num) {
//		System.out.println("this is method from Class B prints num : "+num);
//	}
//	void dis2() {
//		System.out.println("this is method from Class B");
//	}
//}
//

public class inheritanceTest {

	public static void main(String[] args) {
//		A obj1 = new A();
//		B obj2 = new B();
//		
//		obj1.dis1();
//		obj2.dis2();
//		obj2.dis1();
//		obj2.dis1(2);
		
		System.out.println("Enter Manager Details");
		Manager mng1 = new Manager();
		mng1.readEmp();
		mng1.readMgr();
		
		System.out.println("Enter DevDave Details");
		Developer dev1 = new Developer();
		dev1.readEmp();
		dev1.readDev();
		
		mng1.dispEmp();
		mng1.dispMgr();
		dev1.dispEmp();
//		dev1.dispDev();
		
		
	}

}
