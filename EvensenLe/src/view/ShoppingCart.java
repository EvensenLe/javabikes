package view;

import java.util.*;

import model.BikeDatabase;
import model.Bikes;
import model.ElectricBike;

public class ShoppingCart {
	
	public static void ShoppingCart(){
		
		
		BikeDatabase bike = new BikeDatabase();
		
		Scanner input = new Scanner(System.in);
		
		int itemsChosen;
		
		System.out.println("Which bike would you like to rent? Please type in the bike ID.");
		System.out.println("If you want to rent more than one bike, please seperate the ID with space.");
		boolean bikeChoice = false;
		while (!bikeChoice) { 
			
		//ASK THE USER TO CHOOSE WHICH BIKES HE/SHE WANTS
		
		itemsChosen = input.nextInt();
		
		if (itemsChosen == 0) {
			
			System.out.print("The bike you've chosen: ");
		
		{bikeChoice = !bikeChoice;}
		
		
		}
		
		else {
			System.out.println("Error! The ID name does not exist. Please type the bike ID of the bike you'd like to book");
		}
		
		
		
	
		//System.out.println("Thank you for shopping at CPH Bikesharing!");
		//System.out.println("In order to rent a bike, we need your credit card information.");
		
		//CreditCardView.getCreditCardDetails();
		}
	}
	
	}


