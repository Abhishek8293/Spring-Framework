package com.spring.entity;

public class Address {

	private int rno;
	private String city;
	private int pincode;

	public Address() {
		super();
	}

	public Address(int rno, String city, int pincode) {
		super();
		this.rno = rno;
		this.city = city;
		this.pincode = pincode;
	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [rno=" + rno + ", city=" + city + ", pincode=" + pincode + "]";
	}

}
