package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I love to play with Java Programs.";
		String[] split = str.split("\\s");
		System.out.println(str);
		

		for (int i = 0; i < split.length; i++) {
			String reversed = "";
			if (i % 2 != 0) {
				char[] charArray = split[i].toCharArray();
				for (int j = charArray.length - 1; j >= 0; j--) {
					reversed = reversed + charArray[j];
				}
				str = str.replaceAll(split[i], reversed);
			}
		}
		System.out.println(str);
	}
}
