package map;

import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) 
	{
		TreeMap map=new TreeMap();
		map.put(1, "A");
		map.put(3, "B");
		map.put(2, "C");
		map.put(4, "G");
		map.put(6, null);
		map.put(5, null);
		
		System.out.println(map);
	}

}
