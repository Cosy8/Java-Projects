//Blair Cosgrove (104992533)
//Assignment 2
//11/17/2019

package Ass2;

import java.util.Scanner;

public abstract class Item {
	private static int item_id = 0; 	//	Positive integer.
	private double price;				//	Positive number.
	public int quantity;				//	Holds the number of that item in that inventory.
	private String title;				//	Can't be empty
	
	//	Overloadeded constructor.
	public Item(double price, int quantity, String title) throws InvalidTitleException, InvalidPriceException
	{
		if (title.length() == 0) throw new InvalidTitleException("No title");
		if (price < 0) throw new InvalidPriceException("Negative price");
		
		item_id += 1;
		this.price = price;
		this.quantity = quantity;
		this.title = title;
		
	}
	
	//	Abstract method to display an item.
	public abstract void Display();
	
	//	Abstract method to recieve what object each element in the list is (1 for book, 2 for gift card, 3 for Shoe).
	public abstract int getType();
	
	/**
	 * Gets the quantity from the user.
	 * @return A integer for quantity recieved.
	 */
	public static int Purchase()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter quantity to purchase: ");
		int quan = sc.nextInt();
		return quan;
	}
	
	/**
	 * Returns the price.
	 * @return double price.
	 */
	public double getPrice()
	{
		return price;
	}
	
	/**
	 * Returns the quantity.
	 * @return integer quantity.
	 */
	public int getQuantity()
	{
		return quantity;
	}
	
	/**
	 * Returns the title.
	 * @return String title.
	 */
	public String getTitle()
	{
		return title;
	}
}
