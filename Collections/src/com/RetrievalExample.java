package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class RetrievalExample {

	public static void main(String[] args) {
//		HashSet hs = new HashSet();
//		hs.add(10); 
//		hs.add(12); 
////		for(int a:hs) {     //DOES NOT WORK. as HashSet can be homogenous, we cant retireve int only
////			System.out.println(a);
////		}
//		for(Object a:hs) { // GENERIC OBJECT TYPE
//			System.out.println(a);
//		}
//		
//		Iterator ii = hs.iterator();
//		while(ii.hasNext()) {
//			Object obj = ii.next();
//			if(obj.equals(10)) {
//				ii.remove();
//			}
//		}
//		System.out.println(hs);
		
//		ArrayList al = new ArrayList();
//		al.add(30); al.add(10); al.add(50);
//		// To iterate: for each, for with index, 
//		//iterator class(only forward), ListIterator (bidirectional)
//		ListIterator li = al.listIterator();
//		while(li.hasNext()) {
//			Object obj = li.next();
//			System.out.println(obj);
//		}
//		while(li.hasPrevious()) {
//			Object obj = li.previous();
//			System.out.println(obj);
//		}
		
		HashMap hm = new HashMap();
		hm.put(3, "Dave");
		hm.put(5, "Ben");
		hm.put(15, "DaveBen");
		//for each DOESNT work, even with generic object
		Set entries = hm.entrySet();  //get entries from dict, store in set
		Set keys = hm.keySet();  //get Keys from dict, store in set
		
		Iterator ii = entries.iterator();
		while(ii.hasNext()) {
			Object obj = ii.next();
			System.out.println(obj);
		}
		
	}

}
