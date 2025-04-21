package Polymorphism;

public class DriverClass {

	public static void main(String[] args) 
	{
		A a=new A();
		a.display();
		
		B b=new B();
		b.display();
		
		A a1=new B();//upcasting
		a1.display();
		
				
				/*
				 * B b1=(B)a1; b1.display();
				 * 
				 * b1.printB();
				 */
	}

}
