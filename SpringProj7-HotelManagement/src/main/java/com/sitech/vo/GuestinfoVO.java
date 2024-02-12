package com.sitech.vo;

public class GuestinfoVO {
	
	private String gname;
	private String gaddress;
	private String daysToStay;
	private String ChargePerDay;
	private String gContact;
	
	public GuestinfoVO() {
	System.out.println("GuestinfoVO.GuestinfoVO()--- 0 param cons");	
	}

	public String getGname() {
		return gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

	public String getGaddress() {
		return gaddress;
	}

	public void setGaddress(String gaddress) {
		this.gaddress = gaddress;
	}

	public String getDaysToStay() {
		return daysToStay;
	}

	public void setDaysToStay(String daysToStay) {
		this.daysToStay = daysToStay;
	}

	public String getChargePerDay() {
		return ChargePerDay;
	}

	public void setChargePerDay(String chargePerDay) {
		ChargePerDay = chargePerDay;
	}

	public String getgContact() {
		return gContact;
	}

	public void setgContact(String gContact) {
		this.gContact = gContact;
	}
	
	
	
	
	
	

}
