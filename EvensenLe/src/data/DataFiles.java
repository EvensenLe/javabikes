package data;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import model.Customer;

public class DataFiles {
	
	public static Scanner readDetails(String file){
		Scanner input = new Scanner(System.in);
		
		try {
			
		File ReadFile = new java.io.File(file);
		
		input = new Scanner(ReadFile);
		
	    // Close the file
	   
		}
	    catch (FileNotFoundException ex){
	    	System.out.println("Error reading the file'" + file + "'");
	    }
		return input;
	}
	
					//CUSTOMER
	public static Customer getCustomer(String line){
		Customer customerFile = new Customer();
		
		// FOR EVERYTIME THERE IS A ";" IT TURNS THE VALUES TO A STRING
			    String[] value = line.split(";");
			   	    	   
			// CHANGES THE STRING TYPE TO THE CORRECT FORMAT
			    customerFile.setFirstName(value[0]);
				customerFile.setLastName(value[1]);
				customerFile.setCprNumber(value[2]);
				customerFile.setAddress(value[3]);
				customerFile.setHouseNumber(value[4]);
				customerFile.setPostCode(value[5]);
				customerFile.setMobileNumber(value[6]);
				customerFile.setUserName(value[7]);
				customerFile.setPassword(value[8]);
				
				
	     return customerFile;

	}
			//ARRAYLIST CUSTOMER
	public static ArrayList<Customer> getAllCustomerDetails(){
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		Scanner input = readDetails("customerfile.txt");
		

		// checking each line 
		while (input.hasNextLine()) {
			customerList.add(getCustomer(input.nextLine()));//passing each line to the method getCustomer which returns a customer
			} 								//then added to a ArrayList
		
		return customerList;
	}




public static void WriteDetails(String file, String input){
	try{
	FileWriter fwriter = new FileWriter(file,true);
	PrintWriter output = new java.io.PrintWriter(fwriter);
	 // Write formatted output to the file
    output.println(input);
    output.close();
	}
	catch (IOException ex) {
		// if the file is not accessible, print this message
		System.out.println("Error writing to file '" + file + "'");
	}
}

public static void writeArrayDetails(String file, ArrayList<Customer> input){
	try{
		FileWriter fwriter = new FileWriter(file, true);
		PrintWriter output = new java.io.PrintWriter(fwriter);
		
		for(Customer str: input) { // Write formatted output to the file
			output.println(str);  
			

		}
		output.close();
	}
	catch (IOException ex) {
		System.out.println("Error writing to file '" + file + "'");
	}
}



/** delete a file */
public static void deleteFile(String file) { // delete old txt.
	// try {
	File oldFile = new java.io.File(file);
		 if (oldFile.exists()) { // replace by try catch?
			oldFile.delete();
		 }
	// catch (FileNotFoundException ex){ // catch if file not found
	// 	System.out.println("Error reading the file'" + file + "'");
	 //}
}
}
