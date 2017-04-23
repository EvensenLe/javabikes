package controller;


import model.Customer;
import view.BookingView;
import view.CustomerView;
import model.BikeDatabase;


import java.util.*;

//AUTHORS; EMILIE F. EVENSEN & JULIA LEE
//THIS SHOULD BE THE CONTROLLER CLASS	
//THIS IS THE MAIN CLASS
//CONTROLLER IS SUPPOSED TO BE VERY SHORT
//CALLS METHODS FROM MODEL AND VIEW CLASSES

public class Booking {
	
	private static Customer mrCustomer = new Customer();
	private static BookingView welcome = new BookingView();
	private static CustomerView cView = new CustomerView();

	public static void main(String[] args) {
					
		
		//MAKE A SWITCH STATEMENT TO ASK CUSTOMER WHAT THEY WANT TO DO
		String menuChoice = welcome.welcomeDetails();
		int menuChoiceInt = Integer.parseInt(menuChoice);
		
		BikeDatabase bike = new BikeDatabase();

		
		boolean choosing = true;
		
		while (choosing)
		switch (menuChoiceInt) {
		case 1: System.out.println("Thank you for wanting to browse the catalogue.");
		BikeDatabase.printAll();
		choosing = false;
		break;
		case 2: System.out.println("Thank you for wanting to register to CPH Bikesharing");
		mrCustomer = cView.CustomerDetails();
		mrCustomer.writeCustomerToFile();
		choosing = false;
		break;
		case 3: System.out.print("You have successfully exited the system. Have a great day.");
		System.exit(0);
		break;
	    default: System.out.print("Error! Please write '1', '2' or '3'");
	    break;
		}
		
		//BookingView.bookingDetails();
		

			}
	
}
