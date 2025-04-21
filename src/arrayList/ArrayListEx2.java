package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx2 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> arr=new ArrayList<>();
		System.out.println("Enter numbers for array list");
		
		while(sc.hasNextInt())
		{
			int number =sc.nextInt();
			arr.add(number);
					
		}
		System.out.println("Array List you have entered--->");
		System.out.println(arr);
		System.out.println("Number at index 3 is "+ arr.get(3));
		
		for(int i:arr)
		{
			System.out.println(i);
		}
	
	}

}
