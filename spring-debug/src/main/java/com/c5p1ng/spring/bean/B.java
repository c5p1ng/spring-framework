package com.c5p1ng.spring.bean;

public class B {
	static {
		System.out.println("init B");
	}
	private A a;

	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}
}
