package Polymorphism;

public class Driver {

	public static void main(String[] args) 
	{
		//overriding
		Parent1 p=new Child1();
		p.test();	//child	
	
		Child1 c=new Child1();
		c.test();	//child
		
		//method shadowing
		Parent1 p1=c;
		p1.test(); //child
	}

}
