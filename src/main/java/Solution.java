
public class Solution {
	
	public static void main (String[] args) {
		String text = "Virtus (13660)";
		
		String txt = text.replaceAll("[a-zA-Z()\\s]", "");
		
	//	txt = txt.replaceAll("\\s","");
		
		System.out.println(txt);
	}
}