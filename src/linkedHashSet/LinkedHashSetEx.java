package linkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetEx 
{
	public static void main(String[] args) 
	{
		LinkedHashSet set=new LinkedHashSet();
		set.add(1);
		set.add("B");
		set.add("F");
		
		set.addAll(set);
		set.add(null);
		set.add("E");
		set.add(null);
		set.add("D");
		set.add(null);
		set.add(null);
		set.add("C");
		//System.out.println(set);

		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
			}
}
