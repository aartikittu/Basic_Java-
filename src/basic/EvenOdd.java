package basic;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) 
	{
		int a;
		System.out.println("Enter a digit");
		Scanner s=new Scanner(System.in);		
		a=s.nextInt();
		if(a%2==0)
		{
			System.out.println("This is Even number");
		}
		else
		{
			System.out.println("This is Odd number");
		}
			
	}

}
