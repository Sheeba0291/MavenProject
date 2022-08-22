package week3.day2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/*
Single Number (Print only single occurance numbers) 
int[] nums = {1,2,1,3,2,5}; --> 3,5 !
 Time: 15 minutes 
 Hints:  
 Use Map and find each occurance.
 */
public class SingleNumber_Map {

	public static void main(String[] args) {

		int[] nums = {1,2,1,3,2,5};
		
		Map<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
		
		/*
		for (int i =0; i<nums.length; i++)
		{
			if(map.containsKey(nums[i]))
			{
				map.put(nums[i], map.get(nums[i]) +1);
			}
			else
			{
				map.put(nums[i], 1);
			}
		}
		*/
		
		for (int i =0; i<nums.length; i++)
		{
		    map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
		}
		
		System.out.println(map);

		for (Entry<Integer, Integer> entry : map.entrySet() ) {
			if(entry.getValue() ==1)
			{
				System.out.println("Numbers occured once : "+entry.getKey());
			}
		}
		
	}

}
