package week3.day2.assignments;

import java.util.Map;
import java.util.TreeMap;

/*
 * Pseudo Code

 * a) Declare An array for {3,2,11,4,6,7};	 
 * b) Declare another array for {1,2,8,4,9,7};
 * c) Declare for loop iterator from 0 to array length
 * d) Declare a nested for another array from 0 to array length
 * e) Compare Both the arrays using a condition statement

 *  f) Print the first array (should match item in both arrays)
 */

public class FindIntersection {

	public static void main(String[] args) {

		// Declare An array for {3,2,11,4,6,7};	
		int[] inputArray1 = {3,2,11,4,6,7};

		// Declare another array for {1,2,8,4,9,7};
		int inputArray2[] = {1,2,8,4,9,7};

		// Create a map of dataType Integer with Implementation class as HashMap
		Map<Integer,Integer> map = new TreeMap<Integer,Integer>();

		// Loop through the inputArray1 and store it in the map.
		// Key as inputArray1 and Value as occurances
		for (int i =0; i< inputArray1.length; i++)
		{
			map.put(inputArray1[i],map.getOrDefault(inputArray1[i], 0)+1);
		}

		// Loop through the inputArray2 and check if map contains the key as inputArray2.
		// If exists, then print inputArray2.
		for (int i =0; i< inputArray2.length; i++)
		{
			if(map.containsKey(inputArray2[i]))
			{
				System.out.print(inputArray2[i]+"  ");
			}
		}

	}

}
