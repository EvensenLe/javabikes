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


	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
	System.out.println("      You will now be able to browse available bikes       ");
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	System.out.println("");	


	return;
	}

public void bookBike() {


	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
	System.out.println("                        BOOKING                            "); 
	System.out.println("           Type in the bike ID to reserve bike             ");
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
	System.out.print("Type in ID here: "); 


	return;
	}


public void pickUpBike() {
	Scanner input = new Scanner(System.in);		

	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
	System.out.println("                     BIKE PICK UP                          "); 
	System.out.println("   At what location would you like to pick up the bike?    ");
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
	System.out.println("Please type in:");
	System.out.println("'K' for Copengagen Central Station");
	System.out.println("'V' for Copenhagen Vestebro");
	System.out.println("'N' for Copenhagen Norrebro");
	
	System.out.print("Type in location here: "); 
	String location = input.nextLine();
	
		switch (location) {
		case "K": System.out.println("--> Your bike will be ready for pick-up at Copenhagen Central Station in 20 minutes");
		break;
		case "V": System.out.println("--> Your bike will be ready for pick-up at Vesterbo in 20 minutes");
		break;
		case "N": System.out.println("--> Your bike will be ready for pick-up at Norrebro in 20 minutes");
		break;
		default: System.out.println("Please follow the instructions above. Type in 'K', 'V', or 'N'");
		break;
		} 
	
	return;
	}
}