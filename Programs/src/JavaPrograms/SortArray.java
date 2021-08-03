package JavaPrograms;

public class SortArray {

	public static void main(String[] args) {

		 int temp, size;
	      int array[] = {3, 5, 25, 6, 9, 45};
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
	         for(int i=0; i<size; i++)
	         {
	        	 System.out.print(" " + array[i]);
	         }
	}
}
