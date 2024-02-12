package com.sitech.service;

import com.sitech.dao.IguestDAO;
import com.sitech.dto.guestInfoDTO;

public class GuestServiceimpl implements Iguestservice {

	IguestDAO dao;
	
	public GuestServiceimpl(IguestDAO dao) {
		System.out.println("GuestServiceimpl.GuestServiceimpl()");
		this.dao = dao;
	}

	public String registerGuest(guestInfoDTO dto) {
		return null;
	}

}
