package com.Spring1.lab;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.Spring1.entity.Mcq;


@SpringBootApplication
public class LabApplication {
	public static void main(String[] args) {

		Resource resource = new ClassPathResource("ApplicationContext.xml");
		BeanFactory bf = new XmlBeanFactory(resource);
		
		Mcq m =(Mcq) bf.getBean("mcq");
	m.display();
}
}
