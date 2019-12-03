//	Assignment 3
//	Blair Cosgrove (104992533)
//	11/25/2019

package ass3;

public abstract class Player 
{
	String symbol;		//	X or O
	String name;	
	
	//	Abstract method so that each player can play.
	public abstract void play(Board gameboard);
}
