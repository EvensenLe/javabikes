package view;

import java.util.ArrayList;
import java.util.Scanner;
import data.DataFiles;
import model.Customer;

public class LogInView {

	//CREATE CUSTOMERLIST ARRAY
	private static ArrayList<Customer> customerList;

	//GET ALL CUSTOMER DETAILS FROM DATAFILES AND ADD TO ARRAY
	public LogInView(){
		customerList = DataFiles.getAllCustomerDetails();

	}

	//WELCOME DETAILS LOGO
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

		//USER CAN ONLY LOG IN 3 TIMES
		//COUNTERTRIES STARTS AT 0
		int numbersOfTries = 3;   
		int counterTries = 0;     
		boolean loggedIn = false; 


		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("          PLEASE LOG IN IN ORDER TO MAKE AN ORDER          ");
		System.out.println("                 You have three attempts.                  ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		//DO WHILE LOOP 

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
					//DISPLAY USERS INFO
				}
			}
			if(!loggedIn){
				System.out.println("Your password and/or username is wrong. Please try again.");
			}
			//LOOP CONTINUES AS LONG AS IT'S LESS THAN THE ALLOWED NUMBER 3 
		}while(counterTries < numbersOfTries && !loggedIn);

		//TELL USER THEY CAN'T LOG OGIN BECAUSE OF EXCEEDED NUMBER OF TRIES
		if (counterTries == numbersOfTries) { 
			System.out.println("\nYou have exceeded the number of tries. Please try again after a few hours!");
			System.exit(0);			}


		return loggedIn;	

	}
}
