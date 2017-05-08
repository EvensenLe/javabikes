package view;

import java.util.*;
import model.Customer;

public class CustomerView {

	public CustomerView(){

	}


	public static Customer CustomerDetails(){

		Scanner input = new Scanner(System.in);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Please proceed to the registration page.");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("");

		//CREATE OBJECT MRCUSTOMER
		Customer MrCustomer = new Customer();
		String details;

		//FIRST NAME
		System.out.print("Enter your first name:                    ");
		String firstname = input.nextLine();
		MrCustomer.setFirstName(firstname);

		//LAST NAME
		System.out.print("Enter your last name:                     ");
		details = input.nextLine();
		MrCustomer.setLastName(details);

		//CPR NUMBER
		//BOOLEAN
		//IF ELSE STATEMENT 
		boolean cprNumberCorrect  = false;
		while (!cprNumberCorrect) {

			System.out.print("Enter your CPR number(123456-1234):       ");

			{		
				details = input.nextLine();
				MrCustomer.setCprNumber(details);

				//USING REGEX (REGULAR EXPRESSIONS) TO MATCH
				//6 DIGITS FOLLOWED BY DASH AND THEN 4 DIGITS
				if (details.matches("^(\\d{6}-?\\d{4})$")) 
				{
					cprNumberCorrect = true; 
				}
				else 
				{
					System.out.println("Error: Enter your CPR number in the following format only: 123456-1234");
				}

			}
		}


		//MOBILE NUMBER
		//BOOLEAN
		//IF ELSE STATEMENT 
		System.out.print("Enter your Telephone Number (8 digits):   ");
		boolean mobileNumberCorrect  = false;
		while (!mobileNumberCorrect ) 
		{		
			details = input.nextLine();
			MrCustomer.setMobileNumber(details);

			//8 DIGITS
			if (details.matches("^(\\d{8})$")) 
			{
				mobileNumberCorrect = true; 
			}
			else 
			{
				System.out.println("Error:Invalid number");
				System.out.print("Enter your Telephone Number (8 digits):   ");
			}

		}

		//FIRST LINE ADDRESS
		System.out.print("Enter your address:                       ");
		details = input.nextLine();
		MrCustomer.setAddress(details);

		//HOUSENUMBER
		System.out.print("Enter your house number:                  ");
		details = input.nextLine();
		MrCustomer.setHouseNumber(details);


		//POSTALCODE
		//BOOLEAN
		//IF ELSE STATEMENT 
		System.out.print("Enter your post code (CPH only):          ");
		boolean postCodeCorrect = false;
		while (!postCodeCorrect) 
		{		
			details = input.nextLine();
			MrCustomer.setPostCode(details);

			//REGEX CHECKS IF INPUT MATCHES 1000-2500
			if (details.matches("^(1[0-9][0-9][0-9]|2[0-4][0-9][0-9]|(2500))$"))
			{
				postCodeCorrect = true; 
			}

			else 
			{
				System.out.println("Error: CBS webshop only ships within the Copenhagen region. Please try again. ");
				System.out.print("Enter your post code (CPH only):          ");
			}

		}

		//SET USERNAME AND PASSWORD
		MrCustomer.setUserName();
		MrCustomer.setPassword();


		//DISPLAY FOR USER THEIR NEW USERNAME AND PASSWORD
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(" CONGRATS! YOU HAVE SUCCESSFULLY REGISTERED AS A CUSTOMER. ");
		System.out.println("        Below you find your password and username          ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Your username is: " + MrCustomer.getUserName());
		System.out.println("Your password is: " + MrCustomer.getPassword());

		//RETURN CUSTOMER DETAILS
		return MrCustomer;


	}


}
