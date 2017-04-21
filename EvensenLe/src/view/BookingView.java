package view;

import java.util.*;

import model.BikeDatabase;

public class BookingView {

	
	public static void welcomeDetails(){
		
		{
			
			System.out.println("~~~~~~~~~~~~~~~~    CPH BikeSharing AS    ~~~~~~~~~~~~~~~~~");

			System.out.println("-------- __@      __@       __@       __@      __~@  ------");
			System.out.println("----- _``|<,_   ``|<,,_   ``|<,<,_  ``|<,<,_ ``|<,<,_ -----");
			System.out.println("---- (*)/ (*)  (*)/ (*)  (*)/ (*)  (*)/ (*)  (*)/ (*)  ----");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");	
			
			
			System.out.println("Welcome to CPH Bikesharing!");
				}
		
	Scanner input = new Scanner(System.in);
	boolean exit = false;
	
	
	while (!exit){
		
		//ASK WHAT THE USER WANTS TO DO USING A SWITCH STATEMENT
	System.out.println("You will now have three options. Please type in the option number:");
	System.out.println("1. I would like to browse the catalogue");
	System.out.println("2. I would like to create a profile");
	System.out.println("3. I don't want a Javabike, and would like to exit");
	String menuChoice = input.next();
	
	switch (menuChoice) {
	case "1": System.out.println("Thank you for wanting to browse the catalogue.");
	break;
	case "2": System.out.println("Thank you for wanting to register to CPH Bikesharing");
	CustomerView.CustomerDetails();
	exit = true;
	break;
	case "3": System.out.print("You have successfully exited the system. Have a great day.");
	System.exit(0);
	break;
    default: System.out.print("Error! Please write '1', '2' or '3'");
    break;
	} return;}}
	
	public static void bookingDetails(){
		
	//ASK IF THE USER WANTS TO BROWSE ELECTRIC OR NORMAL BIKE
	//USE SWITCH STATEMENT
		Scanner input = new Scanner(System.in);
		boolean exit = false;
		
	while (!exit){
	System.out.println("You will now have three options.");
	System.out.println("1. I would like to browse electric bikes");
	System.out.println("2. I would like to browse normal bikes");
	System.out.println("3. I don't want a Javabike, and would like to exit");
	String electricOrNormal = input.next();
	
	switch (electricOrNormal) {
	case "1": System.out.println("The items for electric bikes will now be displayed");
	BikeDatabase.printElectricBikeDatabase();
	break;
	case "2": System.out.println("The items for normal bikes will now be displayed");
	BikeDatabase.printNormalBikeDatabase();
	exit = true;
	break;
	case "3": System.out.print("You have successfully exited the system. Have a great day.");
	System.exit(0);
	break;
    default: System.out.print("Error! Please write '1', '2' or '3'");
    break;
	}
	
	System.out.println("Which bike would you like to rent? Please type in the bike ID");
	
	ShoppingCart.printShoppingCart();
	
	
	return;
	

	
	
}
}
}