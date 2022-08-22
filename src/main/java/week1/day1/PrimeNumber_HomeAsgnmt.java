package week1.day1;

public class PrimeNumber_HomeAsgnmt{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 27;
		int flag =0;

		for (int i=2; i<input; i++)
		{
			if(input%i==0)
			{
				flag =1;
				break;
			}
		}
		
		if(flag ==1)
			System.out.println(input+ " is NOT a Prime Number");
		else
			System.out.println(input+ " is a Prime Number");
	}

}
