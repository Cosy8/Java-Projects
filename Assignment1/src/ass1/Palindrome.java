/*Author: Blair Cosgrove
 * ID: 104992533
 * Date: 10/29/2019
 */
package ass1;

import java.lang.*;
import java.util.*;
import java.io.*;

public class Palindrome {
	
	//	Default Constructor.
	public Palindrome()
	{
		
	}
	
	/**
	 * Checks if a given String is a palindrome.
	 * @param l1 A String.
	 * @return True if it is a palindrome and false if not.
	 */
	public boolean isPalindrome(String l1)
	{
		String reverse = "";
		
		//	Loop to copy l1 into reverse backwards.
		for (int i = 0; i < l1.length(); i++)
		{
			reverse += l1.charAt(l1.length() - i - 1);
		}
		
		//	Compares l1 and reverse to determine if they are equal.
		if (l1.equals(reverse))
			return true;
		else
			return false;
	}
	
	/**
	 * Checks if a given string is a mirrored String.
	 * @param l2 A String.
	 * @return True if it is a mirrored string.
	 */
	public boolean isMirrored(String l2)
	{
		//	Loop to compare characters starting with the first and 
		//	last and working it's way in.
		for (int i = 0; i <= l2.length()/2; i++)
		{
			//	Switch case to determine if the char is a certain 
			//	subset of characters.
			switch (l2.charAt(i))
			{
				case 'A': 
					if (l2.charAt(l2.length() - 1 - i) == 'A')
						break;
					else
						return false;
				case 'E': 
					if (l2.charAt(l2.length() - 1 - i) == '3')
						break;
					else
						return false;
				case 'H': 
					if (l2.charAt(l2.length() - 1 - i) == 'H')
						break;
					else
						return false;
				case 'I': 
					if (l2.charAt(l2.length() - 1 - i) == 'I')
						break;
					else
						return false;
				case 'J': 
					if (l2.charAt(l2.length() - 1 - i) == 'L')
						break;
					else
						return false;
				case 'L': 
					if (l2.charAt(l2.length() - 1 - i) == 'J')
						break;
					else
						return false;
				case 'M': 
					if (l2.charAt(l2.length() - 1 - i) == 'M')
						break;
					else
						return false;
				case 'O': 
					if (l2.charAt(l2.length() - 1 - i) == 'O')
						break;
					else
						return false;
				case 'S': 
					if (l2.charAt(l2.length() - 1 - i) == '2')
						break;
					else
						return false;
				case 'T': 
					if (l2.charAt(l2.length() - 1 - i) == 'T')
						break;
					else
						return false;
				case 'U': 
					if (l2.charAt(l2.length() - 1 - i) == 'U')
						break;
					else
						return false;
				case 'V': 
					if (l2.charAt(l2.length() - 1 - i) == 'V')
						break;
					else
						return false;
				case 'W': 
					if (l2.charAt(l2.length() - 1 - i) == 'W')
						break;
					else
						return false;
				case 'X': 
					if (l2.charAt(l2.length() - 1 - i) == 'X')
						break;
					else
						return false;
				case 'Y': 
					if (l2.charAt(l2.length() - 1 - i) == 'Y')
						break;
					else
						return false;
				case 'Z': 
					if (l2.charAt(l2.length() - 1 - i) == '5')
						break;
					else
						return false;
				case '1': 
					if (l2.charAt(l2.length() - 1 - i) == '1')
						break;
					else
						return false;
				case '2': 
					if (l2.charAt(l2.length() - 1 - i) == 'S')
						break;
					else
						return false;
				case '3': 
					if (l2.charAt(l2.length() - 1 - i) == 'E')
						break;
					else
						return false;
				case '5': 
					if (l2.charAt(l2.length() - 1 - i) == 'Z')
						break;
					else
						return false;
				case '8': 
					if (l2.charAt(l2.length() - 1 - i) == '8')
						break;
					else
						return false;
				default:
					return false;	//	if not those characters or if corresponding positions do not match.
			}
		}
		
		return true;
	}
	
	/**
	 * Checks if a given String is a mirrored palindrome
	 * @param l3 A String.
	 * @return True if it is both a palindrome and mirrored String, else false.
	 */
	public boolean isMirrorPalindrome(String l3)
	{
		if (isPalindrome(l3) && isMirrored(l3))
			return true;
		else
			return false;
	}
}
