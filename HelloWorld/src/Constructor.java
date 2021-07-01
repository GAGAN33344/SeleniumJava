
public class Constructor {

	/*
	 Constructor name should be same as class name
	 it looks like a method, but the difference between constructor and method
	 is method gives a return value but constructor don't give any return value.
	 when we create a object, constructor is called(invoked) automatically
	 */
	
	public Constructor() {// this is constructor
		System.out.println("i am the constructor");
	}
	
	public void setData()// this is method
	{
		System.out.println("setData is implemented");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constructor c = new Constructor();
		// now when i run the program, Constructor method body block of code
		//will execute automatically. i don't need to call the method with the assistance 
		//of object c 
		
		
	}

}
