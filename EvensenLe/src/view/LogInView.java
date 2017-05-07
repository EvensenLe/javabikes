package view;

import java.util.ArrayList;
import java.util.Scanner;

import data.DataFiles;
import model.Customer;

public class LogInView {


	private static ArrayList<Customer> customerList;


	public LogInView(){
		customerList = DataFiles.getAllCustomerDetails();

	}

	//WELCOME DETAILS
	public void welcomeDetails() {


		System.out.println("~~~~~~~~~~~~~~~~    CPH BIKESHARING AS    ~~~~~~~~~~~~~~~~~\n"
				+ "-------- __@      __@       __@       __@      __~@  ------\n"
				+ "----- _``|<,_   ``|<,,_   ``|<,<,_  ``|<,<,_ ``|<,<,_ -----\n"
				+ "---- (*)/ (*)  (*)/ (*)  (*)/ (*)  (*)/ (*)  (*)/ (*)  ----\n"
				+ "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
				+ ""
				+ "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
				+ "               WELCOME TO CPH BIKESHARING!                 \n"
				+ "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
				+ "You will now have three options:\n"
				+ ""
				+ "[1] Create a profile\n"
				+ "[2] I want to book a bike with an existing account\n"
				+ "[3] Exit system\n"
				+"");}


	//CUSTOMER LOGIN
	public static boolean customerHasToLogin(){


		//DECLARE A SCANNER OBJECT REFERENCE AND CREATE AN OBJECT OF IT
		Scanner input = new Scanner(System.in);

		//VARIABLES = CREATED TO DETERMINE THE NUMBER OF TRIES A CUSTOMER HAS TO LOG IN 
		//A COUNTER = COUNT THE NUMBER OF TRIES AND A SENTINEL VARIABLE
		//USED TO BREAK THE LOOP IF THE USER SUCCESSFULLY LOGS IN

		int numbersOfTries = 3;   //DETERMINES NUMBERS OF LOG-IN TRIES
		int counterTries = 0;     //COUNTER
		boolean loggedIn = false; //SENTINEL VALUE = BREAKS THE LOOP

		//DO WHILE LOOP 
		//EXECUTES WITHIN CURLY BRACES

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("          PLEASE LOG IN IN ORDER TO MAKE AN ORDER          ");
		System.out.println("                 You have three attempts.                  ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


		do{
			counterTries++;

			//ASK FOR USERNAMER AND PASSWORD		
			System.out.println("Type in your username: "); 
			String userName2 = input.nextLine();

			System.out.println("Type in your password: "); 
			String password2 = input.nextLine();


			//CHECK THE USERNAME AND PASSWORD			
			//GO THROUGH THE ARRAY WITH USERNAMES AND PASSWORDS
			for(int i = 0; i < customerList.size() && !loggedIn; i++){
				//
				if(userName2.equalsIgnoreCase(customerList.get(i).getUserName()) && 
						password2.equalsIgnoreCase(customerList.get(i).getPassword())){
					System.out.println("You are now logged in!\n");
					System.out.println("Your customer info:\n" + customerList.get(i).displayCustomer());
					loggedIn = true;
				}
			}
			if(!loggedIn){
				System.out.println("Your password and/or username is wrong. Please try again.");
			}
		//THE LOOP CONTINUES AS LONG AS THE COUNTER FOR TRIES IS LESS THAN THE ALLOWED NUMBER (3 IN THIS CASE) 
		//AND WHILE THE USER IS NOT (!) LOGGED IN
		}while(counterTries < numbersOfTries && !loggedIn);

		if (counterTries == numbersOfTries) { 
			System.out.println("\nYou have exceeded the number of tries. Please try again after a few hours!");
			System.exit(0);			}


		return loggedIn;	

	}
}
