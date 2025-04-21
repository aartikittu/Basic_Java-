package abstraction;

public class B extends A implements InterfaceDemo
{ 
	public void send()
	{
		System.out.println("Send method ovveriden by B");
	}
	public void display()
	{
		System.out.println("Display method");
	}
	public static void main(String[] args) 
	{
		A a=new B();
		a.send();
		B b=(B)a;
		b.display();
		InterfaceDemo i=new B();
		System.out.println(B.a);
		
	}

}
