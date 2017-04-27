package controller;


import model.Customer;
import view.BookingView;
import view.CustomerView;
import view.LogInView;
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
	private static LogInView logIn = new LogInView();

	public static void main(String[] args) {
					
		
		//MAKE A SWITCH STATEMENT TO ASK CUSTOMER WHAT THEY WANT TO DO
		String menuChoice = welcome.welcomeDetails();
		int menuChoiceInt = Integer.parseInt(menuChoice);
		
		BikeDatabase bike = new BikeDatabase();

		boolean choosing = true;
		
	
		
		while (choosing)
		switch (menuChoiceInt) {
		case 1: 
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("Please insert your Username and Password to log in.");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("");
		logIn.customerHasToLogin();
		choosing = false;
		break;
		case 2: System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("Please proceed to the registration page.");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("");
		mrCustomer = cView.CustomerDetails();
		mrCustomer.writeCustomerToFile();
		logIn.customerHasToLogin();
		choosing = false;
		break;
		case 3: System.out.print("You have successfully exited the system. Have a great day.");
		System.exit(0);
		break;
	    default: System.out.print("Error! Please write '1', '2' or '3'");
	  break;
		}
		
		//BookingView.bookingDetails(); hmm
		
		return;
		
			}
	
}
