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
			
			System.out.println("");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("               WELCOME TO CPH BIKESHARING!                 ");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("");
			
			//ASK WHAT THE USER WANTS TO DO USING A SWITCH STATEMENT
			System.out.println("You will now have three options:");
			System.out.println("");
			System.out.println("[1] Log in to existing profile");
			System.out.println("[2] Create a profile");
			System.out.println("[3] Exit system");
			System.out.println("");
				
		
	Scanner input = new Scanner(System.in);
	
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

	return menuChoice;}



public void bookingDetails() {

	
	System.out.println("You will now be able to choose and book a bike ");
	System.out.println("");
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
	System.out.println("The available bikes will now be displayed: ");
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	System.out.println("");
	BikeDatabase.printAll();
		

return;}

	

}