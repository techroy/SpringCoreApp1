package com.ioc.collection.beans;

import java.util.Set;

public class Course {
	
	private Set<String> faculties;

	public Course(Set<String> faculties) {
		
		this.faculties = faculties;
	}
	
	public void showFculties(){
		
		for(String faculty:faculties){
			
			System.out.println(faculty);
		}
	}
	
	

}
