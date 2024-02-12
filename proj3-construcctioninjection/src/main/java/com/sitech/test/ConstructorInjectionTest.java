package com.sitech.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.sitech.beans.Employees;

public class ConstructorInjectionTest {
	
	public static void main(String[] args) {
		//create connection with spring bean cfg file
		ClassPathResource resource= new ClassPathResource("com/sitech/cfg/applicationcontext.xml");
		//activate the IOC/Beanfactory container
		XmlBeanFactory factory=new XmlBeanFactory(resource);
		
		Object obj=factory.getBean("emp");
		
		Employees e=(Employees)obj;
		System.out.println(e);
	}

}
