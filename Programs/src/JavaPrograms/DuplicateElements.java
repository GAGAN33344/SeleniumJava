package JavaPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {

		String names[] = {"java", "javaScript", "ruby", "C++", "python", "java", "ruby"};
		
		//1. compare each element: time complexicity is O(nxn) -- worst solution
		for(int i=0; i<names.length; i++) {
			for(int j=i+1; j<names.length; j++) {
				
				if(names[i].equals(names[j])) {
					System.out.println("Duplicate element is : " + names[i]);
				}
			}
		}
		
		System.out.println("*******************");
		
		//2. by using HashSet: it stores only unique values : time complexicity is O(n) -- good solution
		Set<String> languages = new HashSet<String>();
		for(String name : names) {
			if(languages.add(name)==false) {
			System.out.println("Duplicate element is : " + name);
			}
		}
		
		System.out.println("*******************");
		
		//3. by using HashMap : time complexicity is O(2n) -- good solution
		Map<String, Integer> storeMap = new HashMap<String, Integer>();
		for(String name : names) {
			Integer count = storeMap.get(name);
			if(count == null) {
				storeMap.put(name,1);
			}
			else {
				storeMap.put(name, ++count);
			}
		}
		
		//get the values from HashMap
		Set<Entry<String, Integer>> entrySet = storeMap.entrySet();
		for(Entry<String, Integer> entry : entrySet) {
			if(entry.getValue()>1) {
				System.out.println("Duplicate element is : " + entry.getKey());
			}
		}
	}

}
