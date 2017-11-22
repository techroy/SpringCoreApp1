package com.ioc.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ioc.beans.MessageBean;

public class MessageBeanTest {

	public static void main(String[] args) {

		
		
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("/com/ioc/config/application-context.xml"));
		
		MessageBean messageBean = (MessageBean)beanFactory.getBean("messagebean");
		
		messageBean.show();

	}

}
