package data;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import model.Bikes;
import model.Customer;
import model.ElectricBike;

public class ReceiptDataFile {
	
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
			    String[] value = line.split(" ");
			   	    	   
			// CHANGES THE STRING TYPE TO THE CORRECT FORMAT
			    customerFile.setFirstName(value[0]);
				customerFile.setLastName(value[1]);
				customerFile.setCprNumber(value[2]);
				customerFile.setAddress(value[3]);
				customerFile.setHouseNumber(value[4]);
				customerFile.setMobileNumber(value[5]);
				customerFile.setUserName(value[6]);
				customerFile.setPassword(value[7]);
				
				
	     return customerFile;

	}
	
	public static ArrayList<Customer> getAllCustomerDetails(){
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		Scanner input = readDetails("receiptfile.txt");
		

		// checking each line 
		while (input.hasNextLine()) {
			customerList.add(getCustomer(input.nextLine()));//passing each line to the method getCustomer which returns a customer
			} 								//then added to a ArrayList
		
		return customerList;
	}
	

	
//BIKE
	public static ElectricBike getEBike(String line){
		ElectricBike ebikeFile = new ElectricBike();
		
		// FOR EVERYTIME THERE IS A ";" IT TURNS THE VALUES TO A STRING
			    String[] value = line.split(" ");
			   	    	   
			// CHANGES THE STRING TYPE TO THE CORRECT FORMAT
			    ebikeFile.setId(Integer.parseInt(value[0]));
			    ebikeFile.setGender(value[1]);
			    ebikeFile.setPrice(Integer.parseInt(value[2]));
			    ebikeFile.setBatteryCharge(value[3]);
			    ebikeFile.setKmRange(Integer.parseInt(value[4]));
		
				
				
	     return ebikeFile;

	}
	
	public static ArrayList<ElectricBike> getAlleBikeDetails(){
		ArrayList<ElectricBike> ebikeList = new ArrayList<ElectricBike>();
		Scanner input = readDetails("receiptfile.txt");
		

		// checking each line 
		while (input.hasNextLine()) {
			ebikeList.add(getEBike(input.nextLine()));//passing each line to the method getCustomer which returns a customer
			} 								//then added to a ArrayList
		
		return ebikeList;
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

public static void writeArrayEBikeDetails(String file, ArrayList<ElectricBike> input){
	try{
		FileWriter fwriter = new FileWriter(file, true);
		PrintWriter output = new java.io.PrintWriter(fwriter);
		
		for(ElectricBike str: input) { // Write formatted output to the file
			output.println(str);  
		}
		output.close();
	}
	catch (IOException ex) {
		System.out.println("Error writing to file '" + file + "'");
	}
}
	


}
