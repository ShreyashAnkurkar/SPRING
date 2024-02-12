package com.sitech.factory;

import com.sitech.components.adharinfo;
import com.sitech.components.person;
import com.sitech.components.teacher;

public class personFactory {
   public static person getperson(String type) {
	   person per=null;
	   adharinfo info=null;
	   
	   if(type.equalsIgnoreCase("teach")) {
		   info=new adharinfo(2033984856555L,51,89856999658L);
		   per=new teacher("ravi","pune",info,"physics",5000.5);
	   }else if(type.equalsIgnoreCase("stud")) {
		   info=new adharinfo(33984856555L,51,9856999658L);
		   per=new teacher("shyam","mumbai",info,"science",101);
	   }else {
		   throw new IllegalArgumentException("Person type not valid");
	   }
	   return per;
   }
}
