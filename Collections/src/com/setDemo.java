package com;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class setDemo {

	public static void main(String[] args) {
		//Hashset
//		HashSet hs = new HashSet();   //Plain hashset. Exactly equivalent to python
//		LinkedHashSet hs = new LinkedHashSet(); //KEEPS order passed in, but not sorted
		TreeSet hs = new TreeSet(); // Sorted, ascending by default. CANT be heterogeneous data
		
		
		System.out.println("Size: " +hs.size());
		//before storing, these args are primitive. Once stored, it converts primitives to object
		// This is called auto-boxing
		
		//OLD style, set could only store objects, so we needed to manually box
		//This is now automatic with auto-boxing
//		int a=20; //primitive
//		Integer b = new Integer(a);
//		has.add(b);
		hs.add(10); 
		hs.add(10); 
		hs.add(12); 
		hs.add(3); 
//		hs.add("a string?"); //heterogeneous storage for set, linked, NOT tree
		hs.add(4); 
		hs.add(4); 
		System.out.println(hs);
		hs.remove(3);
		System.out.println(hs.contains(2));		
	}

}
