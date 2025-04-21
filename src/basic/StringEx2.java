package basic;

public class StringEx2 {

	public static void main(String[] args) 
	{
		String str1 ="Welcome";
		String str2 ="Welcome";
		String str3=str1;
		String str4=new String("Welcome");
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		
		str1=str1+"a";
		System.out.println(str1.hashCode());
		
		str4=str4+"a";
		System.out.println(str4.hashCode());
		
		if(str1==str2)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
			
		}
			
	}

}
