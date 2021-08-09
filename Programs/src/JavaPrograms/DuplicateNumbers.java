package JavaPrograms;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumbers {

	public static void main(String[] args) {

       int num[] = {1,5,7,8,9,1,5,7};
		
		//1. compare each element: time complexicity is O(nxn) -- worst solution
		for(int i=0; i<num.length; i++) {
			for(int j=i+1; j<num.length; j++) {
				
				if(num[i]==(num[j])) {
					System.out.println("Duplicate number is : " + num[i]);
				}
			}
		}
		
		System.out.println("*******************");
		
		//2. by using HashSet: it stores only unique values : time complexicity is O(n) -- good solution
		Set<Integer> numbers = new HashSet<Integer>();
		for(Integer nums : num) {
			if(numbers.add(nums)==false) {
			System.out.println("Duplicate number is : " + nums);
			}
		}
	} 
} 
