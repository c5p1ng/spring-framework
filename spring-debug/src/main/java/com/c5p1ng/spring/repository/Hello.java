package com.c5p1ng.spring.repository;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Repository;

@Repository
public class Hello implements BeanNameAware, EnvironmentAware {
	private String beanName;
	private Environment environment;

	public void hello(){
		System.out.println("Hello,csp!");
	}

	@Override
	public void setBeanName(String name) {
		this.beanName = name;
	}

	@Override
	public void setEnvironment(Environment environment) {
		this.environment = environment;
	}

	public String getBeanName() {
		return beanName;
	}

	public Environment getEnvironment() {
		return environment;
	}
}
