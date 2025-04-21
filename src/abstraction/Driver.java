package abstraction;

import java.util.Scanner;

public class Driver extends AbstractClass{

	public static void main(String[] args) 
	{
		Driver d=new Driver();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int a=sc.nextInt();
		System.out.println("Enter 2nd number: ");
		int b=sc.nextInt();
		int ans=d.Add(a, b);
		System.out.println("Sum of both the numbers are "+ ans);
	}

	@Override
	public int Add(int a, int b) 
	{
		int ans=a+b;
		return ans;
	}

}
