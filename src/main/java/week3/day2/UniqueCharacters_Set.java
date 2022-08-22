package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

/*
 * Classroom Assignment 2: (Set)
Print only unique characters in the given string
String companyName = "google" --> "gole"
Time: 15 minutes
Hints: 
Use Set with add method.
4.40 + 15 + 20 = 5.15 !

 */
public class UniqueCharacters_Set {
	
	public static void main(String[] args) {
		String companyName = "google";

		char[] cmpName = companyName.toCharArray();

		Set<Character> uniqueCharacter = new LinkedHashSet<Character>();

		for( int i = 0;i<cmpName.length;i++)
		{
			uniqueCharacter.add(cmpName[i]);
		}

		System.out.println(uniqueCharacter);
		
		for (Character character : uniqueCharacter) {
			System.out.print(character);
		}
	}

	
}

