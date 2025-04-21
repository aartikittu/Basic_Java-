package map;

import java.util.HashMap;

public class HashMapEx 
{
	public static void main(String[] args) 
	{
		HashMap map=new HashMap();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");
		map.put(6, "F");
		map.put(5, "E");
		map.put(null, null);
		map.put(null, "H");
		map.put(null, null);
		map.put(null, null);
		map.put(null, "G");
		map.put(7, null);
		map.put(8, null);
		
		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.values());
	}
	
}
