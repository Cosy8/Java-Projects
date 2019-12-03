//	Assignment 3
//	Blair Cosgrove (104992533)
//	11/25/2019

package ass3;

import java.util.*;

public class HumanPlayer extends Player
{
	/**
	 * Allows the player to choose the position they want their symbol in.
	 */
	public void play(Board gameboard) 
	{
		int input = 0;
		gameboard.makeMove();
		
		//	Get input from user.
		Scanner sc = new Scanner(System.in);
		System.out.print(this.name + "'s turn\nEnter position > ");
		input = sc.nextInt();
		
		//	Determine the position in the 2D array to place the symbol.
		if (input < 1 || input > 9)
		{	
			while (input < 1 || input > 9)
			{
				System.out.println("Invalid input.");
				System.out.print(this.name + "'s turn\nEnter position > ");
				input = sc.nextInt();
			}
		}
		else if (input <= 3 && input >= 1)
		{
			gameboard.gameboard[0][input - 1].setState(this.symbol);
		}
		else if (input - 3 <= 3 && input - 3 >= 1)
		{
			gameboard.gameboard[1][input - 4].setState(this.symbol);
		}
		else if (input - 6 <= 3 && input - 6 >= 1)
		{
			gameboard.gameboard[2][input - 7].setState(this.symbol);
		}

	}

}
