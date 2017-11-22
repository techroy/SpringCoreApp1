package com.ioc.beans;

public class MessageBean {

	private int index;

	private String message;

	public MessageBean(int index, String message) {
		this.index = index;
		this.message = message;
	}

	
	public void show(){
		
		System.out.println("index---"+index+"---message"+message);
	}
}
