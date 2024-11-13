package com.day2.entity;

public class employee {
	private int eid;
	private String ename;
	private String city;
	
	public void setEid(int eid) {
		this.eid=eid;	
	}
	
	public void setEname(String ename) {
		this.ename=ename;
	}
	
	public void setCity(String city) {
		this.city=city;
	}
	
	public int getEid() {
		return eid;
	}
	
	public String getEname() {
		return ename;
	}
	
	public String getCity() {
		return city;
	}
	
	public String toString() {
		return "Emp id: "+eid+"EMP name: "+ename+"Emp city: "+city;
	}

}
