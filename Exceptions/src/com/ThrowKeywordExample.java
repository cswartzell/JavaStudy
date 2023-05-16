package com;

class MyException extends Exception {

	public MyException() { //Default Constructor
		super();
	}
	public MyException(String msg) { //Parameterized Constructor
		super(msg);
	}
}


public class ThrowKeywordExample {

	public static void main(String[] args) {
		int age = 19;
		
		try {
			if(age<21) {
//				throw new Exception(); //predefined generic exception
//				throw new ArithmeticException(); //we can throw predefined exc.
//				throw new ArithmeticException("Too young to vote");
				throw new MyException("Too young to vote");

			} else {
				System.out.println("Able to vote: Click Next");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
