package Basics2;


//MultiDimensional_ Array stores the values in the form of Rows and Column.
//  x[row][column]

public class MultiDimensional_Array {
	
	
	public static void main(String []args)
	{
	
	        int x[][] = new int[2][3] ;
	        	x[0][0]=2;
	        	x[0][1]=4;
	        	x[0][2]=5;
	        	x[1][0]=3;
	        	x[1][1]=4;
	        	x[1][2]=7;
	        	//OR
	        	
	      // int y[][]= {{2,4,5},{3,4,7}};
	       
	        	for(int i=0; i<2; i++)// for rows
	        	{
	        		for(int j=0; j<3; j++)// for columns
	        		{
	        			System.out.println(x[i][j]);
	        		}
	        	}
	        
}
	        

}