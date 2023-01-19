package com.Spring1.lab;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.Spring1.entity.Employee;


public class Test_emp {
	public static void main(String[] args) {

		Resource resource = new ClassPathResource("ApplicationContext.xml");
		BeanFactory bf = new XmlBeanFactory(resource);
		
		Employee ep =(Employee) bf.getBean("emp");
	ep.display();
		}
}
