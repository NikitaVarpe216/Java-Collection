package com.java.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementProject {

	public static void main(String[] args) {
		int choice,age;
		String name,city;
		Scanner sc=new Scanner(System.in);
		ArrayList<Student> as=new ArrayList<Student>();
		while(true)
		{
			System.out.println("Press 1 for Add student Detail");
			System.out.println("Press 2 for Show the Details of Student");
			System.out.println("Press 3 for search the Details of Student by name");
			System.out.println("Press 4 for search the Details of Student by city");
			System.out.println("Press 5 for delete the Details of Student");
			System.out.println("Enter your Choice");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				
				System.out.println("Enter the name of Student");
				name=sc.next();
				
				System.out.println("Enter the age of Student");
				age=sc.nextInt();
				System.out.println("Enter City");
				city=sc.next();
				Student s=new Student();
				s.setName(name);
				
				s.setAge(age);
				s.setCity(city);
				as.add(s);
				System.out.println("******Record of student Added sucessfully******");
				break;
			case 2:
				for(int i=0;i<as.size();i++) {
					System.out.println("Student Record: "+i);
					System.out.println("---------------------------");
				System.out.println("Student Name: "+as.get(i).getName());
				
				System.out.println("Student Age: "+as.get(i).getAge());
				System.out.println("Student City: "+as.get(i).getCity());
				System.out.println("---------------------------");
			}
				break;
			case 3:
				System.out.println("Enter the name of student which you have to search");
				name=sc.next();
				int srch=0;
				for(int i=0;i<as.size();i++) {
					if(as.get(i).getName().contains(name)) {
					System.out.println("Student Name: "+as.get(i).getName());
				
					System.out.println("Student Age: "+as.get(i).getAge());
					System.out.println("Student City: "+as.get(i).getCity());
					srch++;
					}
					
				}
				if(srch==0)
					System.out.println("Record not found");
				break;
			case 4:
				System.out.println("Enter the city of student which you have to search");
				city=sc.next();
				int srchcity=0;
				for(int i=0;i<as.size();i++) {
					if(as.get(i).getCity().contains(city)) {
					System.out.println("Student Name: "+as.get(i).getName());
					
					System.out.println("Student Age: "+as.get(i).getAge());
					System.out.println("Student City: "+as.get(i).getCity());
					}
				}
				if(srchcity==1)
					System.out.println("Record not found");
				break;
			case 5:
				System.out.println("Enter the name of student which you have to delete");
				name=sc.next();
				int found=0;
				for(int i=0;i<as.size();i++) {
					if(as.get(i).getName().contains(name)) {
						System.out.println("Record found "+(++found));
						as.remove(i);
						System.out.println("Record deleted successfully...");
						
					}
					if(found==1)
						System.out.println("Record not found");
						
				}
				break;
				
//			case 6:
//				System.out.println("Enter the name of student which you have to delete");
//				name=sc.next();
//				for(int i=0;i<as.size();i++) {
//					if(as.get(i).getName().contains(name)) {
//						Student s1=as.get(i);
//						s1.setAge(age);
//						as.set(i, s1);
//					}
//					
//		}
//				break;
			//case 7:
				

	}

	}
}
}
