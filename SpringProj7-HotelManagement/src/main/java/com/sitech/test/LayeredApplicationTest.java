package com.sitech.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.sitech.controller.MainController;
import com.sitech.vo.GuestinfoVO;

public class LayeredApplicationTest {
	
	public static void main(String[] args) {
		String gname=null,gaddress=null,gContact=null,DaysToStay=null,ChargePerDay=null;
		
		
		//collect input from user
		Scanner sc= new Scanner(System.in);
		if(sc!=null) {
			System.out.println("Enter guest name");
			gname=sc.next();
			
			System.out.println("Enter guest address");
			gaddress=sc.next();

			System.out.println("Enter guest contactNo");
			gContact=sc.next();

			System.out.println("Enter guest No. of days to stays");
			DaysToStay=sc.next();

			System.out.println("Enter perday charge");
			ChargePerDay=sc.next();
		}
		//Create Vo Class Object
		GuestinfoVO vo=new GuestinfoVO();
		//set The local variables data to vo object
		vo.setGname(gname);
		vo.setGaddress(gaddress);
		vo.setgContact(gContact);
		vo.setChargePerDay(ChargePerDay);
		vo.setDaysToStay(DaysToStay);
		
		 DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
	        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory); 
	        reader.loadBeanDefinitions("com/sitech/cfg/applicationcontext.xml");
	        
	        //get the target bean class obj/controller obj
	        MainController controller=factory.getBean("gcontroller",MainController.class);
	        
	        
	}

}
