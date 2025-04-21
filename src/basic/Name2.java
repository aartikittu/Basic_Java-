package basic;

import java.util.Scanner;

public class Name2 
{
	public static void main(String[] args) 
	{
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		str=sc.nextLine();
		
		System.out.println("The name you have entered is "+str);
	}

}
