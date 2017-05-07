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

	public void bookBike() {

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ \n"
				+"                       BROWSE BIKES                         \n"
				+"        Type in the type of bike you wish to book           \n"
				+"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ \n"
				+"");

		//ASK WHAT THE USER WANTS TO DO USING A SWITCH STATEMENT
		
        Scanner input = new Scanner(System.in);
		
			System.out.println("You will now have two options:\n"
					+" \n"
		          +"[1] Normal bikes\n"
		          +"[2] Electric bikes\n");
		

		//CHECK IF THE CHOICE INPUT ONLY MATCHES 1 OR 2
			
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
		

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
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



	}