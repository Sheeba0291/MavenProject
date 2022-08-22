package week1.day1;

public class Fibonacci_HomeAsgnmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 0;
		int num2 = 1;
		int sum = 0;
		
		System.out.print(num1+"  ");
		for (int i=1; i<11; i++)
		{
		System.out.print(num2+"  ");
		sum = num1 + num2;	
		num1 = num2;
		num2 = sum;
		}
		
	/*	System.out.print(num1+"  ");
		System.out.print(num2+"  ");
		
		for (int i=1; i<=11; i++)
		{
		sum = num1 + num2;
		System.out.print(sum+"  ");	
		num1 = num2;
		num2 = sum;
		} */
	}

}
