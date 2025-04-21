package basic;

import java.util.Scanner;

public class Larger {

	public static void main(String[] args) 
	{
		int a,b,c;
		System.out.println("Enter 1st number");
		Scanner s=new Scanner(System.in);		
		a=s.nextInt();

		System.out.println("Enter 2nd number");
		s=new Scanner(System.in);		
		b=s.nextInt();

		System.out.println("Enter 3rd number");
		s=new Scanner(System.in);		
		c=s.nextInt();
		
		
		if(a>b&&a>c)	
		{
			System.out.println(a+" is greatest");
		}
		else if(b>a&&b>c)
		{
			System.out.println(b+" is greatest");
		}
		else
		{
			System.out.println(c+" is greatest");
		}
	}
			
	}


