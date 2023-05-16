package com;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDemo {
	public static void main(String[] args) {
//		HashMap hm = new HashMap(); //Unordered
//		LinkedHashMap hm = new LinkedHashMap(); //Ordered
//		TreeMap<K, V> hm = new TreeMap(); //Sorted
		TreeMap hm = new TreeMap(); //Sorted
		hm.put(3, "ravi");
		hm.put(2, "Josh");
		System.out.println(hm);
		hm.put(2, "craig is a weird name. Dont know a craig"); //overwrites
		System.out.println(hm);
		hm.put(6, "steve");
		hm.put(5, "steve");
		System.out.println(hm);
		if (!hm.containsKey(8) ) {
			hm.put(8, "susan");
		} 
//		hm.clear(); //deletes whole map
		hm.remove(2);
		System.out.println(hm);
		
	}
}
