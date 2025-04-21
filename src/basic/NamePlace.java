package basic;

import java.util.Scanner;

public class NamePlace {
	
	public static void main(String[] args )
	{
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter 1st number ");
		int a= sc.nextInt();
		System.out.println("Enter 2nd number ");
		int b= sc.nextInt();
		
		
		NamePlace np=new NamePlace();

		
		System.out.println("Sum of both the numbers is " +np.sum(a, b));
	}

	/*
	 * public void print() { System.out.println("My name is Aarti");
	 * System.out.println("My hometown is Ghaziabad");
	 * System.out.println("Good Bye!!!!!!!!!!!!! ");
	 * 
	 * }
	 */
	/*
	 * public void print1() { System.out.println("My age is 27");
	 * System.out.println("My qualification is B.tech");
	 * System.out.println("My percentage is 99% ");
	 * 
	 * }
	 */
	
	public int sum(int a, int b)
	{
		int ans=a+b;
		return ans;
	}

	
	
	

}
