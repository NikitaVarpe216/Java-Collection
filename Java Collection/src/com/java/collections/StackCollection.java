package com.java.collections;

import java.util.Stack;

public class StackCollection {

	public static void main(String[] args) {
		Stack<Integer> st=new Stack<>();
		System.out.println("Check Stack empty or not: "+st.empty());
		st.push(5);
		st.push(3);
		st.push(2);
		st.push(9);
		st.add(2);
		st.push(9);
		st.add(0);
		st.push(5);
		st.push(3);
		st.push(2);
		st.push(9);
		st.add(2);
		st.push(9);
		st.add(0);
		System.out.println("Elements of stack: "+st);
		System.out.println("Check Stack empty or not: "+st.isEmpty());
		st.pop();
		System.out.println("Elements of stack: "+st);
		
		System.out.println("Elements of stack: "+st.peek());
		System.out.println("Elements of stack: "+st);
		
		System.out.println("Searching element: "+st.search(5));
		System.out.println("Capacity of stack: "+st.capacity());
		System.out.println("Elements of stack: "+st);
		System.out.println("IndexOf Vector list: "+st.indexOf(2));
		System.out.println("Last IndexOf Vector list: "+st.lastIndexOf(2));

	}

}
