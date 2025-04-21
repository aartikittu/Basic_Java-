package basic;

import java.util.Scanner;

public class StringMethod {

	public static void main(String[] args) 
	{
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		str=sc.nextLine();
		
		String str1=str.toUpperCase();
		System.out.println("String in upper case "+ str1);
	
		String str2=str.toLowerCase();
		System.out.println("String in lower case "+ str2);

		String str3=str.concat("!!!!");
		System.out.println("String after concating "+ str3);

		String str4=str.trim();
		System.out.println("String after trimming "+ str4);

		String str5=str.substring(3);
		System.out.println("String after substring "+str5);
		
		char ch=str.charAt(1);
		System.out.println("character at 1 index "+ch);

		
	
	}

}
