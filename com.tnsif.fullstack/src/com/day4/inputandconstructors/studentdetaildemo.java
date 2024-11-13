package com.day4.inputandconstructors;
import java.util.*;

public class studentdetaildemo {
	public static void main(String args[]) {
		studentdetail s1=new studentdetail();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Name: ");
		s1.setSname(sc.nextLine());
		
		System.out.println("Number: ");
		s1.setSid(sc.nextLong());
		
		System.out.println("Grade: ");
		s1.setSgrade(sc.next().charAt(0));
		
		
		System.out.println("percentage: ");
		s1.setSper(sc.nextFloat());
		
		System.out.println(s1);
		
		
		
		

	}
	

}
