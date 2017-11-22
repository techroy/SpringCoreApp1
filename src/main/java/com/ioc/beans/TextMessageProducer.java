package com.ioc.beans;

public class TextMessageProducer implements IMessageProducer {

	public TextMessageProducer() {
	
		System.out.println("Text message Producer");
		
	}
	
	
	
	public String formatMsg(String message) {
		
		return message;
	}

}
