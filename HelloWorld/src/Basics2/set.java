package Basics2;

import java.util.LinkedHashSet;

// This class is LinkedHashSet
// LinkedHashSet Class does not accept duplicate value but it maintains insertion order.

public class set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet<String> g =new LinkedHashSet<String>();
		g.add("Raman");
		g.add("Suman");
		g.add("Gagan");
		g.add("Bhola");
		g.add("Sony");
		g.add("Navu");
		g.add("Raman");//Console will not print duplicate value like Raman
		
		System.out.println(g);
		
		System.out.println(g.contains("Maddi"));
		
		//Advanced for loop 
		System.out.println("****Using Advanced for loop");
		for(String str: g)
		{
			System.out.println(str);
		}
		
		
	}

}
