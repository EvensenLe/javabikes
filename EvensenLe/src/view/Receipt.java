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
	  
	        
	        try (Stream<String> stream = Files.lines(Paths.get("receiptfile.txt"))) {
		        stream.forEach(System.out::println);
	}
		
	
		
		return;
	}
	
}