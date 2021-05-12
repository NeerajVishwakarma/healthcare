package com.system.healthcare.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * @author Neeraj Vishwakarma
 *
 */
@Entity
public class Hospital {

	@GeneratedValue(strategy = GenerationType.AUTO)
	private long Id;
	private String Name;
	private String HID;
	private String Address;
	private String Pincode;
	private String Phoneno;
	private String City;
	private String State;
	
	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getHID() {
		return HID;
	}

	public void setHID(String hID) {
		HID = hID;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getPincode() {
		return Pincode;
	}

	public void setPincode(String pincode) {
		Pincode = pincode;
	}

	public String getPhoneno() {
		return Phoneno;
	}

	public void setPhoneno(String phoneno) {
		Phoneno = phoneno;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	@Override
	public String toString() {
		return "Hospital [Name=" + Name + ", HID=" + HID + ", Address=" + Address + ", Pincode=" + Pincode
				+ ", Phoneno=" + Phoneno + ", City=" + City + ", State=" + State + "]";
	}
	
}
