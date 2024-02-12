package com.sitech.bo;

public class GuestInfoBO {

	private String gname;
	private String gaddress;
	private Float BillAmount;
	private String gContact;
	
	public GuestInfoBO() {
System.out.println("GuestInfoBO.GuestInfoBO()");
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

	public Float getBillAmount() {
		return BillAmount;
	}

	public void setBillAmount(Float billAmount) {
		BillAmount = billAmount;
	}

	public String getgContact() {
		return gContact;
	}

	public void setgContact(String gContact) {
		this.gContact = gContact;
	}
	
	
}
