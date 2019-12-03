//	Assignment 3
//	Blair Cosgrove (104992533)
//	11/25/2019

package ass3;

public class Block 
{
	private String state;	//	EMPTY, X, or Y
	
	//	Default constructor.
	public Block()
	{
		state = "EMPTY";	//	Default state.
	}
	
	/**
	 * Sets the state of the block.
	 * @param state The state to set.
	 */
	public void setState(String state)
	{
		this.state = state;
	}
	
	/**
	 * Returns the state of the block.
	 * @return The state of the block.
	 */
	public String getState()
	{
		return state;
	}
	
	/**
	 * Returns " " if the state is "EMPTY", else return either X or O.
	 */
	public String toString()
	{
		if (state == "EMPTY")
		{
			return " ";
		}
		else 
		{
			return state;
		}
	}
}
