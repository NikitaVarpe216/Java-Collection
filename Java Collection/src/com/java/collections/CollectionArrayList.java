package com.java.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CollectionArrayList {

	public static void main(String[] args) {
		List<String> li=new ArrayList<>();
		li.add("Sayali");
		li.add(0, "Ankita");
		li.add("Priya");
		li.add(1, "Nikita");
		li.add(null);
		
		System.out.println("List of elements: "+li);
		System.out.println("Length of list: "+li.size());
		System.out.println("Get of list: "+li.get(2));
		System.out.println("Set value to list: "+li.set(3, "Sakshi"));
		System.out.println("List of elements: "+li);
		System.out.println("Remove element: "+li.remove(2));
		System.out.println("List of elements: "+li);
		System.out.println("Contain of elements: "+li.contains("Nikita"));
		li.add("Nikita");
//		System.out.println("List of elements: "+li.toArray());
//        String[] arr=li.toArray(new String[0]);
//        for(String x: arr) {
//        	System.out.println(x+" ");
//			
//		}
//        Iterator itr=li.iterator();
//        while(itr.hasNext()) {
//        	System.out.println(itr.next());
//        }
		 		
	}

}
