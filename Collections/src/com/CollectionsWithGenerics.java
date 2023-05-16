package com;

import java.util.ArrayList;

public class CollectionsWithGenerics {

	public static void main(String[] args) {
		//Collection framework without generics
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(10.2);
		al.add("Raven");
		al.add(true);
		//because autoboxing, all are stored just fine.
//		
//		Object obj = al.get(0);
//		Integer i = (Integer)obj; //Downcast
//		System.out.println(i);
//		
//		Object obj2 = al.get(1);
//		Double d = (Double)obj2; //Downcast
//		System.out.println(d);
		
		//Clearly this is awful. 
		
		//instead, declare types we are storing:
		ArrayList<Integer> al2 = new ArrayList();
		al2.add(10);
		al2.add(20);
//		al2.add(20.23); //ERROR, wrong type
		al2.add(30);
		System.out.println(al2.get(2)); // Auot UNboxing. Convert obj back to int
		
		
		
	}

}
