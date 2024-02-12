package com.sitech.components;

public abstract class person {

	public String name;
	private String address;
	private adharinfo info;
	
	public person(String name,String address, adharinfo info) {
		System.out.println("person.person()---3 param cons");
		this.name=name;
		this.address=address;
		this.info=info;
	}
	
	public String toString() {
		return "Person[name="+name+",address="+address+",info="+info+"]";
	}
	
	
	
}
