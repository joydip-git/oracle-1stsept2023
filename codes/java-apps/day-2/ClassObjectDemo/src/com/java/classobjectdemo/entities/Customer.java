package com.java.classobjectdemo.entities;

public class Customer {
	private String name;
	private String email;
	private long mobileNo;
	private int doorNo;
	private String locality;
	private String street;
	private String city;

	public Customer() {
		/*name = null;
		email = null;
		mobileNo = 0;
		doorNo = 0;
		street = null;
		locality = null;
		city = null;*/
	}

	public Customer(String custName, String custEmail, long custMobile, int custDoorNo, String custStreet,
			String custLocality, String custCity) {
		name = custName;
		email = custEmail;
		mobileNo = custMobile;
		doorNo = custDoorNo;
		street = custStreet;
		locality = custLocality;
		city = custCity;
	}
}
