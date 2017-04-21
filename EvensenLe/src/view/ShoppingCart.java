package view;

import java.util.*;

import model.Bikes;

public class ShoppingCart {
	
	public static void ShoppingCart(){
		
		ArrayList<Integer> list = new ArrayList<>();
		
		Scanner input = new Scanner(System.in);
		
		//ASK THE USER TO CHOOSE WHICH BIKES HE/SHE WANTS
		System.out.println("Which bike would you like to rent? Please type in the bike ID.");
		System.out.println("If you want to rent more than one bike, please seperate the ID with space.");
		String itemsChosen = input.next();
		
		
		
		//HOW DO WE DISPLAY THE ITEMS THE CUSTOMER CHOSE?
		//USING ARRAYLIST??
		
		
		System.out.println("Thank you for shopping at CPH Bikesharing!");
		System.out.println("In order to rent a bike, we need your information.");
		
		CustomerView.CustomerDetails();	

		CreditCardView.getCreditCardDetails();
	}
	
	public static void printShoppingCart(){
		ShoppingCart();

}}
