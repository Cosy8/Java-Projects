//Blair Cosgrove (104992533)
//Assignment 2
//11/17/2019

package Ass2;

import java.util.*;

public class MyeStore {

	public static void main(String[] args) throws InvalidTitleException, InvalidPriceException, InvalidColourException {
		ArrayList<Item> cart = new ArrayList<Item>();	//	Holds all items added to cart
		ArrayList<Item> toSort = new ArrayList<Item>();	//	Used for holding temporary values for sorting an output
		Scanner sc = new Scanner(System.in);
		int input;										//	Holds the users input.
		
		//	Loop to continue asking the user for an input until they are done.
		do
		{
			System.out.println("\n-------------MENU-------------");
			System.out.println("0: Add Item to the inventory");
			System.out.println("1: Display all items");
			System.out.println("2: Display only books sorted by author name");
			System.out.println("3: Display only gifts sorted by label");
			System.out.println("4: Display only shoes sorted by size");
			System.out.println("5: Delete an item by item id");
			System.out.println("6: Purchase an item by removing the purchased quantity from the inventory");
			System.out.println("-1: Exit");
			System.out.println("------------------------------");
			System.out.print("\nEnter Number > ");
			
			input = sc.nextInt();
			
			//	Determine what to do depending on the user's input.
			switch (input)
			{
				case -1:
					//	Exits program
					System.out.println("Goodbye...");
					break;
				case 0:
					System.out.print("Type of item (1 = Book, 2 = Gift Card, 3 = Shoe): ");
					int type = sc.nextInt();
					
					//	Check if valid input.
					if(type != 1 && type != 2 && type != 3)
					{
						System.out.println("Invalid type.");
						break;
					}
					
					System.out.print("Enter price: ");
					double price = sc.nextDouble();
					System.out.print("Enter quantity: ");
					int quantity = sc.nextInt();
					sc.nextLine();
					System.out.print("Enter title: ");
					String t1 = sc.nextLine();
					
					switch (type)
					{
						//	For book input
						case 1:
							System.out.print("Enter author's name: ");
							String name = sc.nextLine();
							System.out.print("Enter book's name: ");
							String t2 = sc.nextLine();
							System.out.print("Enter year: ");
							int year = sc.nextInt();
							
							try
							{
								Book b = new Book(price, quantity, t1, name, t2, year);
								cart.add(b);
							}
							catch(InvalidPriceException ipe)
							{
								System.err.print(ipe);
							}
							catch(InvalidTitleException ite)
							{
								System.err.print(ite);
							}
							
							break;
						//	For gift card input.
						case 2:
							System.out.print("Enter label: ");
							String label = sc.nextLine();
							System.out.print("Enter manufacturer: ");
							String manufacturer = sc.nextLine();
							
							try
							{
								GiftCard g = new GiftCard(price, quantity, t1, label, manufacturer);
								cart.add(g);
							}
							catch(InvalidPriceException ipe)
							{
								System.err.print(ipe);
							}
							catch(InvalidTitleException ite)
							{
								System.err.print(ite);
							}
							
							break;
						//	For shoe input.
						case 3:
							System.out.print("Enter colour: ");
							String colour = sc.nextLine();
							System.out.print("Enter size: ");
							double size = sc.nextDouble();
							
							try
							{
								Shoe s = new Shoe(price, quantity, t1, colour, size);
								cart.add(s);
							}
							catch(InvalidPriceException ipe)
							{
								System.err.print(ipe);
							}
							catch(InvalidTitleException ite)
							{
								System.err.print(ite);
							}
							catch(InvalidColourException ice)
							{
								System.err.print(ice);
							}
							
							break;
					}
					
					break;
					
				case 1:
					//	Print the contents of the arrayList.
					for (int i = 0; i < cart.size(); i++)
					{
						System.out.println("Item #" + (i + 1));
						cart.get(i).Display();
						System.out.println("\n");
					}
					
					break;
					
				case 2:
					//	Print Books sorted by Author.
					for(int j = 0; j < cart.size(); j++)
					{
						if (cart.get(j).getType() == 1)
							toSort.add((Book) cart.get(j));
					}
					
					toSort.sort(null);
					
					for(int j = 0; j < toSort.size(); j++)
					{
						toSort.get(j).Display();
						System.out.println("");
					}
					
					toSort.clear();
					break;
					
				case 3:
					//	Print Gift Cards sorted by Label
					for(int k = 0; k < cart.size(); k++)
					{
						if (cart.get(k).getType() == 2)
							toSort.add((GiftCard) cart.get(k));
					}
					
					toSort.sort(null);
					
					for(int k = 0; k < toSort.size(); k++)
					{
						toSort.get(k).Display();
						System.out.println("");
					}
					
					toSort.clear();
					break;
					
				case 4:
					//	Print shoes sorted by size
					for(int l = 0; l < cart.size(); l++)
					{
						if (cart.get(l).getType() == 3)
							toSort.add((Shoe) cart.get(l));
					}
					
					toSort.sort(null);
					
					for(int l = 0; l < toSort.size(); l++)
					{
						toSort.get(l).Display();
						System.out.println("");
					}
					
					toSort.clear();
					break;
					
				case 5:
					//	Deletes a certain id from the arrayList
					System.out.print("Enter id to delete (First element = 1, " + cart.size() + " elements in the cart): ");
					int toDelete = sc.nextInt();
					
					if (toDelete > cart.size())
					{
						System.out.println("Invalid id.");
						break;
					}
					
					cart.remove(toDelete - 1);
					break;
					
				case 6:
					//	Purchases  quantity
					System.out.print("Enter id of item to purchase (First element = 1, " + cart.size() + " elements in the cart): ");
					int num = sc.nextInt() - 1;
					
					//	Check if it is a valid id.
					if (num >= cart.size())
					{
						System.out.println("Invalid id.");
						break;
					}
					
					//	Get quantity from user.
					int quan = Item.Purchase();
					
					//	Check if valid quantity
					if (quan > cart.get(num).quantity)
					{
						System.out.println("There are not that many in the cart.");
						break;
					}
					
					//	If Item = 0 quantity, it is removed from the cart.
					cart.get(num).quantity -= quan;
					if (cart.get(num).quantity == 0)
						cart.remove(num);
					
					break;
					
				default:
					System.out.println("Invalid Input");
			}
		}
		while(input != -1);
		
		sc.close();
	}

}