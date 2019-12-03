//Blair Cosgrove (104992533)
//Assignment 2
//11/17/2019

package Ass2;

public class GiftCard extends Item implements Comparable<GiftCard>{
	private String label;			//	Holds a label for the gift card.
	private String manufacturer;	//	Holds the name of the manufacturer.
	
	//	Overloaded constructor.
	public GiftCard(double price, int quantity, String title, String label, String manufacturer) throws InvalidTitleException, InvalidPriceException 
	{
		super(price, quantity, title);
		this.label = label;
		this.manufacturer = manufacturer;
	}

	/**
	 * Prints this type of item.
	 */
	public void Display() 
	{
		System.out.println("Type: Gift Card");
		System.out.println("Price: $" + getPrice());
		System.out.println("Quantity: " + getQuantity());
		System.out.println("Title: " + getTitle());
		System.out.println("Label: " + label);
		System.out.println("Manufacturer: " + manufacturer);
	}

	/**
	 * Identifies the type of item.
	 */
	public int getType() 
	{
		return 2;
	}


	@Override
	public int compareTo(GiftCard o)
	{
		if (this.label.compareTo(o.label) > 0)
			return 1;
		else if(this.label.compareTo(o.label) < 0)
			return -1;
		else
			return 0;
	}

}
