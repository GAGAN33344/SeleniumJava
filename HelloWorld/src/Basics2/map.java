package Basics2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class map {

	// This is HashMap Class and convert HashMap key, values into set and iterate.
	// key and value should be in both integer and String or many more.
/*	 HashMap,HashTable and LinkedHashMap classes implements the Map Interface. This 
     classes takes the values in the form of key and value.
     LinkedHashMap extends the HashMap.
    its Does not maintain insertion order.
    it does not accept duplicate values, if key, value are same
    HashMap got Concurrent Modification Exception--fail-fast condition, this exception will
    come when one thread is adding or removing the value and in the same time,when
    another threads try to access the particular value but that particular value is 
    already gone from object,immediately this exception will occur. 
    
    HashTable and HashMap looks like Same but there are 3 major differences are below.
    HashMap is not Synchronized and thread safe- means if 5 threads are working on HashMap
    or 5 programs are accessing the HashMap. all can access HashMap at same time. but
    in HashTable, if if 5 threads are working on HashTable or 5 programs are 
    accessing the HashTable. all cannot access HashTable at same time. if one program is
    accessing the HashTable, the other program need to wait till the first program releases
    the HashTable resources.
    HashMap allows one null keys and any number of values.However HashTable don't 
    allow null keys and values.
    HashMap object values are iterated by using iterator. However HashTable is only 
    class other than vector which uses enumerator to iterate the values of HashTable 
    object.
 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(0, "Java");// key value(0) is the reference of Java String.
		hm.put(3, "Selenium");// key value(3) is the reference of Selenium String.
		hm.put(5, "TestNG");// key value(5) is the reference of TestNG String.
		hm.put(4, "Maven");// key value(4) is the reference of Maven String.
		hm.put(34, "Jenkins");// key value(34) is the reference of Jenkins String.
		hm.put(8, "Maven");
		hm.put(8, "Maven");// Console will not print duplicate value, because key,value is same.
		
		System.out.println(hm);
		System.out.println(hm.containsValue("Log4J"));// this mathod for validation
		System.out.println(hm.get(34));// check the reference String of 34 key
		hm.remove(34);
		System.out.println(hm.get(34));// after removing reference String of 34 key,
		//key will show null String.
		
		Set s = hm.entrySet();// convert the Key, values from HashMap to Set through
		// entrySet method.
		//now i will iterate all the values now which are present in set through iterator index by index.
		
		Iterator it = s.iterator();
		while(it.hasNext())
		{
			//System.out.println(it.next());//this line of code gives whole output(key,value)
			//which is present in set indexes. but i want to print the key and value seperately,
			//so i have to use map entry for interating the key and value seprately
			
			Map.Entry mp=(Map.Entry)it.next();
			System.out.println(mp.getKey());// this will print key values
			System.out.println(mp.getValue());//this will print String values
			
		}
		
		
		System.out.println("*******");
		//one simple method, if we want iterate all keys and values,we can use
		//advanced for loop by using entrySet method.
		
		for(Entry<Integer, String> e : hm.entrySet()) 
		{
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}

		
	}

}
