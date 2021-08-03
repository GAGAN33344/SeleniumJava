package JavaPrograms;

public class PassNullArgument {

	// Pass null argument with method overloading with string and object types
	public static void main(String[] args) {

		test(null);// it will point to string argument
	}
	
	public static void test(Object o) {
		System.out.println("Object Argument");
	}
	
	public static void test(String s) {
		System.out.println("String Argument");
	}

}
