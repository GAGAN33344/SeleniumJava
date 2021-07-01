package Basics2;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	/* HashSet,TreeSet LinkedHashSet classes implements Set Interface.
	  Does not accept duplicate values.
	  There is no guarantee elements stored in sequential order....its Random order.
	  Can't be accessed using Index. 
	  LinkedHashSet same as HashSet but it maintains insertion order.
	  TreeSet Maintain the Ascending order.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> HS = new HashSet<String>();
		
		HS.add("Balwinder");
		HS.add("Santosh");
		HS.add("Arminder");
		HS.add("Suman");
		HS.add("Arminder");// Console will not print this value because its duplicate value
		
		System.out.println(HS);
		System.out.println(HS.size());
		System.out.println(HS.remove("Arminder"));
		System.out.println(HS.isEmpty());
		System.out.println(HS);
		
		// print the values using iterator
		System.out.println("***Using Iterator");
		Iterator<String> t=HS.iterator();// HS.iterator method  start and iterate through
		//each and every object which is present in set
		
		while(t.hasNext())// with the assistance of hasNext() method, we can go to next 
			// index value
		{
			System.out.println(t.next());// with the assistance of next() method, we can  
			// check the value which is present in index or not.
		}
		
		
		
	}

}
