package com;

public class dataType {
	public static void main(String[] args) {
//		int num = 100;
//		boolean res = true;
//		double d = 4.90;
//		System.out.println(d);
//		System.out.println("Value of num is: "+num);
//		
//		int a = 10;
//		int b = 20;				
//		System.out.println(a+" + "+b+" = "+(a+b));
//		System.out.println(b/a);
//		
//		boolean lies[];
//		int nums[]= {10,20,30,40,50};
//	
//		//PRINTS ADDRESS OF FIRST INDEX
//		System.out.println(nums);
//		
//		int num1[];
//		int num2[]= {10,20,30,40,50};
//		System.out.println(num2[3]);
//		
//		//EXCEPTION except its not throwing one?
////		System.out.println(num2[10]);
//		
//
//		System.out.println("Display vals with for loop: ");
//		for (int i = 0; i<num2.length;i++) {
//			System.out.println(num2[i]);
//		}
//		
//		System.out.println("Display vals with iterator: ");
//		//for each, iterator
//		for(int n:num2) {
//			System.out.println(n);
//		}

		
		int num[] = new int[10];
		System.out.println("Display vals with iterator: ");
		//for each, iterator
		for(int n:num) {
			System.out.println(n);

		int temp = 123;
		for (int i  = 0 ; i < num.length ; i++) {
			num[i] = temp;
			temp += i;
		}
		
			
			
		}
	}
}
