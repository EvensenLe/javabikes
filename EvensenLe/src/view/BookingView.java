package view;

import java.util.*;


import model.BikeDatabase;

public class BookingView {

	public BookingView() {
	}
	
	public String welcomeDetails() {
		
		
			//PRINT OUT LOGO
			System.out.println("~~~~~~~~~~~~~~~~    CPH BIKESHARING AS    ~~~~~~~~~~~~~~~~~");
			System.out.println("-------- __@      __@       __@       __@      __~@  ------");
			System.out.println("----- _``|<,_   ``|<,,_   ``|<,<,_  ``|<,<,_ ``|<,<,_ -----");
			System.out.println("---- (*)/ (*)  (*)/ (*)  (*)/ (*)  (*)/ (*)  (*)/ (*)  ----");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");	
			
			//PRINT OUT WELCOME MENU
			System.out.println("");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("               WELCOME TO CPH BIKESHARING!                 ");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("");
			
			//ASK WHAT THE USER WANTS TO DO USING A SWITCH STATEMENT
			System.out.println("You will now have three options:");
			System.out.println("");
			System.out.println("[1] Create a profile");
			System.out.println("[2] I want to book a bike with an existing account");
			System.out.println("[3] Exit system");
			System.out.println("");
				
		
	Scanner input = new Scanner(System.in);
	
	//CHECK USER INPUT 
	String menuChoice;
	boolean welcomeChoice = false;
		
	
	do {System.out.println("Please type in the option number:");
		
		menuChoice = input.nextLine();

		//CHECK IF THE CHOICE INPUT ONLY MATCHES 1, 2 OR 3
		if (!menuChoice.matches("^[123]$"))
			System.out.println("Invalid input. Please try again.\n");
		else
			welcomeChoice = true;

	} while (!welcomeChoice);

	return menuChoice;
	}



//CREATE MENU FOR BOOKING A BIKE IF LOGGED IN 
public void bookingDetails() {

	
	System.out.println("You will now be able to choose and book a bike ");
	System.out.println("");
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
	System.out.println("The available bikes will now be displayed: ");
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	System.out.println("");
	BikeDatabase.printAll();
		

return;}


//MAKE A NEW METHOD WITH SWITCH STATEMENT WHETHER THE CUSTOMER WANTS TO BOOK A BIKE

public void PrintbookingDetails() {

	Scanner input = new Scanner(System.in);

	System.out.println("Would you like to book a bike? ");
	System.out.println("");
	System.out.println("[1] Yes");
	System.out.println("[2] No");
	System.out.println("");
	int bookingAnswer = input.nextInt();
	
	boolean bookingBike = true;
	
	while (bookingBike)
	switch (bookingAnswer) {
	case 1: bookingDetails();
	
	break;
	case 2: System.out.println("We're sorry you don't want to book a bike.");
	System.out.println("Please come again another time. You are now logged out!");
		System.exit(0);

		

return;}

}}