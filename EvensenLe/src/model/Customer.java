package model;

import data.DataFiles;

public class Customer {

	private String firstName, lastName, cprNumber, address, houseNumber, postCode, mobileNumber, userName, password;


	//EMPTY CONSTRUCTOR
	public Customer(){

	}

	//CONSTRUCTOR WITH SPECIFIC VALUES
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

	//GENERATE GETTERS AND SETTERS
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
	
	//WRITE CUSTOMER TO FILE
	public void writeCustomerToFile(){
		String details = firstName + ";" + lastName + ";" + cprNumber + ";"  
				+ address + ";" + houseNumber + ";" + postCode + ";"  + mobileNumber + ";" + getUserName() + ";" + getPassword() + ";";
		DataFiles.WriteDetails("customerfile.txt", details);

	}

	//STRING METHOD TO DISPLAY CUSTOMER DETAILS
	public String displayCustomer() {
		return ("Name: " + firstName + System.lineSeparator() + "Last Name: " + lastName + System.lineSeparator() + "CPR: " + cprNumber + System.lineSeparator() + "Address: "  
				+ address + System.lineSeparator() + "HouseNumber: " + houseNumber + System.lineSeparator() + "PostCode: " + postCode + System.lineSeparator() + "Mobile: "  + mobileNumber + System.lineSeparator() + "Username: " + getUserName() + System.lineSeparator() + "Password: " + getPassword());
	}

}
