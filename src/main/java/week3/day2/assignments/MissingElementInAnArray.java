package week3.day2.assignments;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

//Here is the input
// int[] arr = {1,2,3,4,7,6,8};

// Sort the array	

// loop through the array (start i from arr[0] till the length of the array)

// check if the iterator variable is not equal to the array values respectively

// print the number

// once printed break the iteration

public class MissingElementInAnArray {

	public static void main(String[] args) {

		// declare and initialize the input array for {3,2,11,4,6,7};	
		int[] arr = {1,2,3,4,7,6,8};

		// Sort the input array
		Arrays.sort(arr);

		// Declare a Map of datatype Integer, Integer with key as numbers and value as input array.
		Map<Integer,Integer> inputMap = new TreeMap<Integer,Integer>();

		// Loop from 0 to array.length-1 to store the values in the Map.
		for (int i=0;i<arr.length;i++)
		{	
			inputMap.put(i+1, arr[i]);
		}

		// Using for each, iterate through every EntrySet 
		// Compare the key and value, if it doesnt match, print the key and break the loop.
		for (Entry<Integer, Integer> entry : inputMap.entrySet()) {
			if(!(entry.getKey()== entry.getValue()))
			{
				System.out.println("Missing Element in an Array is : "+entry.getKey());
				break;
			}
		}
	}

}
