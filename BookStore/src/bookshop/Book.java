package bookshop;

public class Book {

	private int id; // Define Book ID
	private int year; // Define Year of Book
	private double price; // Define Price of Book
	private String title; // Define Title of Book

	/**
	 * Method to Create a book for use in ArrayList
	 * 
	 * @param bookID
	 * @param bookTitle
	 * @param bookYear
	 * @param bookPrice
	 */
	public Book(int bookID, String bookTitle, int bookYear, double bookPrice) {
		this.setId(bookID);
		this.setTitle(bookTitle);
		this.setYear(bookYear);
		this.setPrice(bookPrice);
	}

	/**
	 * Getter for id
	 * 
	 * @return
	 */
	public int getId() {
		return id; // Read value of ID
	}

	/**
	 * Setter for id
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id; // Update value of ID
	}

	/**
	 * Getter for Title
	 * 
	 * @return
	 */
	public String getTitle() {
		return title; // Read value of Title
	}

	/**
	 * Setter for Title
	 * 
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title; // Update value of Title
	}

	/**
	 * Getter for Price
	 * 
	 * @return
	 */
	public double getPrice() {
		return price; // Read value of Price
	}

	/**
	 * Setter for Price
	 * 
	 * @param price
	 */
	public void setPrice(double price) {
		this.price = price; // Update value of Price
	}

	/**
	 * Getter for Year
	 * 
	 * @return
	 */
	public int getYear() {
		return year; // Read value of Year
	}

	/**
	 * Setter for Year
	 * 
	 * @param year
	 */
	public void setYear(int year) {
		this.year = year; // Update value of Year
	}

	/**
	 * To string method to handle single book entry
	 */
	@Override
	public String toString() {
		return ("\n" + id + " " + title + " (" + year + ") " + "£" + price); // Add each part of book to string
	}

}
