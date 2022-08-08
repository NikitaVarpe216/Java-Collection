package com.java.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashsetCollection {

	public static void main(String[] args) {
		HashSet<Integer> h=new HashSet<>(2,(float)0.50);
		HashSet<Integer> hs=new HashSet<>();
//		h.add("Sayali");
//		h.add("Ankita");
//		h.add("Priya");
//		h.add("Sneha");
//		h.add("Sayali");
//		h.add(null);
		
		h.add(1);
		h.add(5);
		h.add(3);
		h.add(null);
		h.add(7);
		
		
		System.out.println("Element in hashset: "+h);
		System.out.println("Element in hashset: "+h.size());
		//System.out.println("Remove all elements : "+h.removeAll(h));
		System.out.println("Element in hashset: "+h);
		System.out.println("Element in hashset: "+h.hashCode());//Ascii values addition is print
		hs.addAll(h);
		//System.out.println("Add All Method: "+);	
		System.out.println("Element in hashset hs: "+hs);
		System.out.println("Elements in hashset hs is: "+hs.containsAll(h));
		 List<Integer> list=new ArrayList<>(h);
		 System.out.println("Hashset to arraylist Conversion: "+list);
		 

	}

}
