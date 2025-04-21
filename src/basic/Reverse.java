package basic;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) 
	{
		String str,str1="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		str=sc.next();
		
		System.out.println("The string you have entered is "+str);
		
		for(int i=str.length()-1; i>=0; i--)
		{	
			str1=str1+str.charAt(i);
		}
		
		System.out.println("The reverse of string is "+str1);
			
	}

}
