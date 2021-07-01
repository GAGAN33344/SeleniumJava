package OopsConcept;

public class Overloading {

	/*
	 * Naveen Automation Labs
	  when the method name is same with different arguments or input parameters within 
	  same class is known as METHOD OVERLOADING.
	  you cannot create a method inside a method.
	  Duplicate methods means same method name with same number of arguments
	  or input parameters are not allowed.
	  Also main method can be overloaded,but its parameters or arguments should 
	  be different.
	  
	 */
	public void sum()
	{
		System.out.println("sum method---zero input parameter");
	}
	
	public void sum(int a)
	{
		System.out.println("sum method---1 input parameter");
		System.out.println(a);
	}
	
	public void sum(int b, int c)
	{
		System.out.println("sum method---2 input parameter");
		System.out.println(b-c);
	}
	
	public void sum(int d, double e)// different data types
	{
		System.out.println("sum method---2 input parameter");
		System.out.println(d-e);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Overloading OL = new Overloading();
		OL.sum();
		OL.sum(10);
		OL.sum(10, 4.1);
		OL.sum(10, 5.5);
		
	}
	
	public static void main(int f)// main method can be overloaded
	{
		
	}

	public static void main(int g, int h)// main method can be overloaded
	{
		
	}

}
