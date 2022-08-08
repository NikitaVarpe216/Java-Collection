package com.java.collections;

import java.util.HashSet;

public class SetOprations {

	public static void main(String[] args) {
		HashSet<Integer> h=new HashSet<>(2,(float)0.50);
		HashSet<Integer> hs=new HashSet<>();
		h.add(1);
		h.add(5);
		h.add(3);
		h.add(null);
		h.add(7);
		System.out.println("Elements in hashset h is: "+h);
		hs.add(2);
		hs.add(4);
		hs.add(5);
		System.out.println("Elements in hashset hs is: "+hs);
		
//		System.out.println("Intersection is: "+hs.retainAll(h));
//		System.out.println("Elements in hashset hs is: "+hs);
		
//		System.out.println("Elements in hashset hs is: "+hs.containsAll(h));
//		System.out.println("Elements in hashset hs is: "+hs);
//		System.out.println("Union is: "+hs.addAll(h));
		System.out.println("Elements in hashset hs is: "+hs);
		//System.out.println("Difference is: "+hs.removeAll(h));
		System.out.println("Difference is: "+h.removeAll(hs));
		System.out.println("Elements in hashset hs is: "+h);
		
	}

}
