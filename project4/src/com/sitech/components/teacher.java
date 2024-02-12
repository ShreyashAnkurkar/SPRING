package com.sitech.components;

public class teacher extends person{

	private String subject;
	private double salary;
	public teacher(String name, String address, adharinfo info, String subject, double salary) {
		super(name, address, info);
		System.out.println("teacher.teacher()---5 param cons");
		this.subject = subject;
		this.salary = salary;
	}
	
	public String toString() {
		return "teacher [subject=" + subject + ", salary=" + salary + "]";
	}
	
	
	
	
}
