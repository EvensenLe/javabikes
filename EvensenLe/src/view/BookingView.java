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
			System.out.println("[1] I would like to browse the catalogue");
			System.out.println("[2] I would like to create a profile");
			System.out.println("[3] I don't want a Javabike, and would like to exit");
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

}

	//public static void bookingDetails(){
		
	//ASK IF THE USER WANTS TO BROWSE ELECTRIC OR NORMAL BIKE
	//USE SWITCH STATEMENT
	//	Scanner input = new Scanner(System.in);
	//	boolean exit = false;
		
	//while (!exit){
	//System.out.println("You will now have three options.");
	//System.out.println("1. I would like to browse electric bikes");
	//System.out.println("2. I would like to browse normal bikes");
	//System.out.println("3. I don't want a Javabike, and would like to exit");
	//String electricOrNormal = input.next();
	
	//switch (electricOrNormal) {
	//case "1": System.out.println("The items for electric bikes will now be displayed");
	//BikeDatabase.printElectricBikeDatabase();
	//break;
	//case "2": System.out.println("The items for normal bikes will now be displayed");
	//BikeDatabase.printNormalBikeDatabase();
	//exit = true;
	//break;
	//case "3": System.out.print("You have successfully exited the system. Have a great day.");
	//System.exit(0);
	//break;
    //default: System.out.print("Error! Please write '1', '2' or '3'");
    //break;
	//}
	
	//System.out.println("Which bike would you like to rent? Please type in the bike ID");
	
	//ShoppingCart.printShoppingCart();
	

	
	
//}}
	//}
