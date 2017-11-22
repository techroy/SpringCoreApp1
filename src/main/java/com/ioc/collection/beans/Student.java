package com.ioc.collection.beans;

import java.util.List;

public class Student {
	
	private List<String> list;

	

	public void setList(List<String> list) {
		this.list = list;
	}



	public void showSubjects(){
		
		System.out.println(list.getClass().getName());
		
		for(Object ob:list){
			
			System.out.println(ob);
		}
	}
	
	

}
