package com.altimetrik;

public class User {

	private String name;
	private String companyName;
	private Address address;
	
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public void setAddress(Address address) {
		this.address = address;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return companyName;
	}

	public void setAddress(String address) {
		this.companyName = address;
	}
	public void printData() {
		System.out.println("User : "+name+" is working with "+companyName +" & its address "+address.getZipcode() + " : "+address.getCountry());
	}
}
