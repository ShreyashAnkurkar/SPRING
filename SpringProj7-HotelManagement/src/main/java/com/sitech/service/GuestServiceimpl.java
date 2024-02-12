package com.sitech.service;

import com.sitech.bo.GuestInfoBO;
import com.sitech.dao.IguestDAO;
import com.sitech.dto.guestInfoDTO;

public class GuestServiceimpl implements Iguestservice {

	IguestDAO dao;
	
	public GuestServiceimpl(IguestDAO dao) {
		System.out.println("GuestServiceimpl.GuestServiceimpl()");
		this.dao = dao;
	}

	public String registerGuest(guestInfoDTO dto)throws Exception {
		System.out.println("GuestServiceimpl.registerGuest()----in service method");
		// calculate bill amount
		double billAmount=dto.getDaysToStay()*dto.getChargePerDay();
		//prepare bo object having data to be stored to db table
		GuestInfoBO bo = new GuestInfoBO();
		bo.setGname(dto.getGname());
		bo.setGaddress(dto.getGaddress());
		bo.setBillAmount(dto.getBillAmount());
		
	//use dao object to call insert method
		int count=dao.insert(bo);
		if(count==0) {
			return "Registration fail...";
		}
		else {
			return "Registration Success!!!";
		}
	}

}
