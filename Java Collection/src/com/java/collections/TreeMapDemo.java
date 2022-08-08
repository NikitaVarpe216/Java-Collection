package com.java.collections;

import java.util.Iterator;
import java.util.TreeMap;


public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<Integer, String> ht=new TreeMap<>();
		ht.put(1, "Nikita");
		ht.put(2, "Sayali");
		ht.put(3, null);
		ht.put(1, "Sanika");
		//ht.put(null, "Sanika");
		ht.put(5, null);
		System.out.println(ht);
		System.out.println(ht.descendingMap());
	
		Iterator x=(Iterator) ht.descendingKeySet();
		while(x.hasNext()) {
			System.out.println("Value is: "+x.next());
		}

	}

}
