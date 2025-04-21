package linkedList;

import java.util.LinkedList;

public class LinkedListEx 
{
	public static void main(String[] args) 
	{
		LinkedList list=new LinkedList(); 
		list.add("Aryan");
		list.add("Arpan");
		list.add("PRiya");
		list.add("PRiya");
		list.add(null);
		
		System.out.println("Linked List Values are as follow---:");
		System.out.println(list);
		
		list.set(0, "Aarti");
		
		list.remove(0);
		
		System.out.println(list);
		
		System.out.println(list.get(1));
	}
}
