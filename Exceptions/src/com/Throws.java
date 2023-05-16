package com;

public class Throws {
	static void dis1() throws Exception {
		try {
		int a = 10/1;
		} catch(NumberFormatException e) {	
		}
		System.out.println("dis 1 method");
	}
	static void dis2() throws Exception {
//		try {
		dis1();
//		} catch(Exception e) {	
//		}
		System.out.println("dis 2 method");
	}

	public static void main(String[] args) throws Exception {
//		try {
			dis2();
//		} catch(Exception e) {	
//		}
		System.out.println("Main Method");
	}
}
