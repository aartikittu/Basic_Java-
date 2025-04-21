package basic;

import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) 
	{
		int num,temp,ams=0,a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextInt();
		temp=num;
		while(temp!=0)
		{
			a=temp%10;
			ams=a*a*a+ams;
			temp=temp/10;
		}
		System.out.println("The number you have entered is "+num);
		System.out.println("The calculation is "+ ams);
		if(num==ams)
		{
			System.out.println("Yes! this is amstrong number");
		}
  
	}

}
