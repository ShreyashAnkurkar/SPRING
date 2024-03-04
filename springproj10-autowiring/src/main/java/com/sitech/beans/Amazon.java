package com.sitech.beans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;

public class Amazon {
	@Autowired
	private Courier courier;

	public Amazon() {
		System.out.println("Amazon.Amazon()");
	}

	
	public String shopping(String[] items,double[] prices) {
		//Calculate bill
		
		double amount=0.0;
		for(int i=0;i<prices.length;i++) {
			amount=amount+prices[i];
		}
		Random random=new Random();
		
		int orderId=random.nextInt(1000);
		
		String courierMsg = courier.deliver(orderId);
		
		String shoppingDetails="items:"+Arrays.toString(items)+"Bill Amount:"+amount;
		return shoppingDetails+"\t"+courierMsg;
		
		
		
	}
	
	
	

}
