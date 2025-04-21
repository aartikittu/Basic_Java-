package basic;

import java.util.Scanner;

public class LoopEx {
	
	public static void main(String[] args)
	{
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		str=sc.nextLine();
		int count=0;
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)==' ')
			{
				count++;
			}
		}
		count=count+1;
			System.out.println("There are "+count+" number of words in this string");
	}	
}
