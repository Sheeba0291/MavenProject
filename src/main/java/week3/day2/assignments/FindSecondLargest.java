package week3.day2.assignments;

import java.util.ArrayList;
import java.util.List;

//  Here is the input
//	int[] data = {3,2,11,4,6,7};	
/*
		 Pseudo Code:
		 1) Arrange the array in ascending order
		 2) Pick the 2nd element from the last and print it
 */


public class FindSecondLargest {

	public static void main(String[] args) {
		// Declare An array for {3,2,11,4,6,7};	
		int[] inputArray = {3,2,11,4,6,7};

		/*
		 * Incase the input array had duplicates, then first store it in a Set
		 * Then copy it to the list and retrieve the second largest value.
		 * Copying from List to Set is not a good idea 
		 * as Set doesnt have get() method to retrieve the value. 
		*/
		
		// Declare a List of datatype Integer to copy the inputArray
		List<Integer> input = new ArrayList<Integer>();

		// Loop through the array and store it into the list.
		for (int i=0; i<inputArray.length; i++)
		{
			input.add(inputArray[i]);
		}

		// Print all the values
		System.out.println(input);

		// Print the second largest value
		System.out.println("Second Largest Number is : "+input.get(input.size()-1));
	}

}
