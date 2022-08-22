package week3.day2.assignments;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/*
 * Input array numbers, each occurances
 * 
 * input: {2,3,5,6,3,2,1,4,2,1,6,-1};
 * output: 2 -> 3 , 3 -> 2, 4 -> 1 
 * 
 * Order: Ascending Order
 * 
 */
/*
 * Psuedcode:
 * 
 * 1) Create Map -> TreeMap
 * 2) For loop -> each number -> add to the map
 * 3) If it is exist -> update it with + 1
 * 	  Else -> new entry with 1 as value
 * 
 */

public class FindNumbersOccurances {

	public static void main(String[] args) {

		// declare and initialize the input array for {2,3,5,6,3,2,1,4,2,1,6,-1};
		int[] input = {2,3,5,6,3,2,1,4,2,1,6,-1};

		// Create a map of dataType Integer with Implementation class as TreeMap
		Map<Integer,Integer> map = new TreeMap<Integer,Integer>();

		// Loop through the length of the array and store it into the map.
		// Key - input array , Value - count of occurances.
		// Using if else, check if the key already exists.
		// If exists, then previous value + 1 else store it with value 1.
		for (int i =0; i<input.length; i++)
		{
			if (map.containsKey(input[i]))
			{
				map.put(input[i],map.get(input[i])+1);
			}
			else
			{
				map.put(input[i], 1);
			}
		}

		// Loop through each EntrySet of Map and print values in the above asked output format.
		for(Entry<Integer,Integer> eachEntry : map.entrySet())
		{
			System.out.print(eachEntry.getKey()+" -> "+eachEntry.getValue()+",   ");
		}
	}

}
