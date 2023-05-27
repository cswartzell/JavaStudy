package com;

public class Primitives {

	public static void main(String[] args) {
		byte age = 10; //8 bit, can take int up to 256 unsigned. Create storage in RAM/Stack
		age = 12; // update value
		System.out.println("age is: "+age); //read value
		//storage is garbage collected when scope ends
		
		short num1 = 2000; //2bytes
		int num2 = 2094534; //4bytes
		long phone = 5107507423L; // NOTE L for literal at end, makes it 8 bytes
		float fp = 3.14159f;   //Jesus, you have to add f or F to say "this is a float literal". Awful
		double dfp = 3.141592684346;   //Doubles dont need the literal append 8 BYTEs
		
		System.out.println(dfp);
		
		char c = '&'; 
		c = '\u2606'; 
		System.out.println(c);
		
		boolean tf = true;  //lowercase t/f Uses 8 bits. No way to singly address 1 bit without logic
		
	}

}
