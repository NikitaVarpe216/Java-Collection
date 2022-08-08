package com.java.collections;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> tr=new TreeSet<>();
		tr.add("Sayali");
		tr.add("Ankita");
		tr.add("Priya");
		tr.add("Sneha");
		tr.add("Sayali");
		//tr.add(null);
		System.out.println("TreeSet elements are: "+tr);
	}

}
