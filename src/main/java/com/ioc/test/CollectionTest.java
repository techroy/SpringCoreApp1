package com.ioc.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ioc.beans.MessageBean;
import com.ioc.collection.beans.College;
import com.ioc.collection.beans.Course;
import com.ioc.collection.beans.OnlineCourse;
import com.ioc.collection.beans.Student;

public class CollectionTest {

	public static void main(String[] args) {
	
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("/com/ioc/config/application-context.xml"));
		//Student student = (Student)beanFactory.getBean("student");
		//student.showSubjects();

		//Course btech = (Course)beanFactory.getBean("btech");
		
		//Course mca = (Course)beanFactory.getBean("mca");
		
		//System.out.println(btech.hashCode());
		
		//System.out.println(mca.hashCode());
		
		//btech.showFculties();
		
		//College college = (College)beanFactory.getBean("college");
		
		//college.showStudenCOurseDetails();
		
		OnlineCourse onlineCourse = (OnlineCourse)beanFactory.getBean("onlinecourse");
		
		onlineCourse.showCourseWithFaculties();
		
	}

}
