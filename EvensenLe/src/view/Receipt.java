package view;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

import model.Customer;
import view.CustomerView;


public class Receipt {

	
	public Receipt() {
	}
	
	private static Customer mrCustomer = new Customer();

	
	public void printReceipt() throws IOException {
		
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("            THIS IS YOUR CBS BIKESHARING RECEIPT           ");
		System.out.println("          Below you will see your personal details         ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	  
		System.out.println("         ---------------------------------------------     ");
		System.out.println("                            RECEIPT                        ");
		System.out.println("         ---------------------------------------------     ");

		System.out.println("-------- __@      __@       __@       __@      __~@  ------");
		System.out.println("----- _``|<,_   ``|<,,_   ``|<,<,_  ``|<,<,_ ``|<,<,_ -----");
		System.out.println("---- (*)/ (*)  (*)/ (*)  (*)/ (*)  (*)/ (*)  (*)/ (*)  ----");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	    System.out.println("                       YOUR INFORMATION:                 \n");
	   
	
	   
		        try (Stream<String> stream = Files.lines(Paths.get("receiptfile.txt"))) {
			        stream.forEach(System.out::println);
				
		System.out.println("         ---------------------------------------------\n");
		System.out.println("             Thank you for shopping with JavaBikes    \n");
		System.out.println("                       See you again!                 \n");
		System.out.println("         ---------------------------------------------\n");
	        }
		
	
		
		return;
	}


	}
