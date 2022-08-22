package week1.day2;

public class RemoveDuplicateCharacters {

	public static void main(String[] args) {

		String str = "Selenium";
		char[] charArray = str.toCharArray();
		
		for (int i=0; i<charArray.length; i++)
		{
			for (int j=i+1; j<charArray.length; j++)
			{
				if (charArray[i]==charArray[j])
				{
					charArray[j] = ' ';
				}
			}
			System.out.print(charArray[i]);
		}
		
	}

}
