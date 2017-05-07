package controller;
//AUTHORS; EMILIE F. EVENSEN & JULIA LEE

import model.BikeDatabase;
import model.Bikes;
import model.Customer;
import model.NormalBike;
import view.BookingView;
import view.CustomerView;
import view.LogInView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Booking {

	private static Customer mrCustomer = new Customer();
	private static BookingView booking = new BookingView();
	private static CustomerView cView = new CustomerView();
	private static LogInView logIn = new LogInView();

	

	public static void main(String[] args) throws IOException {
		
ArrayList<NormalBike> normalbike = new ArrayList<NormalBike>();
		
		Scanner input = new Scanner(System.in);
		
		
		
		//MAIN MENU
		logIn.welcomeDetails();
		boolean choice = true;
		while (choice) {
			String menuChoice = input.nextLine();
		switch (menuChoice) {
		case "1": 
		mrCustomer = cView.CustomerDetails();
		mrCustomer.writeCustomerToFile();
		mrCustomer.writeCustomerToReceipt();
		booking.printBooking();
		choice = false;
		break;
		case "2": 
		logIn.customerHasToLogin();
		booking.printBooking();
		choice = false;
		break;
		case "3": System.out.println("You have successfully exited the system. Have a great day.");
		System.exit(0);
		break;
	    default: System.out.print("Error! Please write '1', '2' or '3'");
	    break;
		}
		}
	
		  }

        }

