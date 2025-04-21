package basic;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) 
	{
		int num, temp, rev=0,a;
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
		System.out.println("The reverse of the number is "+rev);
		if(num==rev)
		{
			System.out.println("Yes! This number is palindrome");
		}
		else
		{
			System.out.println("No, this number is not palindrome");
		}
			
		
	}

}
