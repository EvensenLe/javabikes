package controller;


import model.Customer;
import view.BookingView;
import model.BikeDatabase;


import java.util.*;

//AUTHORS; EMILIE F. EVENSEN & JULIA LEE
//THIS SHOULD BE THE CONTROLLER CLASS	
//THIS IS THE MAIN CLASS
//CONTROLLER IS SUPPOSED TO BE VERY SHORT
//CALLS METHODS FROM MODEL AND VIEW CLASSES

public class Booking {

	public static void main(String[] args) {
			
		
	
		//WHY DO WE NEED THIS LINE IN ORDER TO PRINT OUT THE DATABASE?
		BikeDatabase bike = new BikeDatabase();
		
		BookingView.welcomeDetails();
		
		BookingView.bookingDetails();
		


			}
	
}
