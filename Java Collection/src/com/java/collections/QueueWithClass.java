package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;

class Emp implements Comparable<Emp>{
	int id;
	String name;
	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int compareTo(Emp e) {
		if(id>e.id)
			return 1;
		else if (id<e.id) 
			return -1;
		else 
			return 0;
		
	}
}

public class QueueWithClass {

	public static void main(String[] args) {
		ArrayList<Emp> q=new ArrayList(); 
		Emp e1=new Emp(40, "Sayali");
		Emp e2=new Emp(60, "Shital");
		Emp e3=new Emp(30, "Ankita");
		q.add(e1);
		q.add(e2);
		q.add(e3);
		
		
		Collections.sort(q);
		System.out.println(q);
		for(Emp em : q) {
			System.out.println(em.id);
			System.out.println(em.name);
		}
		
		

	}

}
