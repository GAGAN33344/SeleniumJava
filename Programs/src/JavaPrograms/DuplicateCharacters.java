package JavaPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class DuplicateCharacters {

	public static void main(String[] args) {

		printDuplicateCharacters(null);
		System.out.println("**********");
		printDuplicateCharacters("");
		System.out.println("**********");
		printDuplicateCharacters("A");
		System.out.println("**********");
		printDuplicateCharacters("GAGANMANN");
		System.out.println("**********");
		printDuplicateCharacters("11000");
		System.out.println("**********");
		printDuplicateCharacters("007 james bond");
		System.out.println("**********");
		int count=countOfOccurences("GAGANGG",'G');
		System.out.println(count);
		System.out.println("**********");
		int count1=countOfOccurences("MANNN",'N');
		System.out.println(count1);
		System.out.println("**********");
		int count2=countOfOccurences("GAGANPREET",'E');
		System.out.println(count2);
	}
		public static void printDuplicateCharacters(String str) {
			
		//1. by using HashMap : time complexicity is O(2n) -- good solution
		if(str == null) { //Null check at first condition
			System.out.println("Null String");
			return;
		}
		
		if(str.isEmpty()) {
			System.out.println("Empty String");
			return;
		}
		
		if(str.length() == 1) {
			System.out.println("Single Char String");
			return;
		}
		
		        char words[] = str.toCharArray();//convert string characters to array
				Map<Character, Integer> charMap = new HashMap<Character, Integer>();
				for(Character ch : words) {
					Integer count = charMap.get(ch); 
					if(count == null) {
						charMap.put(ch,1);
					}
					else {
						charMap.put(ch, ++count);
					}
				}
				
				//get the values from HashMap
				Set<Entry<Character, Integer>> entrySet = charMap.entrySet();
				for(Entry<Character, Integer> entry : entrySet) {
					if(entry.getValue()>1) {
						System.out.println(entry.getKey() + ":" + entry.getValue());
					}
				}
	}
		
		//2.
		public static int countOfOccurences(String str, char character) {
			int count = 0;
			for(int i=0; i<str.length(); i++) {
				if(str.charAt(i)==character)
				{
					count++;
				}
			}
			return count;
		}
}
