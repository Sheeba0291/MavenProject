package week1.day2;

import java.util.Arrays;

public class FindMinMax {
	/*
	 * Find the max and min values of the int array
	 * int[] nums = {22, 3981, -19, 82, 0, 45, 37};
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] values = {22, 3981, -19, 82, 0, 45, 37, 22, 43,82,0};
		Arrays.sort(values);
		System.out.println("The minimum value is "+values[0]);
		System.out.println("The maximum value is "+values[values.length-1]);
	}

}
