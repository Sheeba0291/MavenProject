package week1.day1;

public class FindCharCount {

	/*
	 * Find the count of given character in a String
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "cognizant";
		char x = 'n';
		int count = 0;
		char[] charArray = str.toCharArray();

		for (int i = 0; i < str.length(); i++) {
			if (charArray[i] == x)
				count++;
		}

		System.out.println(count);	
		System.out.println("Last character is "+str.charAt(8));
	}

}
