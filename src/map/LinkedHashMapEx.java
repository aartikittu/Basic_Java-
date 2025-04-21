package map;

import java.util.LinkedHashMap;

public class LinkedHashMapEx {

	public static void main(String[] args) 
	{
		LinkedHashMap map=new LinkedHashMap();
		map.put(1, "A");
		map.put(3, "B");
		map.put(2, "C");
		map.put(4, "G");
		map.put(null, null);
		map.put(5, null);
		
		System.out.println(map);
	}

}
