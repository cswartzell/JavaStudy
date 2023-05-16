package com;

public class MultipleCatch {

	public static void main(String[] args) {
		try {
//			int a = 10/0;
			int abc[] = {10,20,30};
			System.out.println(abc[4]);
		} catch(ArithmeticException e) {
			System.out.println("div by zero");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index Out Of Bounds");
		} catch(Exception e) {   //Catch generic 
			System.out.println("Somethign Failed: "+e);
		}
	}

}
