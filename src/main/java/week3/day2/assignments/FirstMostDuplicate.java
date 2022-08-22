package week3.day2.assignments;

import java.util.Map;
import java.util.TreeMap;

/* input: abbaba
 * output: b
 * 
 * 
 */

/*
 * Psuedocode
 * 
 * 1) Map -> HashMap 
 * 2) String -> ch[] -> Get all the character -> occurance
 * 3) Keep comparing the occurance with other values -> max value -> character
 * 
 */


public class FirstMostDuplicate {

	public static void main(String[] args) {

		// Declare the string and initialize it with "abbaba"
		String input = "abbaba";

		// Convert the string to a Character array.
		char[] charArray = input.toCharArray();

		// Create a map of dataType Integer with Implementation class as HashMap
		Map<Character,Integer> map = new TreeMap<Character,Integer>();

		/*
		 * Loop through the length of the array
		 * Store the characters in Key, count of characters in Value.
		 * When the count of character exceeds 1 (i.e first duplicate)
		 * Then print the character and break the loop. 
		*/
		for (int i =0; i<charArray.length; i++)
		{
			if(map.containsKey(charArray[i]))
			{
				map.put(charArray[i], map.get(charArray[i])+1);
			}
			else
			{
				map.put(charArray[i], 1);
			}
			
			if (map.get(charArray[i])>1)
			{
				System.out.println(charArray[i]);
				break;
			}
			
		}
		
	}

}
