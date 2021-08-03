package JavaPrograms;

import java.util.Arrays;

public class SmallestAndLargestNumber {

	//Find smallest and largest number from array
	
	public static void main(String[] args) {

		int ar[] = {10, -20, 38, -99, 7890, 30, 78901};
		
		int largest = ar[0];
		int smallest = ar[0];
		
		for(int i=1; i<ar.length; i++) {
			if(ar[i]>largest) {
				largest = ar[i];
			}
			else if(ar[i]<smallest) {
				smallest = ar[i];
			}
		}
		
		System.out.println("Given Array is : " + Arrays.toString(ar));
		System.out.println("Largest Number is : " + largest);
		System.out.println("Smallest Number  is : " + smallest);	
	}
}
