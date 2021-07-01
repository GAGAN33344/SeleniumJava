
public class Variable {

	static int classVariable = 50;// static variable
	int instanceVariable = 100;// non-static variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int localVariable = 150;// local variable

		// call the Local class variable
		System.out.println("Local Variable is = " + localVariable);
		// call the static class variable
		System.out.println("Static Variable is = " + classVariable);

		// if we want to call Non-Static class variable, then we have to create a object
		// and with the assistance of that object, we can call to instanceVariable.
		Variable instance = new Variable();
		System.out.println("Non-Static Variable is = " + instance.instanceVariable);

	}

}
