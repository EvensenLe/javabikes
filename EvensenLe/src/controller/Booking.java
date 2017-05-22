package controller;
//AUTHORS; EMILIE F. EVENSEN & JULIA LEE
import model.Customer;
import view.BookingView;
import view.CustomerView;
import view.LogInView;
import java.util.Scanner;

public class Booking {

	private static Customer mrCustomer = new Customer();
	private static BookingView booking = new BookingView();
	//private static CustomerView cView = new CustomerView();
	private static LogInView logIn = new LogInView();


	//MAIN CLASS
	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);

		//MAIN MENU
		//SWITCH STATEMENT FOR CHOOSING MENU
		//BOOLEAN CHOICE TO GET OUT OF SWITCH
		logIn.welcomeDetails();
		boolean choice = true;
		while (choice) {
			String menuChoice = input.nextLine();
			switch (menuChoice) {
			case "1": //TYPE 1 TO CREATE CUSTOMER
				mrCustomer = CustomerView.CustomerDetails();
				mrCustomer.writeCustomerToFile(); //WRITE CUSTOMER TO FILE
				booking.printBooking();
				choice = false;
				break;
			case "2": //TYPE 2 TO LOGIN WITH EXISTING USER
				LogInView.customerHasToLogin();
				booking.printBooking();
				choice = false;
				break; //3 FOR EXITING SYSTEM
			case "3": System.out.println("You have successfully exited the system. Have a great day.");
			System.exit(0);
			break;
			default: System.out.print("Error! Please write '1', '2' or '3'");
			break;
			}
		}

	}

}

