package Basics2;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*
	 Array is used to store multiple values of same data types.
	 
	 */
		/*String str[] = new String[5];// Declare a array and allocates the memory
		                              //of string values
		str[0]="Harpal";
		str[1]="Balwinder";
		str[2]= "Gagan";  // initialize the values into the array
		str[3]="Parvinder";
		str[4]="Gugu";*/
		//OR
		String str[] = {"Harpal","Balwinder","Gagan","Parvinder","Gugu"};
		
		for(int j=0;j<str.length;j++)
		{
			System.out.println(str[j]);// retrieve values present in array
		}
		
		System.out.println("*******");
		
		for(int i=str.length-1;i>=0;i--)// reverse order
		{
			System.out.println(str[i]);
		}
		
	}

}
