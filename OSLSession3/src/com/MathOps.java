package com;

import java.util.Scanner;

public class MathOps {

	public static void main(String[] args) {
		// +, -, /, *

//		System.out.println(3+45);
//		System.out.println(10-3);
//		
//		double amount = 2000;
//		double taxRate = 0.095;
//		double tax = amount * taxRate;
//		double total = amount + tax;
//		System.out.println(total);
//		
//		int num1 = 10;
//		int num2 = 3;
//		int res = num1 % num2;
//		System.out.println(res);
//		System.out.println(num1/num2); //int div, truncate
//		
//		int num3  = 32;
//		int num4 = num3; //Copy by val
//		System.out.println(num3);
//		System.out.println(num4);
//		num4 = 323;
//		// Change num 4
//		System.out.println(num3);
//		System.out.println(num4);
//
//		num4 += 10;
//		num3 -= 1;
//		
//		num4 %= 2;
//		num3 /= 5;

		//Relationals: !=, >, <, <=, >=. 
		// == evaluates same, === IS EXACTLY SAME OBJECT
//		int eWallet = 400;
//		int cabFare = 500;
//		boolean ableToCab = eWallet >= cabFare;
//		System.out.println("Can call a cab?: " +ableToCab);
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter 12: ");
//		int code = sc.nextInt();
//		if (code == 12) {
//			System.out.println("Accepted");
//		} else {
//			System.out.println("Access Denied");
//		}
//		sc.close();
		
		//Logical && || !
//		boolean internet = true;
//		boolean gps = true;
//		System.out.println("Can I navigate using Maps?: "+(internet && gps));
//
//		int code = 2001;
//		int amount = 5000;
//		System.out.println("Can I get a discount?: "+((code == 2001)&&(amount > 4000)));
//		
//		String phone = "";
//		String email = "john@a.com";
//		
//		System.out.println("can i login?: "+((phone.length() != 0)||(email.length() != 0)));
		
		//bitwise ops & AND, | OR, ^ XOR
//		int num1 = 8;
//		int num2 = 3;
//		int res = num1 & num2;
//		int res2 = num1 | num2;
//		num1 = num1 ^ num1;

		//Shift: << shift left LOSE MSB, >> left shift LOSE LSB, >>> Right shift POSITIVE int with rollover
//		res = num1 << num2;
//		System.out.println(res);
//		res = num1 >> num2 + num2;
//		System.out.println(res);
//				
//		int res = -1; 
//		res = res >> 4;
//		System.out.println(res);
//		res = -1 >>> 4;
//		System.out.println(res);
	
		int i = 300;
		int j = 400;
		int res = (i > j) ? 5 : 6;   //Ternary: evaluate left: If true, middle. Else Rightmost.
		
	}

}
