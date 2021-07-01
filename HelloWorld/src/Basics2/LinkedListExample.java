package Basics2;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	/* LinkedList have nodes, which connect to each other,each node divide into two parts- data and next,
	 first part store the data and second part-next means it store the reference 
	 of next node element
	 */
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> LL = new LinkedList<String>();
		
		// first operation is add the values
		LL.add("Harpal");
		LL.add("Balwinder");
		LL.add("Gagan");
		LL.add("Parvinder");
		
		// for printing
		System.out.println("Contents of LinkedList are " + LL);
		
		//add element at first place
		LL.addFirst("Dada Ji");
		
		//add element at Last place
		LL.addLast("Baby");
		
		System.out.println("Contents of LinkedList are " + LL);
		
		System.out.println(LL.get(0));// retrieve the first value
		
		
		LL.set(0, "Bapu Ji");// set the value at first index
		System.out.println("Contents of LinkedList are " + LL);
		
		LL.removeFirst();//Remove the First value
		LL.removeLast();//Remove the Last value
		
		System.out.println("Contents of LinkedList are " + LL);
		
		
		
		// How to print all the values of LinkedList.
		
		//1. for loop
		System.out.println("***Using For Loop*");
		for(int i=0; i<LL.size(); i++)
		{
			System.out.println(LL.get(i));
		}
		 
		//2. Advanced for loop
		System.out.println("***Using Advanced for loop*");
		for(String str: LL)
		{
			System.out.println(str);	
		}
		
		//3. Using Iterator
		System.out.println("***Using Iterator*");
		Iterator<String> it = LL.iterator();
		while(it.hasNext())
		{
			Object o = it.next();
			System.out.println(o);
		}
		
		//4.While loop
		int n=0;
		System.out.println("***Using While Loop*");
		while(n<LL.size())
		{
			System.out.println(LL.get(n));
			n++;
		}
		
		
		
		
		
		
		
		
	}

}
