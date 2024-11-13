package com.day5.multilevelinheritance;
import java.util.Date;
public class Person {
	private String name; 
	private long conatctNo; 
	private Date dateOfBirth; 
	public Person(String name, long conatctNo, Date dateOfBirth) { 
	super(); 
	this.name = name; 
	this.conatctNo = conatctNo; 
	this.dateOfBirth = dateOfBirth; 
	} 
	public String getName() { 
	return name; 
	} 
	public void setName(String name) { 
	this.name = name; 
	} 
	public long getConatctNo() { 
	return conatctNo; 
	} 
	public void setConatctNo(long conatctNo) { 
	this.conatctNo = conatctNo; 
	} 
	public Date getDateOfBirth() { 
	return dateOfBirth; 
	} 
	public void setDateOfBirth(Date dateOfBirth) { 
	this.dateOfBirth = dateOfBirth; 
	} 
	public Person() { 
	} 
	public Person(String string, long l, Date date, String string2, int i, int j, String string3) {
		// TODO Auto-generated constructor stub
	}
	@Override 
	public String toString() { 
	return "Person [name=" + name + ", conatctNo=" + conatctNo + ", dateOfBirth=" + dateOfBirth + "]"; 
	}
	
}
