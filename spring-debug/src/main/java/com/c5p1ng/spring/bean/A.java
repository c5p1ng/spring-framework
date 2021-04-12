package com.c5p1ng.spring.bean;

public class A {
	static {
		System.out.println("init A");
	}

	private B b;

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}
}
