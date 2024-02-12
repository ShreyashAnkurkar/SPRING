package com.sitech.controller;

import com.sitech.dto.guestInfoDTO;
import com.sitech.service.Iguestservice;
import com.sitech.vo.GuestinfoVO;

public class MainController {

	Iguestservice service;

	public MainController(Iguestservice service) {
		System.out.println("MainController.MainController()");
		this.service = service;
	}
	
	public String processGuest(GuestinfoVO vo)throws Exception{
		guestInfoDTO dto=new guestInfoDTO();
		dto.setGname(vo.getGname());
		dto.setGaddress(vo.getGaddress());
		dto.setDaysToStay(Integer.parseInt(vo.getDaysToStay()));
		dto.setChargePerDay(Float.parseFloat(vo.getChargePerDay()));
		//use service obj to call registerguest()method
		
		String result=service.registerGuest(dto);
		return result;
		
	}
	
	
}
