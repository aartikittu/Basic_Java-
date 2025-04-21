package hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx 
{
	public static void main(String[] args) 
	{
		HashSet set=new HashSet();
		set.add(1);
		set.add("D");
		set.add("D");
		set.add("C");
		set.add("E");
		set.add("F");
		set.add("B");
		set.add(null);
		set.add(null);
		set.add(null);
		set.add(null);
		
		System.out.println(set);
		
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

		
		/*
		 * for(String s:set ) { System.out.println(s); }
		 */
	}
}
