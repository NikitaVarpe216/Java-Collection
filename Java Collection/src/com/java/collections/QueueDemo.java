package com.java.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		PriorityQueue<String> pr=new PriorityQueue<>();
		pr.add("Mina");
		pr.add("sangita");
		pr.add("Nisha");
		pr.add("Mina");
		pr.add("Ankita");
		System.out.println("Elements of Priority Queue are: "+pr);
		System.out.println(pr.peek());//head element is print
		System.out.println("Remove: "+pr.remove());//head element is Remove
		System.out.println("Elements of Priority Queue are: "+pr);
	}

}
