package com;

public class LoopsNChess {

	public static void main(String[] args) {
//		int i = 1;
//		int num = 5;
//		
////		while (i <= 10) {
////			System.out.println(i*num);
////			i++;
////		}
//		
////		do {
////			System.out.println(num*i++);
////		} while (i < num); //ugh
//		
//		//automatically cleans up iterator on exit
//		for (int j = 0 ; j < 10 ; j++) {
//			if (j == 5) continue;
//			if (j > 8) {
//				break;
//			}
//			System.out.println(j);
//			
////			nested loops
////			for (int k = 0; k < 2; k++) {
////				System.out.println(k*j);
////			}
//		}
		
		// make a chess board
		boolean white = false;
		
		System.out.printf("\u2554");
		for (int i = 0 ; i < 18 ; i++) System.out.printf("\u2550");
		System.out.printf("\u2557"+"%n");
		for (int i = 0 ; i < 8 ; i++) {
			String row = "";
			for (int k = 0 ; k < 8 ; k++) {
				if (white){
					row += "  ";
				} else {
					row += "\u2588"+"\u2588";
				}
				white = !white;
			}
			white = !white;
			System.out.println("\u2551"+"\u2009"+row+"\u2009"+"\u2551");
		}

		System.out.printf("\u255A");
		for (int i = 0 ; i < 18 ; i++) System.out.printf("\u2550");
		System.out.printf("\u255D"+"%n");
		

		System.out.println("\u23B8T");
		
	}

}
