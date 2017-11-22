package com.ioc.collection.beans;

import java.util.Properties;

public class OnlineCourse {
	
	private Properties courseWithFaculties;

	public void setCourseWithFaculties(Properties courseWithFaculties) {
		this.courseWithFaculties = courseWithFaculties;
	}
	
	public void showCourseWithFaculties(){
		
		for(Object ob:courseWithFaculties.keySet()){
			
			System.out.println("course name:"+ob);
			System.out.println("Faculty name:"+courseWithFaculties.getProperty((String)ob));
			
		}
	}

}
