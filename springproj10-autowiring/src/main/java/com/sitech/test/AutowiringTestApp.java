package com.sitech.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sitech.beans.Amazon;

public class AutowiringTestApp {

	public static void main(String[] args) {
		//create application context container
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/sitech/cfg/applicationcontext.xml");
		
		//get the target class object
		Amazon amz=ctx.getBean("amz",Amazon.class);
		
		String resultmsg=amz.shopping(new String[] {"watch","bottle","shoes"}, new double[] {500.0,700.0,800.0});
		
		System.out.println(resultmsg);

	}

}
