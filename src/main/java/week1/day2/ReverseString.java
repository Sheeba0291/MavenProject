package week1.day2;

/*
 * Reverse the given string n print
 * 
*/

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Selenium";
		char[] charArray= str.toCharArray();
		
		  for (int i = charArray.length-1; i>=0;i--) 
		  { 
			  System.out.print(charArray[i]);
		  }
		 

	}

}
