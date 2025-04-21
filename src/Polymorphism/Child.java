package Polymorphism;

public class Child extends Parent
{
	public void display()
	{
		System.out.println("This is class child display method");
	}
	public void printChild()
	{
		System.out.println("This is class child print method");
	}
	public static void main(String[] args) 
	{
		Parent p=new Child();
		p.display();
		p.printParent();
		
		Child c=(Child)p;
		c.display();
		c.printParent();
		c.printChild();
	}
}

