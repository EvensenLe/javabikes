package view;

import java.util.*;

import model.Customer;

public class CustomerView {
	
	public CustomerView(){
		
	}

	
		//THE VIEW CLASS HANDLES ALL INPUT AND OUTPUT
	
		public static Customer CustomerDetails(){
			
			Scanner input = new Scanner(System.in);
			
			//GET CUSTOMER DETAILS
			Customer MrCustomer = new Customer();
			
			
			System.out.print("Enter your first name: ");
			String firstname = input.nextLine();
			MrCustomer.setFirstName(firstname);
			
			System.out.print("Enter your last name: ");
			String lastname = input.nextLine();
			MrCustomer.setLastName(lastname);
			
			System.out.println("Enter your CPR number(123456-1234):");
			String cprNumber = input.nextLine();
			
			if (cprNumber.matches("^(\\d{6}-?\\d{4})$")) 
				MrCustomer.setCprNumber(cprNumber);
		else 
			System.out.println("you have entered wrong CPR number");
			
			
			
			System.out.println("Enter your Telephone Number (8 digits):");
			
			
			String mobileNumber = input.nextLine();
			
			if (mobileNumber.matches("[0-9]+") && mobileNumber.length()==8) 
				MrCustomer.setMobileNumber(mobileNumber);
			else
				System.out.println("Invalid number");
			
			
  
			System.out.print("Enter your address: ");
		    String address = input.nextLine();
		    MrCustomer.setAddress(address);
			
		    System.out.println("Enter your house number:");
			String housenumber = input.nextLine();
			MrCustomer.setHouseNumber(housenumber);
			
			
			//ASK FOR POST CODE WITHIN COPENHAGEN AREA
			System.out.println("Enter your post code (Copenhagen area only):");
			
			boolean c = false; 
			while (!c)
		 {
			MrCustomer.setPostCode(input.nextInt());

		 if (MrCustomer.getPostCode() <= 2500 && MrCustomer.getPostCode() > 1000) 
			{
			c = true; 
			}

			else 
			{
			System.out.println("Error: CBS webshop only ships within the Copenhagen region. Please try again. ");
			}}

						
			//GENERATE USERNAME AND PASSWORD USING SUBSTRING AND CHARAT
			
			MrCustomer.setUserName(firstname.charAt(0) + lastname.substring(0, 3));
		
			MrCustomer.setPassword(lastname.substring(0, 3) + cprNumber.substring(7, 11));
			
			System.out.println("Your username is: " + MrCustomer.getUserName());
			System.out.println("Your password is: " + MrCustomer.getPassword());
				
			
			
		 
			//PRINT OUT CUSTOMER DETAILS
			return MrCustomer;
			
			
		}


		
		
	
	
}
