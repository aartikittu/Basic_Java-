package basic;

import java.util.Scanner;

public class StringEx {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		String str,str1;
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		
		System.out.println("Enter another string");
		str1=sc.next();
		
		if(str.equals(str1))
		{
			System.out.println("The following strings are same");
		}
		else
		{
			System.out.println("The following strings are not same");
		}
			
	}

}
