package bookshop;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Order {

	private static boolean running = true; // Set to always true
	private static boolean purchase = true; // Set to always true

	private static Scanner input = new Scanner(System.in); // Handle user input

	private static Database data = new Database(); // Declare instance of Database class
	private static List<Book> collection = data.getBookList(); // Call getBookList

	private static double total; // Define total
	private static double discount; // Define discount

	private static DecimalFormat decimal = new DecimalFormat("#.00"); // Define decimal format

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while (running) { // While loop to run until user wishes to exit
			System.out.println("\nWelcome to the book store" + "\nEnter 0 for list of books." // Print menu
					+ "\nEnter 1 for list of discounts." + "\nEnter 2 to make a purchase." + "\nEnter 3 to quit.");
			int answer = input.nextInt(); // Handle user selection from menu
			switch (answer) {
			case 0:
				System.out.println(data.toString()); // print to string created in Database class
				break;
			case 1:
				discounts(); // Call discount method
				break;
			case 2:
				purchaseBook(); // Call purchaseBook method
				break;
			case 3:
				quitBookstore(); // Call quit bookstore method
				break;
			default:
				System.out.println("Invalid input"); // If input does not match cases above print invalid input

			}
		}
		System.exit(0);

	}

	/**
	 * Method to purchase a list of books
	 * 
	 * @return
	 */
	public static Book purchaseBook() {

		while (purchase) { // While loop used to loop the purchaseBook method until the user has finished
							// purchasing
			System.out.println("Please enter book ID's you wish to purchase, press (0) to make a new purchase");
			int bookchoice = input.nextInt(); // Handle user input

			if (((bookchoice == 0))) { // if user input equals 0 exit the loop
				total = 0; // on exit re set total to 0 in order to carry out new purchase
				break; // exit loop
			}

			for (Book information : collection) { // for loop which searches in class Book, and checks in ArrayList
													// collection
				if (bookchoice == information.getId()) { // If user input matches ID of book
					System.out.println(information); // Print out corresponding book
					total += information.getPrice(); // Add the price of found book to total
					if (information.getYear() > 2000) { // Retrieve year of book from ArrayList and if greater than 2000
						discount = total * 10 / 100; // Apply discount of 10%
						total = total - discount; // Take discount away from total
					} else if (total > 30) { // If total is greater than 30
						discount = total * 5 / 100; // Apply discount of 5%
						total = total - discount; // Take discount away from total
					}
					decimal.setRoundingMode(RoundingMode.DOWN); // Set decimal to round down and not round up
					System.out.println("Total price: " + "£" + (decimal.format(total))); // Print total price in
																							// predefined decimal format

				}

			}

		}

		return null; // If no book found return null
	}

	/**
	 * List of discounts available
	 */
	private static void discounts() {
		// TODO Auto-generated method stub
		System.out.println("All books published after 2000 have a 10% discount."); // Print discounts
		System.out.println("Buy books worth more than £30 in total, get a 5% discount on the total.");

	}

	/**
	 * Method to quit application
	 */
	private static void quitBookstore() {
		// TODO Auto-generated method stub
		running = false; // set boolean running to false
	}

}
