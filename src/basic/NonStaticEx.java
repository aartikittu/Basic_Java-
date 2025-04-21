package basic;

public class NonStaticEx 
{
	static int b=10;
	static
	{
		System.out.println("This is static block");
	}

	int a=20;
	
	{
		System.out.println("This is non static block");
	}
	
	public static void main(String[] args) 
	{
		NonStaticEx n=new NonStaticEx();
		
		System.out.println("static b= "+NonStaticEx.b);
		System.out.println("Non static a="+n.a);
	}

}
