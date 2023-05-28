package com;

public class TwoDArrays {

	public static void main(String[] args) {
		int covidCases1[] = {4684, 4683, 435, 64531};
		int covidCases2[] = {4384, 1683, 135, 14531};
		int covidCases3[] = {46844, 46843, 4345, 545431};
		
		int[][] covidCasesArr = {covidCases1, covidCases2, covidCases3};
		int covidCasesArr2[][] = {{4684, 4683, 435, 64531}, {4384, 1683, 135, 14531},{46844, 46843, 4345, 545431}}; 
		
		int[][] arr2d = new int[5][3]; 
		int[][] arr2d2 = new int[5][];
		
		System.out.println("covidCases array is "+covidCasesArr+" and length is: "+covidCasesArr.length);

	
		for (int i = 0 ; i < covidCasesArr.length ; i++) {
			for (int j = 0 ; j < covidCasesArr[i].length ; j++) {
				System.out.print(covidCasesArr[i][j]+"  ");
			}
			System.out.println();
		}
	
		//enhanced loops
		for(int[] array: covidCasesArr) {
			for(int element: array) {
				System.out.println(element);
			}
		}
	
	
	}

}
