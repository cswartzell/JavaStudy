package com;

public class Methods {
	int getMax(int[] arr) {
		int max = arr[0];
		for (int i = 1 ; i < arr.length ; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;		
	}
	
	//STATIC METHOD: Can evoke directly using class.
	static int getArrayMax(int[] arr) {
		int max = arr[0];
		for (int i = 1 ; i < arr.length ; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;		
	}
	
	
	public static void main (String[] args) {
		int[] productPrices = {100,200,300,450,500};
		int[] baseballScores = {10,4,6,8,0};
		int[] covidCases = {65841, 165, 1681864, 65841, 684};
		
//		int max = productPrices[0];
//		
//			
//		for (int i = 1 ; i < productPrices.length ; i++) {
//			if (productPrices[i] > max) {
//				max = productPrices[i];
//			}
//			System.out.println();
		
		Methods ref = new Methods();
//		System.out.println("Max in product prices is: "+ref.getMax(productPrices));
		System.out.println("Max in baseball cores is: "+ref.getMax(baseballScores));
		System.out.println("Max in covid cases is: "+ref.getMax(covidCases));
	
		System.out.println("Max in product prices is: "+Methods.getArrayMax(productPrices));
		
	}
}
