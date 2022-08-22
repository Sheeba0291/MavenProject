package week3.day2.assignments;

import java.util.Set;
import java.util.LinkedHashSet;

/*
 * Pseudo code 
 
 * a) Use the declared String text as input
	String text = "We learn java basics as part of java sessions in java week1";		
 * b) Initialize an integer variable as count	  
 * c) Split the String into array and iterate over it 
 * d) Initialize another loop to check whether the word is there in the array
 * e) if it is available then increase and count by 1. 
 * f) if the count > 1 then replace the word as "" 
 
 * g) Displaying the String without duplicate words	
 */

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		// declare the string and store the input.
		String text = "We learn java basics as part of java sessions in java week1";
		
		// convert the string to character array
		char[] charArray = text.toCharArray();
		
		// Declare a set of datatype Character
		Set<Character> finalOutput = new LinkedHashSet<Character>();
		
		// Loop through the array of characters and store the character in a set.
		// It will automatically removes the duplicates.
		for (int i =0; i<charArray.length; i++)
		{
			finalOutput.add(charArray[i]);
		}
		
		// Using foreach, print the Set after removing the duplicates..
		for (Character character : finalOutput) {
			System.out.print(character);
		}

	}

}
