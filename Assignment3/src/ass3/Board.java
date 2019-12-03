//	Assignment 3
//	Blair Cosgrove (104992533)
//	11/25/2019

package ass3;

public class Board implements Global
{
	Block[][] gameboard;	//	The gameboard, 2D array of 9 blocks.
	
	//	Default constructor
	public Board()
	{
		gameboard = new Block[3][3];
		
		//	Loop to instantiate the array of Blocks.
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				gameboard[i][j] = new Block();
			}
		}
	}
	
	/**
	 * Prints the board for the user to see.
	 */
	public void makeMove()
	{
		int counter = 0;	//	Counter for displaying the board.
		
		System.out.println("");
			
		//	Print the board for the user to see.
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				counter++;
				
				if (gameboard[i][j].getState() == "EMPTY")
				{
					System.out.print("" + counter + " ");
				}
				else
				{
					System.out.print(gameboard[i][j].getState() + " ");
				}
					
			}
			
			System.out.println("");
		}
	
	}
	
	/**
	 * Returns the state, obtained from updateState.
	 * @param name The name of the player.
	 * @return An int for the state.
	 */
	public int getState(String name)
	{
		return this.updateState(name);
	}
	
	/**
	 * Checks if an end condition is meet.
	 * @param name The name of the current player.
	 * @return 1 if that player wins, 0 otherwise.
	 */
	public int updateState(String name)
	{
		if (checkRow(0) || checkRow(1) || checkRow(2) || checkCol(0) || checkCol(1) || checkCol(2) || checkDiagonals())
		{
			this.makeMove();
			System.out.println(name + " wins!");
			return 1;
		}
		else
		{
			return 0;
		}
	}
	
	/**
	 * Check a given row.
	 * @param b The row number.
	 * @return True if they are all the same state and not empty.
	 */
	public boolean checkRow(int b)
	{
		return this.gameboard[b][0].getState() == this.gameboard[b][1].getState() && this.gameboard[b][0].getState() == this.gameboard[b][2].getState() && this.gameboard[b][0].getState() != "EMPTY";
	}
	
	/**
	 * Check a given column.
	 * @param a The column number.
	 * @return True if they are all the same state and not empty.
	 */
	public boolean checkCol(int a)
	{
		return this.gameboard[0][a].getState() == this.gameboard[1][a].getState() && this.gameboard[0][a].getState() == this.gameboard[2][a].getState() && this.gameboard[0][a].getState() != "EMPTY";
	}
	
	/**
	 * Check the two diagonals.
	 * @return True if one of the diagonals are all the same state and not empty.
	 */
	public boolean checkDiagonals()
	{
		return this.gameboard[0][0].getState() == this.gameboard[1][1].getState() && this.gameboard[0][0].getState() == this.gameboard[2][2].getState() && this.gameboard[0][0].getState() != "EMPTY" || this.gameboard[0][2].getState() == this.gameboard[1][1].getState() && this.gameboard[0][2].getState() == this.gameboard[2][0].getState() && this.gameboard[0][2].getState() != "EMPTY"; 
	}
}
