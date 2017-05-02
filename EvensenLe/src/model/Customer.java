package model;

import data.CustomerDataFile;
//CLASS LOOKS OK 
//DO WE KNOW WHAT THE @OVERRIDE MEANS?

public class Customer {

	private String firstName;

	private String lastName;

	private String cprNumber;

	private String address;

	private String houseNumber;

	private String mobileNumber;

	private String userName;

	private String password;
	
	private String postCode;

	
	//CONSTRUCTOR
	public Customer(){
			
		}
	
	//CONSTRUCTOR WITH SPECIFICS
	public Customer (String firstName, String lastName, String address, String houseNumber, String postcode, String cprNumber, String mobileNumber, String userName, String password) {
	
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.houseNumber = houseNumber;
		this.postCode = postcode;
		this.cprNumber = cprNumber;
		this.mobileNumber = mobileNumber;
		this.getUserName();
		this.getPassword();
	}
	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCprNumber() {
		return cprNumber;
	}

	public void setCprNumber(String cprNumber) {
		this.cprNumber = cprNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	
	public String getPassword() {
		return password = lastName.substring(0,3) + cprNumber.substring(7);
		
	}
	
	public void setPassword() {
		//GENERATE PASSWORD USING SUBSTRING
		this.password = lastName.substring(0,3) + cprNumber.substring(7);
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName = firstName.charAt(0) + lastName.substring(0,3);
		
	}
	
	public void setUserName() {
		//GENERATE USERNAME USING CHARAT AND SUBSTRING
		this.userName = firstName.charAt(0) + lastName.substring(0,3); 

	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	@Override
	public String toString(){
		return (firstName + ";" + lastName + ";" + cprNumber + ";"  
				+ address + ";" + houseNumber + ";" + postCode + ";"  + mobileNumber + ";" + getUserName() + ";" + getPassword() + ";");
	}
	
	public void writeCustomerToFile(){
		String details = firstName + ";" + lastName + ";" + cprNumber + ";"  
	+ address + ";" + houseNumber + ";" + postCode + ";"  + mobileNumber + ";" + getUserName() + ";" + getPassword() + ";";
		CustomerDataFile.WriteDetails("customerfile.txt", details);
		 
	}

	}
