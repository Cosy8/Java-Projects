/* Author: Blair Cosgrove
 * ID: 104992533		
 * Date: 10/29/2019
 */
package ass1;

import java.util.*;
import java.io.*;
import java.lang.*;

public class PalindromeTester {

	public static void main(String[] args) {
		String line;
		Scanner sc = new Scanner(System.in);
		
		//	Loop for processing Strings until no more.
		while(sc.hasNext())
		{
			line = sc.next();
			process(line.toUpperCase());	//	Processes only upper case Strings.
		}
	}
	
	/**
	 * Processes a string to determine if it 
	 * is a palindrome, mirrored string or mirrored palindrome.
	 * @param line A String to be processed.
	 */
	public static void process(String line)
	{
		Palindrome p1 = new Palindrome();	//	Instantiates a new Palindrome.
		
		//	Calls functions from p1 to determine what it is.
		if (p1.isMirrorPalindrome(line))
		{
			System.out.println(line + " -- " + "is a mirrored palindrome.");
		}
		else if (p1.isMirrored(line))
		{
			System.out.println(line + " -- " + "is a mirrored string.");
		}
		else if (p1.isPalindrome(line))
		{
			System.out.println(line + " -- " + "is a regular palindrome.");
		}
		else
		{
			System.out.println(line + " -- " + "is not a palindrome.");
		}
	}
}
