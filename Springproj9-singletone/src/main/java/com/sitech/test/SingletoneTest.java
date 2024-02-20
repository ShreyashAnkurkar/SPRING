package com.sitech.test;

import com.sitech.singletone.Calculation;

public class SingletoneTest {

	public static void main(String[] args) {
		Calculation c1=Calculation.getInstance();
		Calculation c2=Calculation.getInstance();
		
		System.out.println(c1.hashCode()+"\t"+c2.hashCode());
		System.out.println(c1.add(40.0f,50.0f));
		System.out.println(c2.add(5.0f,5.0f));
		

		System.out.println(c1.hashCode()+"\t"+c2.hashCode());

	}

}
