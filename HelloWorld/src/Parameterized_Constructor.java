
public class Parameterized_Constructor {
	
	/*
	 Constructor name should be same as class name
	 it looks like a method, but the difference between constructor and method
	 is method gives a return value but constructor don't give any return value.
	 when we create a object, constructor is called(invoked) automatically
	 */
	
	public Parameterized_Constructor()// Default Constructor
	{
		System.out.println("I am the Constructor");
	}
	
	public Parameterized_Constructor(int x, int y)//Parameterized Constructor
	{
		System.out.println("I am the Parameterized Constructor with Two Parameter");
		int z = x+y;
		System.out.println(z);
	}
	
	public Parameterized_Constructor(String s)//Parameterized Constructor
	{
		System.out.println("I  am the Parameterized Constructor with one Parameter");
		System.out.println(s);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parameterized_Constructor pc = new Parameterized_Constructor();
		//This line of code only call default Constructor or if we don't define any 
		//constructor, the compiler will call implicit constructor.
		
		Parameterized_Constructor pe = new Parameterized_Constructor(4,5);
		//This line of code only call Two Parameterized Constructor, because i pass 
		//the two value when we create the object of this class and compiler will 
		//check, their is any constructor who have two integer values.
		
		Parameterized_Constructor pd = new Parameterized_Constructor("Hello");
		//This line of code  only call one Parameterized Constructor, because i pass 
		//string value when we create the object of this class and compiler will check, 
		//their is any constructor who have String values .
	}

}
