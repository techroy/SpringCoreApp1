package com.ioc.beans;

public class HtmlMessageProducer implements IMessageProducer {

	
	
	
	
	public HtmlMessageProducer() {

		System.out.println("Html message producer");
	}

	public String formatMsg(String message) {
		
		return "<html><body>" + message + "</body></html>";
	}

	
	
	

}
