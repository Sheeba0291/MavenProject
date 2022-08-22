package week4.day2;

public class SheebaConstructor {
	{
		System.out.println("I am inside Block");
	}

	static
	{
		System.out.println("I am Static");
	}
	
	public void newMethod()
	{
		System.out.println("I am inside Method");
	}
	
	public SheebaConstructor()
	{
		System.out.println("I am inside Constructor");
	}
	public static void main(String[] args) 
	{
		System.out.println("I am inside Main method");
		SheebaConstructor she = new SheebaConstructor();
		she.newMethod();
	}

}
