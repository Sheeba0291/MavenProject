package week1.day2;

public class ChangeOddIndexToUpperCase {
	
	// Change the Odd Index letters to upper case

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "testleaf";
		char[] charArray = str.toCharArray();

		/*
		 * for (int i = 0; i < charArray.length; i++) 
		 * { if (i % 2 != 0)
		 * charArray[i] = (char) (charArray[i] - 32); } 
		 * System.out.println(charArray);
		 */
		
		for (int i=0; i< charArray.length; i++)
		{
			if (i%2!=0) {
				charArray[i] = Character.toUpperCase(charArray[i]);
			}
		}
		
		System.out.print(charArray);
	}

}
