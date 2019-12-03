//Blair Cosgrove (104992533)
//Assignment 2
//11/17/2019

package Ass2;

public class Book extends Item implements Comparable<Book>{
	public String Author;	//	Holds the Authors name.
	private String Title;	//	Holds the book's title.
	private int Year;		//	Holds the year published.
	
	//	Overloaded constructor.
	public Book(double price, int quantity, String title, String Author, String Title, int Year) throws InvalidTitleException, InvalidPriceException {
		super(price, quantity, title);
		this.Author = Author;
		this.Title = Title;
		this.Year = Year;
	}

	/**
	 * Prints this type of item.
	 */
	public void Display() 
	{
		System.out.println("Type: Book");
		System.out.println("Price: $" + getPrice());
		System.out.println("Quantity: " + getQuantity());
		System.out.println("title: " + getTitle());
		System.out.println("Author: " + Author);
		System.out.println("Book title: " + Title);
		System.out.println("year: " + Year);
	}

	/**
	 * Identifies the item.
	 */
	public int getType() 
	{
		return 1;
	}

	@Override
	public int compareTo(Book o) 
	{
		if (this.Author.compareTo(o.Author) > 0)
			return 1;
		else if(this.Author.compareTo(o.Author) < 0)
			return -1;
		else
			return 0;
	}

}
