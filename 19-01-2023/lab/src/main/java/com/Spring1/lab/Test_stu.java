package com.Spring1.lab;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.Spring1.entity.Student;

public class Test_stu {
	public static void main(String[] args) {

		Resource resource = new ClassPathResource("ApplicationContext.xml");
		BeanFactory bf = new XmlBeanFactory(resource);
		
		Student m =(Student) bf.getBean("stu");
	m.display();
}
}
