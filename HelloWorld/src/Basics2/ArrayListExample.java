package Basics2;

import java.util.ArrayList;

/* All the classes which implement list interface contain duplicate values
 and this is the dynamic size means we can add, delete and change the values any time but in array we can't do it.
 */
/*ArrayList, LinkedList and Vector classes implement the List Interface and all three
  classes contain duplicate values.*/
/* if we don't mention, which type of value we are going to store in ArrayList, then 
 we can store any type of value like integer,string, boolean value and single character
 example ArrayList a = new ArrayList();
 */
public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> a = new ArrayList<String>();
		
		a.add("Harpal");
		a.add("Balwinder");
		a.add(2, "Gagan");// add value at 2nd index
		a.add("Parvinder");
		a.add(4,"Gagan");
		System.out.println(a);
		
		a.remove("Gagan");// remove value by name, this will remove the gagan string
		// which present in first time.
	   System.out.println(a);
	   
		a.remove(1);// remove value by index
		System.out.println(a);
		
		System.out.println(a.contains("java"));//  check the value java string is present 
		//in this arraylist or not.
		
		System.out.println(a.get(1));//print the value which in present in index 1
		
		System.out.println(a.indexOf("Gagan"));// check the index of Gagan String
		
		System.out.println(a.isEmpty());// check the list is empty or not
		
		System.out.println(a.size());// check the size
		
		
	}

}
