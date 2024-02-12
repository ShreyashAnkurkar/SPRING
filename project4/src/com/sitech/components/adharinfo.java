package com.sitech.components;

public class adharinfo {
	
	private long adharNo;
	private int age;
	private long contactNo;
	
	public adharinfo(long adharNo,int age,long contactNo) {
		
		System.out.println("adharinfo.adharinfo()--3 param con");
		this.adharNo=adharNo;
		this.age=age;
		this.contactNo=contactNo;
		
	}
	
	public String toString() {
		return "AdharInfo[adharNo="+adharNo+",age="+age+",contactNo="+contactNo+"]";
	}
}
