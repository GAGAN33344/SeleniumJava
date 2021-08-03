package JavaPrograms;

public class SmallestNumberFromMatrix {

	/*
	 2 4 5
	 3 4 7
	 1 2 9
	 */
	//find smallest number from Multi-dimensional array
	public static void main(String[] args) {

		int a[][]= {{3,4,5}, {3,4,7}, {6,2,9}};
		int size = a.length;
		System.out.println("Array Size is : " + size);
		
		int min = a[0][0];//Assume minimum number placed in [0] [0] index 
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				if(a[i][j]<min) {
					min = a[i][j];
				}
			}
		}
		System.out.println("Minimim number from matrix is : " + min);
	}
}
