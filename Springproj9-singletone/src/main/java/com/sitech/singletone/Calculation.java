package com.sitech.singletone;

public class Calculation {
	
	//create private static Instance Variable
	private static Calculation INSTANCE;
	
	//create private static 0 param constructor
	private Calculation() {
		System.out.println("Calculation.Calculation(----0 param cons)");
	}
	
	//create static factory method to return current class object
	public static Calculation getInstance() {
		if(INSTANCE==null) {
			INSTANCE = new Calculation();
		}
		return INSTANCE;
	}
	public double add(float num1,float num2) {
		double result =num1+num2;
		return result;
	}
	

}
