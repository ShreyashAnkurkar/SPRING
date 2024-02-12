package com.sitech.components;

public class student extends person{
	
	private int rollNo;
	private String field;
	public student(String name, String address, adharinfo info, int rollNo, String field) {
		super(name, address, info);
		this.rollNo = rollNo;
		this.field = field;
	}
	@Override
	public String toString() {
		return "student [rollNo=" + rollNo + ", field=" + field + "]";
	}
	
	

}
