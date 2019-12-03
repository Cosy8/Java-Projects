//	Assignment 3
//	Blair Cosgrove (104992533)
//	11/25/2019

package ass3;

public class AIPlayer extends Player
{
	/**
	 * Allows the AI to make a move.
	 */
	public void play(Board gameboard) 
	{
		int ranX;
		int ranY;
		
		//	Loop to find an empty block to place the corresponding symbol.
		do
		{
			ranX = (int) (Math.random() * 3) ;
			ranY = (int) (Math.random() * 3) ;
		}
		while(gameboard.gameboard[ranX][ranY].getState() != "EMPTY");
		
		gameboard.gameboard[ranX][ranY].setState(super.symbol);
		gameboard.makeMove();
	}

}
