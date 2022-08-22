package week3.day2.assignments;

import java.util.Map;
import java.util.Map.Entry;
import java.util.LinkedHashMap;

// int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};

// get the length of the array
// declare an int variable named count

// iterate from 0 to the array length-1 (outer loop starts here)

// assign 0 to count 

// iterate from i to the length of the array by adding 1 to it (inner loop starts here)

// compare both the loop variables & check they're equal

// increase the count if both the arrays are equal

// Out of the inner loop, check and print the first array variable if count is more than 0

public class PrintDuplicatesInArray {

	public static void main(String[] args) {

		// declare and initialize the input array for
		// {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };

		// Create a map of dataType Integer with Implementation class as LinkedHashMap
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();

		// Loop through the arr length and store it into the map.
		// Key - input array , Value - previous value +1.
		// Using the Map method - getOrDefault ( no if condition required)
		for (int i = 0; i < arr.length; i++) 
		{
				map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}
		
		// Print the values with duplicated count.
		System.out.println("Input values with duplicated count : "+map);

		System.out.print("Duplicated values are : ");
		
		// Loop through each EntrySet of Map and print only the duplicated values. (value>1)
		for (Entry<Integer,Integer> eachEntry : map.entrySet())
		{
			if (eachEntry.getValue() >1)
			{
				System.out.print(eachEntry.getKey()+"   ");
			}
		}
	}

}
