package com.slokam.SpringBoot1;

import org.springframework.stereotype.Component;

@Component
public class MathPojo {
	
	private int a;
	private int b;
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}	
}
