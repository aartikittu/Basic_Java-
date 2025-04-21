package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx3 {

	public static void main(String[] args) 
	{
		ArrayList list=new ArrayList();
		list.add("Priya");
		list.add("Aarti");
		list.add("Madhu");
		list.add("Madhu");
		list.add(20);
		list.add(50);
		list.add(78);
		
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
