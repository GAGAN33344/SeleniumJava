package JavaPrograms;

public class PrintMultiplicationNumbers {

	//Print 5 Multiplication table without using Multiply operator
		public static void main(String[] args) {

			int results = multiply(10,6);
			System.out.println("Multiplication of two numbers are : " + results);	
		}
		
		public static int multiply(int i , int j)
		{
			//i has to sum itself j times to get the results.
			int k =1;
			int sum = 0;
		    while(k<=j)
		    {
		    	sum = sum + i;
		    	k++;
		    }
			return sum;
		}
	}

