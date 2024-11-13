package com.day2.entity;

public class student {
	private int cid;
	private String cname;
	private String address;
	private String city;
	
	public void setCid(int cid) {
		this.cid=cid;	
	}
	
	public void setCname(String cname) {
		this.cname=cname;
	}
	      
	public void setAddress(String address) {
		this.address=address;
	}
	
	public void setCity(String city) {
		this.city=city;
	}
	
	public int getCid() {
		return cid;
	}
	
	public String getCname() {
		return cname;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getCity() {
		return city;
	}
	
	@Override
	public String toString() {
		return "Student name: "+cname+" student id: "+cid+" student address: "+address+" Student city: "+city;
	}
	
}
