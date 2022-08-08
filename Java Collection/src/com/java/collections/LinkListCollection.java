package com.java.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkListCollection {

	public static void main(String[] args) {
		LinkedList<String> link=new LinkedList<>();
		link.add("Nikita");
		link.addFirst("Nisha");
		link.add("sneha");
		link.addLast("sima");
//		System.out.println("Print Linklist: "+link);
//		System.out.println("Print First Element: "+link.peek());
//		System.out.println("Remove first element: "+link.poll());
//		System.out.println("Print Linklist: "+link);
//		System.out.println("Remove element: "+link.remove());
//		System.out.println("Print Linklist: "+link);
//		System.out.println("Remove element: "+link.removeLast());
//		System.out.println("Print Linklist: "+link);
//		
		
		Iterator x=link.descendingIterator();
		while(x.hasNext()) {
			System.out.println("Value is: "+x.next());
		}

	}

}
