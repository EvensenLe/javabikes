package view;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

import model.BikeDatabase;
import model.ElectricBike;
import model.NormalBike;

public class BookingView {

	public BookingView() {
	}
	
	private static BikeDatabase bd = new BikeDatabase();
	
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
public void browseBike() {


	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
	System.out.println("                         BROWSING                          ");
	System.out.println("      You will now be able to browse available bikes       ");
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	
	System.out.println();
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~NORMAL BIKES~~~~~~~~~~~~~~~~~~~~~~");
	BikeDatabase.printNormalBikeDatabase();
	System.out.println();
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~ELECTRIC BIKES~~~~~~~~~~~~~~~~~~~~~");
	BikeDatabase.printElectricBikeDatabase();
	System.out.println();
	
	
	
	}
	 



public void bookBike() {


	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
	System.out.println("                        BOOKING                            "); 
	System.out.println("           Type in the bike ID to reserve bike             ");
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
	System.out.print("Type in ID here: "); 
	
	
		NormalBike a = bd.getNormalBikeList().get(0);
		NormalBike b = bd.getNormalBikeList().get(1);
		NormalBike c = bd.getNormalBikeList().get(2);
		NormalBike d = bd.getNormalBikeList().get(3);
		ElectricBike e = bd.getElectricBikeList().get(0);
		ElectricBike f = bd.getElectricBikeList().get(1);
		ElectricBike g = bd.getElectricBikeList().get(2);
		ElectricBike h = bd.getElectricBikeList().get(3);
		
		Scanner input = new Scanner(System.in);
		
		
		//GETS THE INDEX OF ELECTRIC BIKE
		int bike = input.nextInt();
		
		boolean bikeChoice = false;
		while (!bikeChoice) 
		{	
			
			
			if (bike == 0)
				System.out.println("The price for bike ID " + a.getId() + " is " + a.getPrice() + "DKK");
			
			else if (bike == 1)
				System.out.println("The price for bike ID " + b.getId() + " is " + b.getPrice() + "DKK");
			
			else if (bike == 2)
				System.out.println("The price for bike ID " + c.getId() + " is " + c.getPrice() + "DKK");
			
			else if (bike == 3)
				System.out.println("The price for bike ID " + d.getId() + " is " + d.getPrice() + "DKK");
			
			else if (bike == 4)
				System.out.println("The price for bike ID " + e.getId() + " is " + e.getPrice() + "DKK");
			
			else if (bike == 5)
				System.out.println("The price for bike ID " + f.getId() + " is " + f.getPrice() + "DKK");
			
			else if (bike == 6)
				System.out.println("The price for bike ID " + g.getId() + " is " + g.getPrice() + "DKK");
			
			else if (bike == 7)
				System.out.println("The price for bike ID " + h.getId() + " is " + h.getPrice() + "DKK");
			
			else {
			System.out.println("Error: Wrong input!");
			System.out.print("Enter bike number 0-7:          ");
			}
			{bikeChoice = true;}
			break;
			
		
		}

	}			


public void pickUpBike() {
	Scanner input = new Scanner(System.in);		

	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
	System.out.println("                     BIKE PICK UP                          "); 
	System.out.println("   At what location would you like to pick up the bike?    ");
	System.out.println("");
	System.out.println("Please type in:");
	System.out.println("'K' for Copenhagen Central Station");
	System.out.println("'V' for Copenhagen Vestebro");
	System.out.println("'N' for Copenhagen Nørrebro");
	
	System.out.print("Type in location here: "); 
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
	
	
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	System.out.println("            THIS IS YOUR CBS BIKESHARING RECEIPT           ");
	System.out.println("                                                           ");
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	System.out.println(" --------------------------------------------------------- ");
	System.out.println("                         RECEIPT                           ");
	System.out.println(" --------------------------------------------------------- ");

	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	System.out.println("         __@      __@       __@       __@      __~@        ");
	System.out.println("      _``|<,_   ``|<,,_   ``|<,<,_  ``|<,<,_ ``|<,<,_      ");
	System.out.println("     (*)/ (*)  (*)/ (*)  (*)/ (*)  (*)/ (*)  (*)/ (*)      ");
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("                       YOUR INFORMATION:                   ");

	        
    
    try (Stream<String> stream = Files.lines(Paths.get("receiptfile.txt"))) {
		        stream.forEach(System.out::println);
			
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	System.out.println("             Thank you for shopping with JavaBikes         ");
	System.out.println("                       See you again!                      ");
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }

	return;
}

public void printBooking() throws IOException {
	browseBike();
	bookBike();
	pickUpBike();
	CreditCardView.getCreditCardDetails(); 
	printReceipt();
	
	
	
}
}