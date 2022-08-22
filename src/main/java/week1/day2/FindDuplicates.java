package week1.day2;

import java.util.Arrays;

/*
 * Find the duplicate values in the given array
 */

public class FindDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * int[] values = {22, 3981, -19, 82, 0, 45, 37, 22, 43,0,82,0};
		 * Arrays.sort(values);
		 * 
		 * for (int i=0; i<=values.length-1; i++) { if(values[i]==values[i+1])
		 * System.out.println(values[i]+" is Duplicated"); }
		 */

		int[] values = { 22, 3981, -19, 82, 0, 45, 0, 37, 22, 43, 82, 0 };
		Arrays.sort(values);

		for (int i = 0; i <= values.length - 1; i++) {
			for (int j = i+1; j <= values.length - 1; j++) {
				if (values[i] == values[j])
					System.out.println(values[i] + " is Duplicated");
			}
		}

	}

}
