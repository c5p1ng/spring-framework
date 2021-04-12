package com.c5p1ng.spring;

import com.c5p1ng.spring.bean.A;
import com.c5p1ng.spring.bean.B;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试循环依赖
 */
public class TestCircularDependency {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		A beanA = ac.getBean(A.class);
		B beanB = ac.getBean(B.class);
		System.out.println(beanA.getB() == beanB);
		System.out.println(beanB.getA() == beanA);
	}
}
