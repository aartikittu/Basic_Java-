
package treeSet;

import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) 
	{
		TreeSet set= new TreeSet();
		//set.add(null); null not allowed in tree set
		//set.add(null);  null not allowed in tree set
		
		//set.add(1); same type of input allowEd
		set.add("C");
		set.add("B");
		set.add("E");
		set.add("E");
		set.add("D");
		System.out.println(set);
		
	}

}
