package Basics2;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample2 {

	/* how we can store the value of UserDefined class in ArrayList.
	 
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayListDefinedClass AC = new ArrayListDefinedClass("Harpal",59,"Police");
		ArrayListDefinedClass AC1= new ArrayListDefinedClass("Gagan",29,"Electrical");
		ArrayListDefinedClass AC2= new ArrayListDefinedClass("Parvinder",30,"Medical");
		
		ArrayList<ArrayListDefinedClass> al = new ArrayList<ArrayListDefinedClass>();
		// i want to pass the ArrayListDefinedClass objects,so I will mention here.
		// means in this ArrayList, i will store ArrayDefinedClass Object store in al object. 
		
		al.add(AC);// here i will store AC object values in ArrayList al object.
		al.add(AC1);// here i will store AC1 object values in ArrayList al object.
		al.add(AC2);// here i will store AC2 object values in ArrayList al object.
	
       // Now i will use iterator for traverse the values
		Iterator<ArrayListDefinedClass> it = al.iterator();
		while(it.hasNext())
		{
			ArrayListDefinedClass emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.Department);
		}
		
		
		
	}

}
