package com.java.collections;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable<Integer, String> ht=new Hashtable<>();
		ht.put(1, "Nikita");
		ht.put(2, "Sayali");
		ht.put(3, "Sneha");
		ht.put(1, "Sanika");
		ht.put(5, "Sayali");
		System.out.println(ht);
		System.out.println(ht.containsKey(4));
		
	}

}
