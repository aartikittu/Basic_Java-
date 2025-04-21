package basic;

import java.util.Scanner;

public class Calculator {

	static int a=50;
	
	static
	{
		System.out.println("Welcome!!!!!!!"); 
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("1. Addition");
		System.out.println("2. Substraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("Enter your choice");
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		
		switch(ch)
		{
			case 1:
			{
				System.out.println("Enter 1st number"); 
				int a=sc.nextInt();
				
				System.out.println("Enter 2nd number"); 
				int b=sc.nextInt();
				Calculator c=new Calculator();
				int ans=sum(a, b);
				System.out.println("Sum of both numbers: "+ans);
				break;
			}
			case 2:
			{
				System.out.println("Enter 1st number"); 
				int a=sc.nextInt();
				
				System.out.println("Enter 2nd number"); 
				int b=sc.nextInt();
			Calculator c=new Calculator();
			int ans=c.diff(a,b);
			System.out.println("Difference of both numbers: "+ans);
			break;
			}
			case 3:
			{
				System.out.println("Enter 1st number"); 
				int a=sc.nextInt();
				
				System.out.println("Enter 2nd number"); 
				int b=sc.nextInt();
			Calculator c=new Calculator();
			int ans=c.mul(a,b);
			System.out.println("Product of both numbers: "+ans);
			break;
			}
			case 4:
			{
				System.out.println("Enter 1st number"); 
				int a=sc.nextInt();
				
				System.out.println("Enter 2nd number"); 
				int b=sc.nextInt();
			Calculator c=new Calculator();
			double ans=(double)c.div(a,b);
			System.out.println("Quotient of both numbers: "+ans);
			break;
			}
			default:
			{
			System.out.println("Invalid choice!!!!"); 
			break;
			}



			
		}
		

	}
	public static int sum(int a, int b)
	{
		int ans=a+b;
		return ans;
	}
	public int diff(int a, int b)
	{
		int ans=a-b;
		return ans;
	}
	public int mul(int a, int b)
	{
		int ans=a*b;
		return ans;
	}
	public double div(int a, int b)
	{
		int ans=a/b;
		return ans;
	}

}
