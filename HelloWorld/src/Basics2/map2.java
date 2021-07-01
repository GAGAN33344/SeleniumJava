package Basics2;

import java.util.HashMap;
import java.util.Map.Entry;

public class map2 {

	// This is HashMap class. i will access Employees class and add the values in HashMap.
	// then print key and value on console.
	
	public static void main(String[] args) {
		
		Employees  e = new Employees ("Gagan", 3334, 987345666);
		Employees  e1 = new Employees ("Joban", 4567, 987345676);
		Employees  e2 = new Employees ("Harry", 2342, 987342346);
		Employees  e3 = new Employees ("Harvinder", 5468, 987348756);
		
		
		HashMap<Integer,Employees> h =new HashMap<Integer,Employees>();
		h.put(0, e);
		h.put(1, e1);
		h.put(4, e2);
		h.put(6, e3);
		
		//traverse the HashMap, i will use entrySet method
	
		for	(Entry<Integer, Employees> Emp :h.entrySet())
		{
			System.out.println("Employee " + Emp.getKey() + " info is ");
			System.out.println(Emp.getValue().name);
			System.out.println(Emp.getValue().batchno);
			System.out.println(Emp.getValue().phoneno);
		}
		
		
		
	}

}
