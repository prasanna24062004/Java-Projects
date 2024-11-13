package com.day6.abstraction;

public abstract class shape {
	protected float area;
	abstract void calarea();
	void show() {
		System.out.println("Area of shape is"+area);
	}
}
