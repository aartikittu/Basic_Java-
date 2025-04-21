package Polymorphism;

public class Shadowing {

	public static void main(String[] args)
	{
		Parent2 p=new Parent2();
		p.m1(); //parent
		
		Child2 c=new Child2();
		c.m1(); //child
		
		Parent2 p1=c;
		p1.m1(); //child
	}

}
