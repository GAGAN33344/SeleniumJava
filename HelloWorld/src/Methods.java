
public class Methods {

	String s = "pass";

	public void sum() {
		System.out.println("sum is five");
	}

	public void subtract() {
		System.out.println("Subtraction value is 10");
	}

	public void divide() {// return value is in string so thats why i have to
							// change string instead of void
		System.out.println("dividation value is 2");
		System.out.println(this.s);//this line of code
		//print the value of class String variable s=pass with the help of THIS keyword.
	}
	// now i will call this methods to other class(class name test1) with the
	// assistance of create a object in that class.
}
