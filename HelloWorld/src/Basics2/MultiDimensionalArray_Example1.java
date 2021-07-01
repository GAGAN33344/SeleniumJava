package Basics2;

public class MultiDimensionalArray_Example1 {


	/*
	 i have a matrix and find out the maximum number from this matrix
	 2  4  5
	 3  4  7
	 1  2  9
	 */
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int abc[][]= {{2,4,5},{3,4,7},{1,2,9}};
		int max = abc[0][0];
		
		
		for(int i=0; i<3; i++)// for rows
		{
			for(int j=0; j<3; j++)// for Columns
			{
				if(abc[i][j]>max)
				{
					max= abc[i][j];
				}
			}
		}
		
		System.out.println("Maximum number is " + max);
	}

}
