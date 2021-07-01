package Basics2;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class map3 {
    // This is Hashtable Class.
	// its similar to HashMap, but it's Synchronized and thread safe
	//stores the values on the basis of key-value
	//key--object--Hashcode--value
	//Hashcode is unique 32 bit integer value which belongs to every object, but
	//if we have same key, value of both the objects then hashcode will be same.
	//HashTable don't allow null keys and values.
	//HashTable is only class other than vector which uses enumerator to iterate 
	//the values of HashTable object.
	// Its not maintain insertion order.
    //it does not accept duplicate values, if key, value are same.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<Integer, String> h1 = new Hashtable<Integer, String>();
		h1.put(2,"Elect.");
		h1.put(4,"Mech.");
		h1.put(3,"Comp.");
		h1.put(8,"Hello");
		
		//now i will create a one more object of same class and store the values of
		//h1 object in new created object with the help of clone method.
		
		Hashtable<Integer, String> h2 = new Hashtable<Integer, String>();
		h2=(Hashtable)h1.clone();// now h2 object have same values like h1
		
		System.out.println("Values of h1 Hashtable are " + h1);
		System.out.println("Values of h2 Hashtable are " + h2);
		
		h1.clear();// this method will clear all the values from h1 table, but h2 table
		//will keep all values remain the same.
		
		System.out.println("Values of h1 Hashtable are " + h1);
		System.out.println("Values of h2 Hashtable are " + h2);
		
		//contains method, for check the values are present or not.
		System.out.println(h2.containsValue("Hello"));
		
		Hashtable<String, String> m = new Hashtable<String, String>();
		m.put("E","Elephant");
		m.put("M","Monkey");
		m.put("D","Dog");
		m.put("C","Cat");
		
		//how we can print all the values.
		// By using Enumerator with the help of elements method.
	    System.out.println("Print the values from m table by using Enumeration ");
		Enumeration En = m.elements();
		while(En.hasMoreElements())
		{
			System.out.println(En.nextElement());// this line of code print only values
			//if we want to print key and value, then we have to use entry method.
		//Map.Entry mp=	(Map.Entry)En.nextElement();
	//	System.out.println(mp.getKey());
	//	System.out.println(mp.getValue());
			
		}
		
		//advanced for loop by using entrySet method.
		System.out.println("Print the values from m table by using Advanced for loop ");
		for(Entry e :m.entrySet())
		{
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
		Hashtable<String, String> m1 = new Hashtable<String, String>();
		m1.put("E","Elephant");
		m1.put("M","Monkey");
		m1.put("D","Dog");
		m1.put("C","Cat");
		
		
		//I have two m and m1 Hashtable, i want to check the key,values from both the
		//tables are same or not. so i will use equals method.
		
		if(m.equals(m1))
		{
			System.out.println("Tables are equals");
		}
		else
		{
			System.out.println("Tables are not equals");
		}
		//get the hashcode of hashtable object.
		System.out.println("Hashcode value of h1 table is " + h1.hashCode());
		System.out.println("Hashcode value of h2 table is " + h2.hashCode());
		System.out.println("Hashcode value of m table is " + m.hashCode());
		System.out.println("Hashcode value of m1 table is " + m1.hashCode());
		
	}

}
