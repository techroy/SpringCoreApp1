package com.ioc.collection.beans;

import java.util.Map;

public class College {
	
	private Map<String,Course> studentCourseMap;

	public void setStudentCourseMap(Map<String, Course> studentCourseMap) {
		this.studentCourseMap = studentCourseMap;
	}
	
	public void showStudenCOurseDetails(){
		
		for(String key:studentCourseMap.keySet()){
			
			System.out.println("student name:"+key);
			
			Course course = studentCourseMap.get(key);
			
			course.showFculties();
		}
	}	

}
