package basic;

import java.util.Scanner;

public class ArrayEx1 {

	public static void main(String[] args) 
	{
		int a[] =new int[5];
		int temp=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 numbers");
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
			
		}
		int min=a[0];
		for(int i=1;i<5;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("Minimun of all number is "+min);
	}

}
