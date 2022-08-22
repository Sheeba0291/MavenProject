package week1.day2;

public class FindIntersection {

	// Find the intersecting letter of a String
	// Find the intersecting point for two strings.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String str = "Madam"; char[] charArray = str.toCharArray(); int midPoint =
		 * charArray.length/2;
		 * 
		 * System.out.println("Intersecting letter for "+str+
		 * " is "+charArray[midPoint]);
		 */

		String str1 = "TestLeaf";
		String str2 = "LeafTaps";
		char ch = ' ';

		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();

		for (int i = 0; i < charArray1.length; i++) {

			if (charArray1[i] == charArray2[i]) {
				ch = charArray2[i];
				break;
			}

		}
		System.out.println("The Intersecting letter for the strings " + str1 + " and " + str2 + " is " + ch);
	}
}
