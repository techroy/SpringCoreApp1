package com.ioc.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ioc.beans.HtmlMessageProducer;
import com.ioc.beans.MessageWriter;

public class MessageTest {

	public static void main(String[] args) {
		
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("/com/ioc/config/application-context.xml"));
		
		MessageWriter messageWriter = (MessageWriter)beanFactory.getBean("messagewriter");
		
		messageWriter.writeMessage("Welcome to Spring!");
		
		
		

	}

}
