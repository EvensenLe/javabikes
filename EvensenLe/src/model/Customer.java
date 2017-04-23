package model;

import data.CustomerDataFile;

public class Customer {

	private String firstName,lastName,cprNumber, address, houseNumber,  mobileNumber, userName, password;
	
	private int postCode;

	public Customer(){
			
		}
	
	public Customer (String firstName, String lastName, String address, String houseNumber, int postcode, String cprNumber, String mobileNumber) {
	
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

	public int getPostCode() {
		return postCode;
	}

	public void setPostCode(int postCode) {
		this.postCode = postCode;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	
	public String getPassword() {
		
		return password = lastName.substring(0, 3) + cprNumber.substring(7);
		
	}
	
	public void setPassword() {
		this.password = lastName.substring(0, 3) + cprNumber.substring(7);
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName = firstName.charAt(0) + lastName.substring(0, 3);
		
	}
	
	public void setUserName() {
		this.userName = firstName.charAt(0) + lastName.substring(0, 3); 

	}

	public void setUserName(String userName) {
		
		this.userName = userName;
	}
	
	public String toString(){
		return (firstName + ";" + lastName + "; " + cprNumber + ";"  
				+ address + ";" + houseNumber + ";" + postCode + ";"  + mobileNumber + ";" + getUserName() + ";" + getPassword() + ";");
	}
	
	public void writeCustomerToFile(){
		String details = firstName + ";" + lastName + "; " + cprNumber + ";"  
	+ address + ";" + houseNumber + ";" + postCode + ";"  + mobileNumber + ";" + getUserName() + ";" + getPassword() + ";";
		CustomerDataFile.WriteDetails("customerfile.txt", details);
		 
	}

	}
