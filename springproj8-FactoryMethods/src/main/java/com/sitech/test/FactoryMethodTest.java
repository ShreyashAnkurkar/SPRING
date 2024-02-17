package com.sitech.test;

import java.util.Calendar;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class FactoryMethodTest {

	public static void main(String[] args) {
		 DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
         XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
         reader.loadBeanDefinitions("com/sitech/cfg/applicationcontext.xml");
         
         //get the bean class object
        Class c= factory.getBean("c1",Class.class);
         System.out.println("c object data"+c.toString()+"\t"+c.getClass());
         
         Calendar cal=factory.getBean("cal",Calendar.class);
         System.out.println("Calendar obj data:"+cal.toString()+"\t"+cal.getClass());

	}

}
