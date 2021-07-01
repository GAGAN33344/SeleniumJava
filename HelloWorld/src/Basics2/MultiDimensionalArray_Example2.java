package Basics2;

public class MultiDimensionalArray_Example2 {

	/*
	 i have a matrix and find out the maximum number from the column where
	 Minimum number is present in this matrix
	 2  4  5
	 3  0  7
	 1  2  9
	 */
	/*
	 Step 1- find out the minimum number in this matrix.
	 Step-2 Identify the column of that minimum number.
	 Step-3 Find out the maximum number of identified column.
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int g[][]= {{2,4,5},{3,0,7},{1,2,9}};
		
		int min = g[0][0];
		int minColumn = 0;
		for(int i=0; i<3; i++)// for rows
		{
			for(int j=0; j<3; j++)// for columns
			{
				
				if(g[i][j]<min)
				{
					min=g[i][j];//this line of code give us minimum value
					minColumn = j;// this line of code give Column index value
					
				}
				
			}
		}
		System.out.println("minimum value of this matrix is " + min);
		System.out.println("Column index value is " + minColumn);
		
		int max = g[0][minColumn];
		int k=0;
		while(k<3)
		{
				if(g[k][minColumn]>max)
				{
					max= g[k][minColumn];//this line of code give us maximum value of identified column.
				}
				k++;
		}
		System.out.println("Maximum value of identified column is " + max);
		
	}

}
