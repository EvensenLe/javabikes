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
	
	public void printReceipt() throws IOException {
		
		try (Stream<String> stream = Files.lines(Paths.get("receiptfile.txt"))) {
	        stream.forEach(System.out::println);
	        
	        
	        System.out.println("Thank you for booking a bike");
	        System.out.println("Name: " + CreditCardView.getCreditCardDetails());
	}
		
	
		
		return;
	}
	
}