package model;

import data.DataFiles;

public class Manager {
	
	private String ManagerUsername;
	private String ManagerPassword;
	
	public Manager() {
	}
	
	public Manager(String userName, String password) {
		this.ManagerUsername = userName;
		this.ManagerPassword = password;
	}
	
	
	public String getManagerUsername() {
		return ManagerUsername;
	}
	public void setManagerUsername(String managerUsername) {
		ManagerUsername = managerUsername;
	}
	public String getManagerPassword() {
		return ManagerPassword;
	}
	public void setManagerPassword(String managerPassword) {
		ManagerPassword = managerPassword;
	}
	
	public String toString() {
		return ("\nUSERNAME: " + this.getManagerUsername() + "\nPASSWORD: " + this.getManagerPassword());
	}
	
	/** method to write to file */
	public void writeToFile(){
		String details = this.ManagerUsername + ";" + this.ManagerPassword + ";";
		DataFiles.WriteDetails("manager.txt", details);
	}

}
