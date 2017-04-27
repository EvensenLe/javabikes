package view;

import java.util.ArrayList;
import java.util.Scanner;

import model.Customer;
import data.CustomerDataFile;



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
				
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("          PLEASE LOG IN IN ORDER TO MAKE AN ORDER          ");
				System.out.println("                 You have three attempts.                  ");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

			
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
				
			
			return loggedIn;
			

}
	
	
}
