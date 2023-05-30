package com;

import java.util.Scanner;

public class OSL311 {
	public static void main(String[] args) {
		String[] countries = {"USA", "India", "Brazil", "UK", "France"};
		int totalCases = 0;
		int totalRecovered = 1;
		int activeCases = 2;
		
		int[][] covidCases = {
				{654651, 4681681, 4984984}, //USA
				{12346, 11181, 1123484},    //India
				{236551, 4612681, 1234984}, //Brazil
				{3456746, 434568181, 3984}, //UK
				{5454651, 1681681, 49345984},//France
		};
		
//		System.out.println("Total Cases\t\tTotal Recovered\t\tActive Cases");
//		System.out.println("===============================================================");
//		
//		for (int i = 0 ; i < countries.length ; i++) {
//			System.out.println(countries[i]);
////			System.out.println("----------------");
////			for (int j = 0 ; i < covidCases.length ; j++) {
//			
//			System.out.print("Cases: "+covidCases[i][0]);
//			System.out.print("\tRecovered: "+covidCases[i][1]);
//			System.out.print("\tActive: "+covidCases[i][2]);
//		
//			System.out.println();
//			System.out.println();
//		}
		
		int choice = -1;		
		while (choice != 5) {
			System.out.println("===========================");
			System.out.println("Filter Covid Case Data");
			System.out.println("1: Name");
			System.out.println("2: Total Cases");
			System.out.println("3: Recovered Cases");
			System.out.println("4: Active Cases*");
			System.out.println("5: Exit");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			
			switch (choice) {
				case 1:
					System.out.println("Enter Name of Country");
					String name = sc.next();
					int idx = -1;
					for ( int i = 0 ; i < countries.length ; i++ ) {
						if(name.equalsIgnoreCase(countries[i])) {
							idx = i;
							break;
						}
					}
					if (idx == -1) {
						System.out.println("Country not found");
					} else {
						System.out.println();
						System.out.println(countries[idx]);
						System.out.print("Cases: "+covidCases[idx][0]);
						System.out.print("\tRecovered: "+covidCases[idx][1]);
						System.out.print("\tActive: "+covidCases[idx][2]);
					
					}
					System.out.println();
					System.out.println();
					break;
					
				case 2:
					System.out.println();
					System.out.println("Total Cases");
					System.out.println("-----------");
					System.out.println();
					for (int j = 0 ; j < covidCases.length ; j++) {
						System.out.println(countries[j]+": "+covidCases[j][0]);
						
					}
					System.out.println();
					break;
				case 3:
					System.out.println();
					System.out.println("Recovered Cases");
					System.out.println("---------------");
					System.out.println();
					for (int j = 0 ; j < covidCases.length ; j++) {
						System.out.println(countries[j]+": "+covidCases[j][1]);
						
					}
					System.out.println();
					break;
				case 4:
					System.out.println();
					System.out.println("Active Cases");
					System.out.println("---------------");
					System.out.println();
					for (int j = 0 ; j < covidCases.length ; j++) {
						System.out.println(countries[j]+": "+covidCases[j][2]);
						
					}
					System.out.println();
					break;
				case 5:
					return;
			}
		}
	}
}
