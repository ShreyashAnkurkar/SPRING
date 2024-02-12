package com.sitech.beans;

public class Employees {
	
	//has-A Property
	private String ename;
	private double esalary;
	private String ecity;
	private int eage;
	public Employees(String ename, double esalary, String ecity, int eage) {
		super();
		this.ename = ename;
		this.esalary = esalary;
		this.ecity = ecity;
		this.eage = eage;
	}
	@Override
	public String toString() {
		return "Employees [ename=" + ename + ", esalary=" + esalary + ", ecity=" + ecity + ", eage=" + eage + "]";
	}
	
	
	

}
