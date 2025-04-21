package basic;

import java.util.Scanner;

public class ToStringDemo 
{
	public static void main(String[] args) 
	{
		int m;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		m=sc.nextInt();
		ToStringDemo t=new ToStringDemo();
		t.print(m);
		
	}
	public void print(int m)
	{
		System.out.println("Natural numbers till "+m+" "+" are----->");
		for(int i=1;i<=m;i++)
		{
			System.out.println(i);
		}
			
	}
	
	

}
