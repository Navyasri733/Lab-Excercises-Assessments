package com.Example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity

public class Address {
	
	@Id
	@GeneratedValue
	private int addrId;
	private String city;
	private String district;
	private String state;
	
	
	public Address() {}

	public Address(String city, String district, String state) {
		super();
		this.city = city;
		this.district= district;
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getAddrId() {
		return addrId;
	}

	public void setAddId(int addrid) {
		this.addrId = addrid;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", district=" + district + ", state=" + state + "]";
	}
	
	
	

}
