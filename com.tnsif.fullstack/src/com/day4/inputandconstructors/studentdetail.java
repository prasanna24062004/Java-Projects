package com.day4.inputandconstructors;

public class studentdetail {
	private String sname;
	private char sgrade;
	private long sid;
	private float sper;
	
	public void setSname(String sname) {
		this.sname=sname;
	}
	public void setSid(long sid) {
		this.sid=sid;
	}
	public void setSgrade(char sgrade) {
		this.sgrade=sgrade;
	}
	public void setSper(float sper) {
		this.sper=sper;
	}
	
	public String getSname() {
		return sname;
	}
	public long getSid() {
		return sid;
	}
	public char getSgrade() {
		return sgrade;
	}
	public float getSper() {
		return sper;
	}
	
	public String toString() {
		return sname+"\n"+sid+"\n"+sgrade+"\n"+sper+"%";
		
	}
	

}
