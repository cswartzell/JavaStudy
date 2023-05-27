package com;

import java.text.DecimalFormat;
import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//For format and rounding
		final DecimalFormat df = new DecimalFormat("0.00");

		
//		System.out.println("Enter Price: ");
//		double amount = sc.nextDouble();
//		System.out.println("Enter promo code: ");
//		int code = sc.nextInt();
////		System.out.println("Price: "+amount+" Code: "+code);
//		
////		if (code == 1 && amount > 500) {
////			System.out.println("Code Applied, new price: "+(amount *0.75));
////		} else {
////			System.out.println("Invalid Promo");
////		}
//		
//		float discount1 = 0.25f;
//		float discount2 = 0.35f;
//		
//		
//		if (code == 1) {
//			if (amount < 500) {
//				System.out.println("Amount is less than promo minimum");
//			} else {
//				System.out.println("Code "+code+" Applied, new price: $"+(amount * (1-discount1)));
//			}
//			
//		} else if(code == 2) {
//				if (amount < 800) {
//					System.out.println("Amount is less than promo minimum");
//				} else {
//					System.out.println("Code "+code+" Applied, new price: $"+(amount * (1-discount2)));
//					System.out.println("Code "+code+" Applied, new FIXED price: $"+df.format((amount * (1-discount2))));
//				}							
//		} else {
//			System.out.println("Invalid Promo Code");
//		}
//		
//		
//		// Floats are terrible for financial values. Rounding error and formating needs to be dealt with
//		//DecimalFormat("0.00")
		
		
		System.out.println("Enter Price: ");
		double amount = sc.nextDouble();
		System.out.println("Enter Promo Code: ");
		String promoCode = sc.next();
		double discount = 0.25;
		switch (promoCode) {
		case "EASTER":
			System.out.println("Code EASTER Applied, Final Price: $"+df.format(amount*(1-0.25)));
			break;
		case "GIVEME35":
			System.out.println("Code GIVEME35 Applied, Final Price: $"+df.format(amount*(1-0.35)));
			break;
		default:
			System.out.println("Invalid Promo");
		}
		
		sc.close();
	}

}
