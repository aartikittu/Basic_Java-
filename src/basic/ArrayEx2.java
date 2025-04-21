package basic;

import java.util.Scanner;

public class ArrayEx2 {

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
		
		for(int i=0; i<5; i++)
		{
			for(int j=i+1; j<5;j++)
			{
				if(a[j]<a[i])
				{
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		System.out.println("Arrays in ascending order is----->");
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
			
		}	
	}

}
