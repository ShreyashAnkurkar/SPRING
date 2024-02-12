package com.sitech.beans;

import java.util.Date;

//Target class
public class WeekendDayTester {
	
	
	//HAS-A property declaration
	Date date;
	
	public WeekendDayTester() {
		
		System.out.println("WeekendDayTester.WeekendDayTester()...");
		
	}
	
	//setter method defination
	public void setDate(Date date) {
		System.out.println("WeekendDayTester.setDate()....");
		
		this.date = date;
	}
	
	public String testWeekendDay() {
		
		
		System.out.println("WeekendDayTester.testWeekendDay()...");
		
		String msg = null;
		
		//get current day 
		int day = date.getDay();
		
		if(day==1 || day==2 || day==3 || day==4 || day==5) {
			msg = "Its a week day!!! go to work...."+day;
		}
		else {
			msg = "Enjoy!!!! its weekend day.....";
		}
		
		//return massage
		return msg;
	}
	
	

}