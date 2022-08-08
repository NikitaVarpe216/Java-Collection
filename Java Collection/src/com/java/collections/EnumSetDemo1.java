package com.java.collections;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetDemo1 {
	enum Color{
		red,pink,green,voilet,black
	}
	
	public static void main(String[] args) {
		
 EnumSet<Color> c= EnumSet.allOf(Color.class);
 System.out.println("Empty Enumset:"+c);
 EnumSet<Color> c1= EnumSet.range(Color.green,Color.black);
 System.out.println("Range of Enumset:"+c1);
 //c1.add(Color.valueOf("blue"));
 Iterator<Color> itr=c.iterator();
// System.out.println("Elements in set are: ");
 while (itr.hasNext()) {
	System.out.println(itr.next());
	
}
 System.out.println("Add to Enumset:"+c1);
 
	}

}
