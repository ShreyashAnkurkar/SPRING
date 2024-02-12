package com.sitech.dto;

import com.sitech.bo.GuestInfoBO;

public interface IGuestDAO {
	
	public int insert(GuestInfoBO bo)throws Exception;

}
