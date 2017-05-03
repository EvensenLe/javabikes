package controller;


import model.Customer;
import view.BookingView;
import view.CustomerView;
import view.LogInView;
import view.Receipt;
import view.ShoppingCart;
import model.BikeDatabase;
import model.CreditCard;

import java.io.IOException;
import java.util.*;

//AUTHORS; EMILIE F. EVENSEN & JULIA LEE

public class Booking {

	private static Customer mrCustomer = new Customer();
	private static BookingView welcome = new BookingView();
	private static CustomerView cView = new CustomerView();
	private static LogInView logIn = new LogInView();
	private static ShoppingCart shopping = new ShoppingCart();
	private static Receipt receipt = new Receipt();
	private static BikeDatabase bd = new BikeDatabase();

	public static void main(String[] args) throws IOException {
					
		bd.testMethod(0);
		
		//MAIN MENU
		String menuChoice = welcome.welcomeDetails();
		int menuChoiceInt = Integer.parseInt(menuChoice);
		
		BikeDatabase bike = new BikeDatabase();

		boolean choosing = true;
		
		while (choosing)
		switch (menuChoiceInt) {
		case 1: 
		mrCustomer = cView.CustomerDetails();
		mrCustomer.writeCustomerToFile();
		mrCustomer.writeCustomerToReceipt();
		choosing = false;
		break;
		case 2: 
		logIn.customerHasToLogin();
		welcome.bookingDetails();
		shopping.ShoppingCart();
		receipt.printReceipt(); 
		choosing = false;
		break;
		case 3: System.out.print("You have successfully exited the system. Have a great day.");
		System.exit(0);
		break;
	    default: System.out.print("Error! Please write '1', '2' or '3'");
	  break;
		}
		
			}
}

