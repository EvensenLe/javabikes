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
				
	 
		//Used for holding input from the user
				String password = "";
				String userName = "";
				
				//Declare a scanner object reference and create an object of it.
		Scanner input = new Scanner(System.in);
	
		//Here we create variables to determine the number of log'in attempts, 
				//a counter to count the number of tries and a sentinel variable, 
				//which is used to break the loop if the user gets logged in. 
				
				int numbersOfTries = 3;  //The number of tries to log-in.
				int counterTries = 0;  //The counter for the loop
				boolean loggedIn = false;  //Sentinel value - breaks the loop
				
				//The do-while loop starts, everything in the curly-braces are executed in the loop. 
				
			System.out.println("To place the order, you need to login using the username and password created for you.");
			System.out.println("You have 3 times try.");
			
			do{
				counterTries++;
				
				//Prompt the user for username and password
				
				System.out.println("Type in your username: "); 
				userName = input.nextLine();
				
				System.out.println("Type in your password: "); 
				password = input.nextLine();
				
				//Check the username and password for being correct. 
				
				boolean userFound = false;
				//Here we go through the array with the usernames. 
				for(int i = 0; i < customerDetails.size() && !loggedIn; i++){
					//
					if(userName.equalsIgnoreCase(customerDetails.get(i).getUserName()) && 
							password.equalsIgnoreCase(customerDetails.get(i).getPassword())){
						System.out.println("You are now logged in!");
						loggedIn = true;
					}
				}
				if(!loggedIn){
					System.out.println("Your password and/or username is wrong. Please try again.");
				}
				//We stay in the loop as long the counter for tries is less than the allowed number of tries
				//and the user is not (!) logged-in.
			}while(counterTries < numbersOfTries && !loggedIn);
				System.out.println("You have exceeded the number of tries! Please try again in an hour.");
			
			return loggedIn;
			
			//MAKE A LOOP FOR 3 TIMES TRY
		//int tries = 0;
			
		//for (tries = 1; tries <=3; tries++) {
					
			//THE USE TYPES IN THEIR USERNAME AND PASSWORD
		//System.out.println("Please type in your Username: ");
		//String loginusername = input.next();
						
		//System.out.println("Please type in your Password: ");
		//String loginpassword = input.next();
					
		
		//HOW DO WE USE THE USERNAME AND PASSWORD FROM THE TXT FILE??
		//if (MrCustomer.getUserName().equals(loginusername) && Customer.getPassword().equals(loginpassword)) {
		//	System.out.println("You are now logged in!");
		//}
		//else if (tries >=3) {
		//	System.out.println("You have exceeded the number of tries! Please try again in an hour.");
		//}
				
		//else {
		//	System.out.println("Your password and/or username is wrong. Please try again." );
		//}
	//}
		
		
	
//return customerHasToLogin();
}
	
	
}
