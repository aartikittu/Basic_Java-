package map;

import java.util.Hashtable;

public class HashTableEx {

	public static void main(String[] args) 
	{
		Hashtable table=new Hashtable();
		table.put(1, "A");
		table.put(3, "B");
		table.put(4, "G");
		table.put(2, "C");
		
		table.put(5, "I");
		table.put(6, "H");
		
		
		System.out.println(table);
	}

}
