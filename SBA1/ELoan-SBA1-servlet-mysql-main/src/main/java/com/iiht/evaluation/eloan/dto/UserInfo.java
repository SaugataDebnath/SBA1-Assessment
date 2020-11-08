package com.iiht.evaluation.eloan.dto;

public class UserInfo {

	private String username;
	private String firsttName;
	private String lastname;
	private String dob;
	private String gender;
	private String mobile;
	private String email;
	private String city;
	private String country;
	private String pincode;
	private String address;

	public UserInfo(String username, String firsttName, String lastname, String dob, String gender, String mobile,
			String email, String city, String country, String pincode, String address) {
		super();
		this.username = username;
		this.firsttName = firsttName;
		this.lastname = lastname;
		this.dob = dob;
		this.gender = gender;
		this.mobile = mobile;
		this.email = email;
		this.city = city;
		this.country = country;
		this.pincode = pincode;
		this.address = address;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirsttName() {
		return firsttName;
	}

	public void setFirsttName(String firsttName) {
		this.firsttName = firsttName;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
