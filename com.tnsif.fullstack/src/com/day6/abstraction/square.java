package com.day6.abstraction;

public class square extends shape {
	private float length;
	
	public square() {
		
	}
	
	public square(float length) {
		this.length=length;
	}
	
	@Override
	void calarea() {
		area=length*length;
	}
}
