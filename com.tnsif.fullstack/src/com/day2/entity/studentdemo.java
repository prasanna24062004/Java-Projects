package com.day2.entity;

public class studentdemo {
	public static void main (String[] args) {
		
		student s1=new student();
		student s2=new student();
		student s3=new student();
		student s4=new student();
		student s5=new student();
		
		s1.setCid(100);
		s1.setCname("Prasanna");
		s1.setAddress("46. kuchipalayam street");
		s1.setCity("Panruti");
		
		s2.setCid(101);
		s2.setCname("Rahul");
		s2.setAddress("72 arutperunjothi nagar");
		s2.setCity("NEyveli");
		
		s3.setCid(102);
		s3.setCname("Prakash kumar");
		s3.setAddress("Selva nagar");
		s3.setCity("Panruti");
			
		s4.setCid(103);
		s4.setCname("Vimal raj");
		s4.setAddress("Indira nagar");
		s4.setCity("Neyveli");
		
		s5.setCid(100);
		s5.setCname("Prvin");
		s5.setAddress("Edayanchavadi");
		s5.setCity("Pudhuchery");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
	}
}
