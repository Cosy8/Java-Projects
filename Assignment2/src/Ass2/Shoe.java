//Blair Cosgrove (104992533)
//Assignment 2
//11/17/2019

package Ass2;

public class Shoe extends Item implements Comparable<Shoe>{
	private String colour;	//	must be white, silver, red, beige, brown, blue, black, pink.	
	public double size;		//	Holds the shoes size.
	
	//	Overloaded constructor.
	public Shoe(double price, int quantity, String title, String colour, double size) throws InvalidTitleException, InvalidPriceException, InvalidColourException {
		super(price, quantity, title);
		if (!colour.equals("white") && !colour.equals("silver") && !colour.equals("red") && !colour.equals("beige") && !colour.equals("brown") && !colour.equals("blue") && !colour.equals("black") && !colour.equals("pink"))
			throw new InvalidColourException(colour);
		this.colour = colour;
		this.size = size;
	}

	/**
	 * Prints this type of item.
	 */
	public void Display() 
	{
		System.out.println("Type: Shoe");
		System.out.println("Price: $" + getPrice());
		System.out.println("Quantity: " + getQuantity());
		System.out.println("Title: " + getTitle());
		System.out.println("Colour: " + colour);
		System.out.println("Size: " + size);
	}

	/**
	 * 
	 * @param colour
	 * @return
	 */
	public boolean isValidColour(String colour)
	{
		return true;
	}
	
	/**
	 * Identifies the type of item.
	 */
	public int getType() 
	{
		return 3;
	}

	@Override
	public int compareTo(Shoe o) 
	{
		if (this.size > o.size)
			return 1;
		else if(this.size < o.size)
			return -1;
		else
			return 0;
	}

}
