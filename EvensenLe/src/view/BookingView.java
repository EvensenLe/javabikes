package view;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import model.BikeDatabase;
import model.CreditCard;


public class BookingView {

	public BookingView() {
	}

	private static BikeDatabase bd = new BikeDatabase();
	private static CreditCard cd = new CreditCard();

	private void bookBike() {

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ \n"
				+"                       BROWSE BIKES                         \n"
				+"        Type in the type of bike you wish to book           \n"
				+"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ \n"
				+"");

		//SWITCH STATEMENT
		//ASK FOR WHAT THE USER WOULD LIKE TO DO
		Scanner input = new Scanner(System.in);

		System.out.println("You will now have two options:\n"
				+" \n"
				+"[1] Normal bikes\n"
				+"[2] Electric bikes\n");


		//CHECK IF THE CHOICE INPUT ONLY MATCHES 1 OR 2
		//PRINT OUT BIKES DEPENDING ON CHOICE
		boolean choice = true;
		while (choice) {
			String bikeChoice = input.nextLine();
			switch (bikeChoice) {
			case "1": 
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~NORMAL BIKES~~~~~~~~~~~~~~~~~~~~~~~~\n"
						+"           Type in the bike ID to reserve bike             \n"+"");
				BikeDatabase.printNormalBikeDatabase();
				BikeDatabase.normalBikeChosen();
				choice = false;
				break;
			case "2": 
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~ELECTRIC BIKES~~~~~~~~~~~~~~~~~~~~~~\n"
						+"           Type in the bike ID to reserve bike             \n"+"");
				BikeDatabase.printElectricBikeDatabase();
				System.out.println();
				BikeDatabase.electricBikeChosen();
				choice = false;
				break;
			default: System.out.print("Error! Please write '1' or '2'");
			break;
			}}

	}

	//ASK USER WHERE THEY WOULD LIKE TO PICK UP THE BIKE
	private void pickUpBike() {
		Scanner input = new Scanner(System.in);		

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
				+"                     BIKE PICK UP                          \n"
				+"   At what location would you like to pick up the bike?    \n"
				+"\n"
				+"Please type in:\n"
				+"'K' for Copenhagen Central Station\n"
				+"'V' for Copenhagen Vestebro\n"
				+"'N' for Copenhagen Nørrebro\n"
				+"\n"
				+"Type in location here:\n"); 
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
		
		//USE SWITCH STATEMENT
		boolean choice = true;
		while (choice) {
			String location = input.nextLine();
			switch (location) {
			case "K": System.out.println("--> Your bike will be ready for pick-up at Copenhagen Central Station in 20 minutes");
			choice = false;
			break;
			case "V": System.out.println("--> Your bike will be ready for pick-up at Istedgade, Vesterbro in 20 minutes");
			choice = false;
			break;
			case "N": System.out.println("--> Your bike will be ready for pick-up at Ravnsborggade, Nørrebro in 20 minutes");
			choice = false;
			break;
			default: System.out.println("Please follow the instructions above. Type in 'K', 'V', or 'N'");
			break;
			} 
		}
	}

	//CREATE RECEIPT
	private void printReceipt()  {


		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
				+"            THIS IS YOUR CBS BIKESHARING RECEIPT           \n"
				+"                                                           \n"
				+"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
				+"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
				+"         __@      __@       __@       __@      __~@        \n"
				+"      _``|<,_   ``|<,,_   ``|<,<,_  ``|<,<,_ ``|<,<,_      \n"
				+"     (*)/ (*)  (*)/ (*)  (*)/ (*)  (*)/ (*)  (*)/ (*)      \n"
				+"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");


		//PRINT OUT NAME AND PAYMENT DETAILS
		System.out.println(""
				+""
				+ "CUSTOMER CONFIRMATION: \n"
				+ "");
		System.out.println(CreditCardView.getConfirmation());

		//PRINT OUT WHICH BIKE THE CLIENT HAS RESERVED
		System.out.println(""
				+""
				+ "BIKE RESERVED: "
				+ "");
		System.out.println(BikeDatabase.getBikeReceipt());

		//VIEW HOW LONG THE BIKE IS RESERVED FOR
		System.out.print(""
				+ "\nYour bike is reserved for 24 hours which commenced on: ");
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date));
		System.out.println("");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
				+"             Thank you for shopping with JavaBikes         \n"
				+"                       See you again!                      \n"
				+"                        JAVABIKES AS                       \n"
				+"                     Københavnsgade 10                     \n"           
				+"                      1175 København                       \n"
				+"                     CVR: 102 203 999                      \n"
				+"                       +45 25635383                        \n"                   
				+"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}

	//PUBLIC METHOD TO PRINT ALL IN BOOKINGVIEW CLASS OUT
	public void printBooking() {
		bookBike();
		pickUpBike();
		CreditCardView.getCreditCardDetails(); 
		printReceipt();
	}



}