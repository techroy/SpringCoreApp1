package com.ioc.beans;

;

public class MessageWriter {

	IMessageProducer messageProducer = null;

	
	
	public MessageWriter(IMessageProducer messageProducer) {
		
		System.out.println("Message writer parameterised constructor");
		
		this.messageProducer =  messageProducer;
		
	}
	
	
	
	
	public void setMessageProducer(IMessageProducer messageProducer) {
		this.messageProducer = messageProducer;
	}

	public MessageWriter() {
		super();

		System.out.println("Message writer default constructor");
	}

	public void writeMessage(String message) {

		
		
		String formattedMsg = messageProducer.formatMsg(message);

		System.out.println(formattedMsg);

	}

}
