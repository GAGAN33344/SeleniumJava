package Basics2;

public class MultiDimensionalArray_Example {

	/*
	 i have a matrix and find out the minimum number from this matrix
	 2  4  5
	 3  4  7
	 1  2  9
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	int x[][]= new int[3][3];
		x[0][0]=2;
		x[0][1]=4;
		x[0][2]=5;
		x[1][0]=3;
		x[1][1]=4;
		x[1][2]=7;
		x[2][0]=1;
		x[2][1]=2;
		x[2][2]=9;  */
		//OR
		
		int y[][]= {{2,4,5},{3,4,7},{1,2,9}};
		int min = y[0][0];
		
		for(int i=0; i<3; i ++)
		{
			for(int j=0; j<3; j++)
			{
				if(y[i][j]<min)
				{
					min = y[i][j];
				}
			}
		}
		
		System.out.println("Minimum number is "+ min);
		
	}

}
