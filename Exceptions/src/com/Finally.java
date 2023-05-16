package com;

public class Finally {
	public static void main(String[] args) {
		System.out.println("hi");
		try {
			int res= 10/0;
			System.out.println("res :"+res);
		} catch (Exception e) {
			System.out.println("caught error :"+e);
		} finally {
			System.out.println("Finally block for some reason");
		}
		
	}
}
