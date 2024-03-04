package com.sitech.beans;

public class DTDC implements Courier{
    
	public DTDC() {
		System.out.println("DTDC.DTDC()----0 param cons");
	}

	public String deliver(int oid) {
		String msg="Delivery by DTDC for order id:"+oid;
		return msg;
	}

}
