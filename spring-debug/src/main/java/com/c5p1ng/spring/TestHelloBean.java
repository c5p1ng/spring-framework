package com.c5p1ng.spring;

import com.c5p1ng.spring.config.MyConfig;
import com.c5p1ng.spring.repository.Hello;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestHelloBean {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);
		Hello hello = ac.getBean(Hello.class);
		hello.hello();
		System.out.println(hello.getBeanName());
		String[] activeProfiles = hello.getEnvironment().getActiveProfiles();
		for(String activeProfile : activeProfiles) {
			System.out.println(activeProfile);
		}
	}

	public void calculate(int[] arr) {

	}
}
