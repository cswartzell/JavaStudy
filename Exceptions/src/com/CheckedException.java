package com;

public class CheckedException {

	public static void main(String[] args)  throws Exception{
		System.out.println("hi");
		Thread.sleep(3000);// Doesnt work on its own
//		try {
//			Thread.sleep(3000); //REQUIRES you to handle exception
//		}catch(Exception e) {  //We could also write "throws Exception" in the main signature to pass it on
//		}
		System.out.println("bye");
	}

}
