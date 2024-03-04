package com.sitech.beans;

public class Bluedart implements Courier{
     
	public Bluedart() {
	System.out.println("Bluedart.Bluedart()----0 param const");	
	}

	public String deliver(int oid) {
		
		String msg="Delivery by bluedart for order id:"+oid;
		return msg;
	}

}
