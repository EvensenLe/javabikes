package view;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Stream;
import model.BikeDatabase;
import model.Bikes;
import model.Customer;


public class BookingView {

	public BookingView() {
	}

	private static BikeDatabase bd = new BikeDatabase();

	public String welcomeDetails() {




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
				+"");


		Scanner input = new Scanner(System.in);

		//CHECK USER INPUT 
		String menuChoice;
		boolean welcomeChoice = false;


		do {System.out.println("Please type in the option number:\n");

		menuChoice = input.nextLine();

		//CHECK IF THE CHOICE INPUT ONLY MATCHES 1, 2 OR 3
		if (!menuChoice.matches("^[123]$"))
			System.out.println("Invalid input. Please try again.\n");
		else
			welcomeChoice = true;

		} while (!welcomeChoice);

		return menuChoice;
	}

	public void bookBike() {

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ \n"
				+"                       BROWSE BIKES                         \n"
				+"        Type in the type of bike you wish to book           \n"
				+"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ \n"
				+"");

		//ASK WHAT THE USER WANTS TO DO USING A SWITCH STATEMENT
		
        Scanner input = new Scanner(System.in);

		//CHECK USER INPUT 
		String bikeChoice;
		boolean welcomeChoice = false;


		do {  System.out.println("You will now have two options:\n"
		          +" \n"
		          +"[1] Normal bikes\n"
		          +"[2] Electric bikes\n"
		          +"\n");
		bikeChoice = input.nextLine();

		//CHECK IF THE CHOICE INPUT ONLY MATCHES 1, 2 OR 3
		if (!bikeChoice.matches("^[12]$"))
			System.out.println("Invalid input. Please try again.\n");
		else
			welcomeChoice = true;

		} while (!welcomeChoice);

		int menuChoiceInt = Integer.parseInt(bikeChoice);
		boolean choosing = true;

		while (choosing)
			switch (menuChoiceInt) {
			case 1: 
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~NORMAL BIKES~~~~~~~~~~~~~~~~~~~~~~~~\n");
				BikeDatabase.printNormalBikeDatabase();
				BikeDatabase.normalBikeChosen();
				choosing = false;
				break;
			case 2: 
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~ELECTRIC BIKES~~~~~~~~~~~~~~~~~~~~~~\n");
				BikeDatabase.printElectricBikeDatabase();
				BikeDatabase.electricBikeChosen();
				choosing = false;
				break;
			default: System.out.print("Error! Please write '1' or '2'");
			break;
			}
		 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
                 +"                        BOOKING                            \n"
                 +"           Type in the bike ID to reserve bike             \n"
                 +"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
                 +"");

	}


	public void pickUpBike() {
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
		String location = input.nextLine();

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 

		switch (location) {
		case "K": System.out.println("--> Your bike will be ready for pick-up at Copenhagen Central Station in 20 minutes");
		break;
		case "V": System.out.println("--> Your bike will be ready for pick-up at Istedgade, Vesterbro in 20 minutes");
		break;
		case "N": System.out.println("--> Your bike will be ready for pick-up at Ravnsborggade, Nørrebro in 20 minutes");
		break;
		default: System.out.println("Please follow the instructions above. Type in 'K', 'V', or 'N'");
		break;
		} 

		return;
	}


	public void printReceipt() throws IOException {


		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
				          +"            THIS IS YOUR CBS BIKESHARING RECEIPT           \n"
		                  +"                                                           \n"
		                  +"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
                          +"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
	                      +"         __@      __@       __@       __@      __~@        \n"
                          +"      _``|<,_   ``|<,,_   ``|<,<,_  ``|<,<,_ ``|<,<,_      \n"
		                  +"     (*)/ (*)  (*)/ (*)  (*)/ (*)  (*)/ (*)  (*)/ (*)      \n"
		                  +"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		                

		try (Stream<String> stream = Files.lines(Paths.get("receiptfile.txt"))) {
			stream.forEach(System.out::println);
		
		System.out.println(""
				+""
				+ "BIKE RESERVED: "
				+ "");
		
        System.out.println(BikeDatabase.getNormalBikeReceipt());

        System.out.print(""
        		+ "Your bike is reserved for 24 hours which commenced on: ");
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        System.out.println( sdf.format(cal.getTime()) );
        System.out.println("");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
			              +"             Thank you for shopping with JavaBikes         \n"
		                  +"                       See you again!                      \n"
		                  +"                        JAVABIKES AS                       \n"
        		          +"                     Københavnsgade 10                     \n"           
        		          +"                      1175 København                       \n"
        		          +"                     CVR: 102 203 999                      \n"
        		          +"                       +45 26704509                        \n"                   
			              +"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		}

		return;
	}

	public void printBooking() throws IOException {
		bookBike();
		pickUpBike();
		CreditCardView.getCreditCardDetails(); 
		printReceipt();


	}


	void Invoice(Bikes currentBike, Customer currentCustomer){
		Customer mrCustomer = currentCustomer;

		currentBike.getId();
	}}