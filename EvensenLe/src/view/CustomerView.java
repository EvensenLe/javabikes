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
			String details;
			
			System.out.print("Enter your first name: ");
			details = input.nextLine();
			MrCustomer.setFirstName(details);
			
			System.out.print("Enter your last name: ");
			details = input.nextLine();
			MrCustomer.setLastName(details);
			
			System.out.println("Enter your CPR number(123456-1234):");
			details = input.nextLine();
			
			if (details.matches("^(\\d{6}-?\\d{4})$")) 
				MrCustomer.setCprNumber(details);
		else 
			System.out.println("you have entered wrong CPR number");
			
			
			
			System.out.println("Enter your Telephone Number (8 digits):");
			
			
			details = input.nextLine();
			
			if (details.matches("[0-9]+") && details.length()==8) 
				MrCustomer.setMobileNumber(details);
			else
				System.out.println("Invalid number");
			
			
  
			System.out.print("Enter your address: ");
		    details = input.nextLine();
		    MrCustomer.setAddress(details);
			
		    System.out.println("Enter your house number:");
			details = input.nextLine();
			MrCustomer.setHouseNumber(details);
			
			
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

			
			MrCustomer.setUserName();
			MrCustomer.setPassword();
						
			//GENERATE USERNAME AND PASSWORD USING SUBSTRING AND CHARAT
			
			//MrCustomer.setUserName(firstname.charAt(0) + lastname.substring(0, 3));
		
			//MrCustomer.setPassword(lastname.substring(0, 3) + cprNumber.substring(7, 11));
			
			//System.out.println("Your username is: " + MrCustomer.getUserName());
			//System.out.println("Your password is: " + MrCustomer.getPassword());
				
			
			
		 
			//RETURN CUSTOMER DETAILS
			return MrCustomer;
			
			
		}
		public void printCustomerDetails(Customer MrCustomer) {
			
			System.out.println(MrCustomer.toString());
		}

		
		
	
	
}
