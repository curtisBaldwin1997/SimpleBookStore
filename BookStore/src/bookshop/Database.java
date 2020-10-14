package bookshop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Database {

	private static List<Book> collection = new ArrayList<Book>(); //Create ArrayList of Book and call it collection

	/**
	 * Method to add books
	 * @return
	 */
	public List<Book> getBookList() {

		collection.add(new Book(1, "Moby Dick", 1851, 15.20));
		collection.add(new Book(2, "The Terrible privacy of Maxwell Sim", 2010, 13.14));
		collection.add(new Book(3, "Still Life With Woodpecker", 1980, 11.05));
		collection.add(new Book(4, "Sleeping Murder", 1976, 10.24));
		collection.add(new Book(5, "Three Men in a Boat", 1889, 12.87));
		collection.add(new Book(6, "The Time Machine", 1895, 10.43));
		collection.add(new Book(7, "The Caves of Steel", 1954, 8.12));
		collection.add(new Book(8, "Idle Thoughts of an Idle Fellow", 1886, 7.32));
		collection.add(new Book(9, "A Christmas Carol", 1843, 4.23));
		collection.add(new Book(10, "A Tale of Two Cities", 1859, 6.32));
		collection.add(new Book(11, "Great Expectations", 1861, 13.21));
		return collection; //Return collection of books
	}

	/**
	 * ToString method to be called
	 */
	@Override
	public String toString() {
		String total = "\n";
		for (int i = 0; i < collection.size(); i++) {
			Book b = collection.get(i);	//Loop through all Books in collection ArrayList
			total = total + b.toString();
		}
		return total; //Return Books
	}

}
