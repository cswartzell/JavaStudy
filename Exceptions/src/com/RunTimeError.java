package com;

public class RunTimeError {

	public static void main(String[] args) {
//		System.out.println("Runtime Errors: Division by zero");
//		int a=10;
//		int b=3;
//		try {
//		int res = a/b;
//		System.out.println("Result = "+res);
//		} catch(Exception e) {
////			System.out.println("Whoops, bad math");
//			System.out.println(e.getMessage());
//			System.out.println(e.toString());
//			System.out.println(e); //Automatically calls toString() by default
//		}
//		System.out.println("We did the math");
//		System.out.println("We did the math");
//	
//		
//		int abc[] = {10,20,30,40};
//		
//		try {
//		int res1 = abc[5]/2;   //Array out of bounds
//		} catch(Exception e) {
//			System.out.println("index error");
//			System.out.println(e);
//		}
//		
		
		String s="10";
//		String s="a10"; //When parsing,  NumberFormatException
		
		System.out.println(s+10);  //string PLUS number (defaults to concat as sting)
		System.out.println(Integer.parseInt(s)+10);  //string PLUS number (defaults to concat as sting)
		
		
	}

}
