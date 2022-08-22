package week1.day2;

public class Palindrome {
	
	//Find if the given string is a Palindrome

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Madam";
	//	boolean flag = true;
		String reversed = "";
		
		char[] charArray = str.toCharArray();
		
		for (int i = charArray.length-1; i>=0; i--)
		{
			reversed = reversed + charArray[i];
		}
		
		if (str.equalsIgnoreCase(reversed))
			System.out.println(str+" is a Palindrome");
		else
			System.out.println(str+" is NOT a Palindrome");
		
		/*
		 * for (int i = 0; i <= length-1; i++) { if (charArray[i] !=
		 * charArray[length-i-1]) { System.out.println(str + " is NOT a Palindrome");
		 * flag = false; break; }
		 * 
		 * } if (flag) System.out.println(str + " is a Palindrome");
		 */
	}

}
