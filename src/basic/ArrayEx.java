package basic;

import java.util.Scanner;

public class ArrayEx {

	public static void main(String[] args) 
	{
		
		int arr[]= new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 10 numbers");
		for(int i=0; i<10;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Numbers in reverse");
		for(int i=9; i>0;i--)
		{
			System.out.println(arr[i]);
		}
			

	}

}
