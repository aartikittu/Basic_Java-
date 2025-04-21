package linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx2 
{
	public static void main(String[] args) 
	{
		LinkedList<String> list=new LinkedList(); 
		list.add("Aryan");
		list.add("Arpan");
		list.add("PRiya");
		list.add("PRiya");
		
		System.out.println(list.get(2));
		
		list.set(0, "Aarti");
		
		System.out.println(list);
		
		list.remove(1);
		
		Iterator itr=list.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		for(String s:list)
			System.out.println(s);
	}
	
}
