package week3.day2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/*
Classroom Assignment 4: (Map) 
Two Sum  
int[] nums = {2,4,6,7,11,15}; 
int target = 8; 
Time: 30 minutes 
Hints:  
Subtract the number from target and check the diff number exist using Map!
*/
public class TwoSum_Map {
	
	/*
	 * Declare the array and set {2,4,6,7,11,15};
	 * Declare the target and set 8
	 * Declare the difference variable n set as 0
	 * For loop (int i 0 to length -1)
	 * Put the array to map, nums as key n difference as value
	 * Then target – nums, save it to difference
	 * If (map containsKey(difference)
	 * Sysout difference value exist
	*/
	public static void main(String[] args) {
		
		// declare and initialize the input array for {2,4,6,7,11,15};
		int[] nums = {2,4,6,7,11,15}; 
		
		// declare and initialize the target variable with value as 8
		int target = 8;
		
		// declare and initialize the difference variable as 0.
		int difference = 0;
		
		// Create a map of dataType Integer with Implementation class as LinkedHashMap
		Map<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
		
		// Loop through the length of the array and store it into the map.
		// Key - input array , Value as the Difference. (Target minus array value)
		for (int i =0; i<nums.length; i++)
		{
			difference = target - nums[i];
			map.put(nums[i], difference);
		}
		
		// Loop through each entry set of map
		// Check if the map containsKey of the value passed from eachEntry Set.
		// If so, print the result.
		for (Entry<Integer,Integer> eachEntry : map.entrySet()) 
		{
			if (map.containsKey(eachEntry.getValue()))
			{
				 System.out.println("Diff btwn "+eachEntry.getKey()+" and "+target+" exist ->"+eachEntry.getValue());
			}
		}

		
	}

}
