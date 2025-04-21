package Polymorphism;

public class A1 {

	public void display(int a)
	{
		System.out.println("Integer a "+a);
	}
	public void display(int a, int b)
	{
		System.out.println("Integer a "+a+" Integer b "+b);
	}
	public void display(int a, double b)
	{
		System.out.println("Double a "+a+" Double b "+b);
	}
	public void display(double a)
	{
		System.out.println("Double a "+a );	
	}
	public static void main(String[] args) 
	{
		A1 a=new A1();
		a.display(13);
		a.display(15,16);
		a.display(16,5.2);
		a.display(15.7);
	}

}
