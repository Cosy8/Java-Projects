//	Assignment 3
//	Blair Cosgrove (104992533)
//	11/25/2019

package ass3;

import java.util.*;

public class Game implements Global
{
	Board gameboard;	//	The gameboard.
	Player PlayerX;		
	Player PlayerO;
	
	//	Default constructor.
	public Game()
	{
		gameboard = new Board();
	}
	
	/**
	 * Runs the game.
	 */
	public void start()
	{
		Scanner sc = new Scanner(System.in);
		
		int choiceX;	//	Holds the type of player .
		int choiceO;	//	Holds the type of player.
		
		//	Receive the type of player from the user.
		System.out.print("Player 1 (1 for Human, 0 for AI): ");
		choiceX = sc.nextInt();
		System.out.print("Player 2 (1 for Human, 0 for AI): ");
		choiceO = sc.nextInt();
		
		//	Determine which kind of player X is.
		if (choiceX == 1)
		{
			PlayerX = new HumanPlayer();
		}
		else
		{
			PlayerX = new AIPlayer();
		}
		
		//	Determine which kind of player O is.
		if (choiceO == 1)
		{
			PlayerO = new HumanPlayer();
		}
		else
		{
			PlayerO = new AIPlayer();
		}
		
		//	Receive player's names from the user.
		System.out.print("Enter player 1's name: ");
		PlayerX.name = sc.next();
		PlayerX.symbol = "X";
		System.out.print("Enter player 2's name: ");
		PlayerO.name = sc.next();
		PlayerO.symbol = "O";
		
		//	Coin toss to decide who starts.
		System.out.println("Coin toss...");
		int starter = (int) (Math.random() * 2) + 1;
		int currentPlayer = 0;
		
		if (starter == 1)
		{
			System.out.println(PlayerX.name + " won the coin toss. They go first.");
			currentPlayer = 1;
			PlayerX.play(gameboard);
		}
		else if (starter == 2)
		{
			System.out.println(PlayerO.name + " won the coin toss. They go first.");
			currentPlayer = 2;
			PlayerO.play(gameboard);
		}
			
		String name = "";
		int turnCounter = 0;
		
		//	Loop to alternate players taking turns.
		while (gameboard.getState(name) != WIN)
		{
			turnCounter++;
			if (turnCounter == 9)
			{
				if (gameboard.getState(name) == DRAW)
				{
					gameboard.makeMove();
					System.out.println("DRAW");
					break;
				}
			}
			else if (currentPlayer == 1)
			{
				currentPlayer = 2;
				PlayerO.play(gameboard);
				name = PlayerO.name;
			}
			else if(currentPlayer == 2)
			{
				currentPlayer = 1;
				PlayerX.play(gameboard);
				name = PlayerX.name;
			}
			
		}
		
		sc.close();
	}
}
