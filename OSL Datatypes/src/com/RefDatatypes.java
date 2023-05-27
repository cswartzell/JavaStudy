package com;

public class RefDatatypes {
	public static void main(String[] args) {
		// Created at runtime, inside HEAP area
		int math = 90;
		int physics = 99;
		int chem = 87;
		
		//Array
		int marks[]= {90,99,87}; //Annoying. Why is array dec [] but literal assignment {}?
		System.out.println(marks); //Prints ADDRESS. Its a ref type and cannot be accessed directly
		System.out.println(marks[0]);
		
		
	}
}
