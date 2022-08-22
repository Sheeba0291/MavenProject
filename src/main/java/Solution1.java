public class Solution1 {
	public static int maxNumber(int num) {
		int maxNum = 0;
  		int remainder =0;
		while (num!=0)
        {
          remainder = num%10;
          maxNum = maxNum + remainder;
          num = num/10;
        }
		
return maxNum;
	}

	public static void main(String[] args) {
		
		int fact = maxNumber(1024);
		
		System.out.println(fact);
	}
}