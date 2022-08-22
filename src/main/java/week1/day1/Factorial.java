package week1.day1;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, factorial =1, numOfTimes =5 ;

		for (i = 1; i<= numOfTimes; i++)
		{
//		factorial = factorial*i;
			factorial*=i;
		}
		System.out.println("Factorial of "+numOfTimes+" is : "+factorial);
	}

}
