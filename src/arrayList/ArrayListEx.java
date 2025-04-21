package arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListEx {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> arr=new ArrayList<>();
		System.out.println("Enter numbers to add to array list");
		
		while(sc.hasNextInt())
		{
			int number=sc.nextInt();
			arr.add(number);
		}
		System.out.println("Array list you have enetered is--->");
		System.out.println(arr);
		
	}
	
	

}
