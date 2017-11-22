package com.ioc.collection.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class A {

	String name;
	public A(String name){
		
		this.name = name;
	}
	
	public static void main(String[] args) {
		
		
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("/com/ioc/config/application-context.xml"));
		
		A a = (A)beanFactory.getBean("a1");
		
		System.out.println(a.name);

	}

}
