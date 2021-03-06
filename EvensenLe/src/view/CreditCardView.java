package view;

import java.util.*;

import model.CreditCard;

public class CreditCardView {


	public static CreditCard getCreditCardDetails(){
		Scanner input = new Scanner(System.in);

		//GET CREDIT CARD DETAILS
		String creditCardDetails;
		CreditCard MrCredit = new CreditCard();

		//CHECK IF CUSTOMER USES MASTERCARD OR VISA
		//USE SWITCH STATEMENT
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("                         CHECK OUT                         ");
		System.out.println("         Which type of card would you like to pay with?    ");
		System.out.println("            Please type in 'mastercard' or 'visa'          ");                                  
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		String visaOrMastercard = input.nextLine();

		switch (visaOrMastercard) {
		case "visa": System.out.print("You will now be asked to enter your card information");
		System.out.println();
		break;
		case "mastercard": System.out.print("You will now be asked to enter your card information");
		System.out.println();
		break;
		default: System.out.print("Error! Please write 'mastercard' or 'visa'");
		break;
		}

		//ASK FOR CREDIT CARD NAME
		System.out.print("Enter your full name on credit card: ");
		String creditCardname = input.nextLine();
		MrCredit.setCardName(creditCardname);

		//ASK FOR CREDIT CARD NUMBER
		//BOOLEAN USED WITH WHILE LOOP
		//IF ELSE STATEMENT 
		System.out.println("Enter your card number (16 digits):");
		boolean creditCardNumber = false;
		while (!creditCardNumber) 

		{
			creditCardDetails = input.nextLine();

			MrCredit.setCardNumber(creditCardDetails);
			if (creditCardDetails.matches("[0-9]+") && creditCardDetails.length()==16) 
			{
				creditCardNumber = true; 
			}
			else 
			{
				System.out.println("ERROR: Invalid number");
				System.out.println("Enter your card number (16 digits):");
			}			

		}


		//ASK FOR CREDIT CARD EXPIRATION DATE IN FORMAT MM/YY
		//BOOLEAN USED WITH WHILE LOOP
		//IF ELSE STATEMENT 
		System.out.println("Enter credit card month and year in format mm/yy:");

		boolean monthAndYear = false;
		while (!monthAndYear) 

		{
			creditCardDetails = input.nextLine();

			MrCredit.setCardMonthYear(creditCardDetails);
			if (creditCardDetails.matches("^(\\d{2}/?\\d{2})$")) //REGEX CHECKS 2 DIGITS SLASH 2 DIGTS
			{
				monthAndYear = true; 
			}
			else 
			{
				System.out.println("ERROR: You have entered the wrong format");
				System.out.println("Enter credit card month and year in format mm/yy:");
			}			

		}


		//ASK FOR CREDIT CARD SECURITY NUMBER CVC
		//BOOLEAN USED WITH WHILE LOOP
		//IF ELSE STATEMENT 
		System.out.println("Enter your credit card security number CVC (3 digits):");

		boolean securityNumber = false;
		while (!securityNumber) 

		{
			creditCardDetails = input.nextLine();

			MrCredit.setCardSecurityNumber(creditCardDetails);
			if (creditCardDetails.matches("^(\\d{3})$")) //REGEX TO CHECK 3 DIGITS

			{
				securityNumber = true; 
				System.out.println(" ++ Your payment was successfully authorized ++ ");
			}
			else 
			{
				System.out.println("ERROR: You have entered the wrong format");
			}			

		}
		//DISPLAY CREDIT CARD INFORMATION
		confirmation = MrCredit.displayCreditCard();

		//RETURN CREDIT CARD DETAILS
		return MrCredit;

	}
	//GETTERS AND SETTERS TO GET CREDIT CARD INFORMATION
	public static String confirmation;

	public static String getConfirmation() {
		return confirmation;
	}

	public void setConfirmation(String confirmation) {
		CreditCardView.confirmation = confirmation;
	}


}