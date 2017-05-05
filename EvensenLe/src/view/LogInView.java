package view;

import java.util.ArrayList;
import java.util.Scanner;

import data.DataFiles;
import model.Customer;
import model.Manager;


public class LogInView {
	
	
	private ArrayList<Customer> customerList;
	private ArrayList<Manager> managerList;
	
	
	public LogInView(){
		customerList = DataFiles.getAllCustomerDetails();
		managerList = DataFiles.getAllManagerDetails();
	}
	
	
	
	public boolean customerHasToLogin(){

		//Used for holding input from the user
				//String password = "";
				//String userName = "";
				
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
				String userName2 = input.nextLine();
				
				System.out.println("Type in your password: "); 
				String password2 = input.nextLine();
				
				//Check the username and password for being correct. 
				
				//Here we go through the array with the usernames. 
				for(int i = 0; i < customerList.size() && !loggedIn; i++){
					//
					if(userName2.equalsIgnoreCase(customerList.get(i).getUserName()) && 
							password2.equalsIgnoreCase(customerList.get(i).getPassword())){
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
			
			if (counterTries == numbersOfTries) { // execute only if while loop was broken because maximum tries exceeded --> count++ nach dem loop noch assigned?
				System.out.println("\nYou have exceeded the number of tries. Please try again after a few hours!");
				System.exit(0);			}

			
			return loggedIn;	
			
}
	
	
	public boolean managerHasToLogin(){

				
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
				System.out.println("         PLEASE LOG IN IN ORDER TO EDIT A CUSTOMER         ");
				System.out.println("                 You have three attempts.                  ");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

			
			do{
				counterTries++;
				
				//Prompt the user for username and password
				
				System.out.println("Type in your username: "); 
				String managerUsername = input.nextLine();
				
				System.out.println("Type in your password: "); 
				String managerPassword = input.nextLine();
				
				//Check the username and password for being correct. 
				
				//Here we go through the array with the usernames. 
				for(int i = 0; i < managerList.size() && !loggedIn; i++){
					//
					if(managerUsername.equalsIgnoreCase(managerList.get(i).getManagerUsername()) && 
							managerPassword.equalsIgnoreCase(managerList.get(i).getManagerPassword())){
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
			
			if (counterTries == numbersOfTries) { // execute only if while loop was broken because maximum tries exceeded --> count++ nach dem loop noch assigned?
				System.out.println("\nYou have exceeded the number of tries. Please try again after a few hours!");
				System.exit(0);			}

			
			return loggedIn;	
			
}

	
}
