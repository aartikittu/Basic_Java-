package basic;

public class ExceptionHandling 
{
	public static void main(String[] args) 
	{
		try
		{
			ExceptionHandling e=new ExceptionHandling();
			e.test();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception HAndled!!!!!!");
		}
	}
	public void test()
	{
		int a=10/0;
	}
}
