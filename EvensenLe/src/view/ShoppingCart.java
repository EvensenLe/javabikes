package view;

import java.util.*;

import model.BikeDatabase;
import model.Bikes;
import model.ElectricBike;
import model.NormalBike;

public class ShoppingCart {
	
	public void ShoppingCart(){
		
		
		BikeDatabase bike = new BikeDatabase();
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<NormalBike> printBikeList = new ArrayList<>();
		
		System.out.println("Which bike would you like to rent? Please type in the bike ID.");
		System.out.println("If you want to rent more than one bike, please seperate the ID with space.");
		
			
		boolean bikeChoice = false;
		while (!bikeChoice) { 
			
			NormalBike normalbike = new NormalBike(0, 0, 0, null, 0, null);
			
		//ASK THE USER TO CHOOSE WHICH BIKES HE/SHE WANTS
		
		int bikeChosen = input.nextInt();

		for (NormalBike Normalbike: printBikeList)
		{
		   if (normalbike.getId() == (bikeChosen))
			   System.out.println("The bike you've chosen:");
		       System.out.println(normalbike.displayNormalBike());
		}
		
		{bikeChoice = !bikeChoice;}
		
		
		//else {
		//	System.out.println("Error! The ID name does not exist. Please type the bike ID of the bike you'd like to book");
		//}
		
		
		
	
		System.out.println("Thank you for shopping at CPH Bikesharing!");
		System.out.println("In order to rent a bike, we need your credit card information.");
		
		CreditCardView.getCreditCardDetails();
		
		}
	}
	
	}


