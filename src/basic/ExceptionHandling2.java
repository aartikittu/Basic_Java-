package basic;

public class ExceptionHandling2 {

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
			finally
			{
				System.out.println("This is finally block!!!!!!!!");
			}
		}
		public void test() throws ArithmeticException
		{
			int a=10/0;
		}


}
