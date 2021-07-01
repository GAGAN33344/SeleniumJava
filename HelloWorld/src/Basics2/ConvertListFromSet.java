package Basics2;


import java.util.ArrayList;
import java.util.HashSet;


public class ConvertListFromSet {

	// In this program i will convert list from set.
	 /*HashSet Does not accept duplicate values.
	  There is no guarantee elements stored in sequential order....its Random order.
	*/
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> j = new HashSet<String>();
		j.add("Balwinder");
		j.add("Santosh");
		j.add("Arminder");
		j.add("Suman");
		j.add("Arminder");// Console will not print this value because its duplicate value
		
		System.out.println(j);
		
		ArrayList<String> List = new ArrayList<String>(j);
		System.out.println(List.get(3));
		
		
	}

}
