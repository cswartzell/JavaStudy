package com;

interface Abc {
//	int a; //ERROR. MUST ASSIGN VALUE
	int a = 10;
	void dis1(); //default public abstract

//	public abstract void dis1(); //same 
}

interface Xyz {
//	int a; //ERROR. MUST ASSIGN VALUE
	int b = 20;
	void dis2();
}

interface Mno extends Abc, Xyz {
//	int a; //ERROR. MUST ASSIGN VALUE
	int c = 30;
	void dis3();
}

class Demo implements Mno {
	public void dis1() {     //Public is MANDATORY for inheritence here
		System.out.println("d1"+a);
	}
	public void dis2() {
		System.out.println("d2"+b);
	}	
	public void dis3() {
		System.out.println("d3"+c);
	}
}

public class InterfaceExapmle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo demo = new Demo();
		demo.dis1();
		demo.dis2();
		demo.dis3();
	}

}
