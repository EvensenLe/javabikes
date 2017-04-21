package view;

import java.util.*;

import data.CustomerDataFile;
import model.Customer;

public class LogInView {
	
	
	private ArrayList<Customer>customerDetails;
	
	
	public LogInView(){
		customerDetails = CustomerDataFile.getAllCustomerDetails();
	}
	
	
	
	public boolean customerHasToLogin(){
				
	 
		Scanner input = new Scanner(System.in);
	
			
			System.out.println("To place the order, you need to login to your account using the username and password created for you.");
			
			
			//MAKE A LOOP FOR 3 TIMES TRY
		int tries = 0;
			
		for (tries = 1; tries <=3; tries++) {
					
			//THE USE TYPES IN THEIR USERNAME AND PASSWORD
		System.out.println("Please type in your Username: ");
		String loginusername = input.next();
						
		System.out.println("Please type in your Password: ");
		String loginpassword = input.next();
					
		
		//HOW DO WE USE THE USERNAME AND PASSWORD FROM THE TXT FILE??
		if (Customer.getUserName().equals(loginusername) && Customer.getPassword().equals(loginpassword)) {
			System.out.println("You are now logged in!");
		}
		else if (tries >=3) {
			System.out.println("You have exceeded the number of tries! Please try again in an hour.");
		}
				
		else {
			System.out.println("Your password and/or username is wrong. Please try again." );
		}
	}
		
		
	
return customerHasToLogin();
}
	
	
}
