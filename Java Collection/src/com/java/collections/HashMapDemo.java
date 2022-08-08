package com.java.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<>();
		hm.put(1, "Nikita");
		hm.put(2, "Sayali");
		hm.put(3, "Sneha");
		hm.put(1, "Sanika");
		hm.put(5, "Sayali");
		System.out.println(hm);
		hm.putIfAbsent(6, "Rinkal");
		System.out.println(hm);
		System.out.println("Keys present in Hashmap: "+hm.keySet());
		System.out.println("Replace the value: "+hm.replace(3, "Sneha", "Sanu"));
		System.out.println(hm);
		System.out.println(hm.containsKey(1));
		for (Map.Entry<Integer, String> entry : hm.entrySet()) {
//			Integer key = entry.getKey();
//			String val = entry.getValue();
			
			
		}
		System.out.println(hm.entrySet());
	}

}
