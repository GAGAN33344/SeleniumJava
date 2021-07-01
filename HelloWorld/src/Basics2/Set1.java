package Basics2;

import java.util.Iterator;
import java.util.TreeSet;

public class Set1 {

	// This class is TreeSet Class
	// TreeSet Class does not accept duplicate value but it maintains Ascending order.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Integer>TS = new TreeSet<Integer>();
		TS.add(8);
		TS.add(5);
		TS.add(7);
		TS.add(10);
		TS.add(11);
		TS.add(1);
		TS.add(7);//Console will not print duplicate value like 7
		
		System.out.println(TS);
		
		//use Iterator
		System.out.println("*****Iterator");
		Iterator<Integer> s =TS.iterator();
		while(s.hasNext())
		{
			System.out.println(s.next());
		}
		
	}

}
