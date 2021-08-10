package JavaPrograms;

import java.util.Arrays;

public class SortArrayLargestNumber {

	public static void main(String[] args) {

		int temp, size;
		int array[] = {10, 20, 25, 63, 96, 57};
		size = array.length;

		System.out.println("Array Size is : " + size);

		for(int i = 0; i<size; i++ ){
			for(int j = i+1; j<size; j++){

				if(array[i]>array[j]){
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		// Arrays.sort(array);
		//System.out.println("Second largest number is :" +  array[size-2]);

		System.out.println("Given Array is : " + Arrays.toString(array));
		System.out.println("Second largest number is:: "+array[size-2]);
	}
}