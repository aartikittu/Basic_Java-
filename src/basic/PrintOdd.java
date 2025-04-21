package basic;

import java.util.Scanner;

public class PrintOdd {

	public static void main(String[] args)
	{
		int m,n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number m");
		m=sc.nextInt();	
		
		System.out.println("Enter a number n");
		n=sc.nextInt();
		
		PrintOdd p= new PrintOdd();
		p.print(m, n);
				
	}
	public void print(int m, int n)
	{
		System.out.println("Odd Numbers between "+m +" and "+n+" are--->" );
		if(m%2==0)
			m++;
		for(int i=m; i<=n; i+=2)
		{
			System.out.println(i);
		}
			
	}
}
