package basic;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) 
	{
		int num, rev=0, temp,a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextInt();
		temp=num;
		while(temp!=0)
		{
			a=temp%10;
			rev=rev*10+a;
			temp=temp/10;
			
		}
		System.out.println("The number you have entered is "+num);
		System.out.println("Reverse of this number is "+ rev);
	}

}
