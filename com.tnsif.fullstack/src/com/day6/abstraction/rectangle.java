package com.day6.abstraction;

public class rectangle extends shape{
	private float width,height;
	
	public rectangle() {
	
	}
	
	public rectangle(float width,float height) {
		this.width=width;
		this.height=height;
	}

	@Override
	void calarea() {
		area=width*height;
	}
	

}
