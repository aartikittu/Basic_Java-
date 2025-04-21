package basic;

public class StaticEx {

	static int i=10;
	static
	{
		System.out.println("HELLLLOOOOOOO!!!!!!!!!");
		StaticEx2.display();
		System.out.println("i= "+i);
		
	}
	
	public static void main(String[] args)
	{
		StaticEx s=new StaticEx(); 
		int j=10;
		String c= StaticEx2.c;
		System.out.println(c);
		StaticEx2.display();
		StaticEx3.display();
		System.out.println("i= "+i);
	}

}
