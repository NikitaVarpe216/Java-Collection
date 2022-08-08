package com.java.collections;

import java.util.Collections;
import java.util.Vector;

public class VectorCollection {

	public static void main(String[] args) {
		Vector<String> v=new Vector<>();
		v.add("Seeta");
		v.addElement("Ankita");
		v.add("Pooja");
		v.add("Seeta");
		v.add("Meera");
		System.out.println("Vector list: "+v);
		
//		System.out.println("Vector last element is: "+v.lastElement());
//		System.out.println("Display element of index posion 3 Vector : "+v.get(3));
//		System.out.println("set element: "+v.set(3, "Meena"));
//		System.out.println("Vector list: "+v);
//		System.out.println("Capacity Vector list: "+v.capacity());
//		//Collections.sort(v);
//		//System.out.println("Sorted Vector list: "+v);
		System.out.println("Vector list: "+v);
		System.out.println("IndexOf Vector list: "+v.indexOf("Seeta"));
		System.out.println("Last IndexOf Vector list: "+v.lastIndexOf("Seeta"));
	}

}
