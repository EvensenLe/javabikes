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
			
			System.out.print("Enter your first name:                    ");
			details = input.nextLine();
			MrCustomer.setFirstName(details);
			
			System.out.print("Enter your last name:                     ");
			details = input.nextLine();
			MrCustomer.setLastName(details);
			
			System.out.print("Enter your CPR number(123456-1234):       ");
			details = input.nextLine();
			
			if (details.matches("^(\\d{6}-?\\d{4})$")) 
				MrCustomer.setCprNumber(details);
		else 
			System.out.println("you have entered wrong CPR number");
			
			
			
			System.out.print("Enter your Telephone Number (8 digits):   ");
			
			
			details = input.nextLine();
			
			if (details.matches("[0-9]+") && details.length()==8) 
				MrCustomer.setMobileNumber(details);
			else
				System.out.println("Invalid number");
			
			
  
			System.out.print("Enter your address:                       ");
		    details = input.nextLine();
		    MrCustomer.setAddress(details);
			
		    System.out.print("Enter your house number:                  ");
			details = input.nextLine();
			MrCustomer.setHouseNumber(details);
			
			
			//ASK FOR POST CODE WITHIN COPENHAGEN AREA
			System.out.print("Enter your post code (CPH only):          ");
			
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
			
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println(" CONGRATS! YOU HAVE SUCCESSFULLY REGISTERED AS A CUSTOMER. ");
			System.out.println("        Below you find your password and username          ");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("Your username is: " + MrCustomer.getUserName());
			System.out.println("Your password is: " + MrCustomer.getPassword());
						
			
		 
			//RETURN CUSTOMER DETAILS
			return MrCustomer;
			
			
		}
		public void printCustomerDetails(Customer MrCustomer) {
			
			System.out.println(MrCustomer.toString());
		}

		
		
	
	
}
