
public class TryCatchException {

	/* I am going to write a line of code and I am not sure, the line of code code 
	 would throw any error or not, if code will throw any error I need to catch them
	 and print a message without showing any failure, the we would use try catch mechanism.
	  */
	// one try can be followed by multiple catch blocks.
	// catch should be an immediate block after try. there should be no code between try
	//and catch.
    /* when any type of exception occur in try block, then we can generally mention 
	(Exception e) in catch block, this will handle any type exception*/
	
	public static void main(String[] args) {
	
		int a =10;
		int b = 0;
		
		
		
		//System.out.println(k);// this will throw a error.
		// if we want to skip the failure, then we have to use try catch block
		
	    try
		{
			int k =a/b;
			System.out.println(k);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("I catch the Arithmetic Exception");
		}
		
		try
		{
			int array[]= {1,2,3,4,5};
			System.out.println(array[7]);
		}
		
		catch(IndexOutOfBoundsException t)
		{
			System.out.println("I catch the IndexOutOfBounds Exception");
		}
		
		catch(Exception e)
		{
			System.out.println("I catch the Every Type of Exception");
	}
		finally// in generally you run the program and in the middle of the program you
		//got error and rest of code skip and shows error, the purpose of finally block,
		//even your script is failed somewhere in the middle of program, it comes down,
		//checks for finally block and execute all the statements present in the finally block
		//finally block give return only when we use try block
		{
			//this block is executed irrespective of exception thrown or not
			System.out.println("delete the cookies");
		}

	}
	}
