
public class SuperChildClass extends SuperParentClass{

	// super keyword is use, when we want to call same parent class and child class 
	//variables and methods.
	
	
	String name = "Baby Girl";
	int a = 200;
	
	public void getString()
	{
		System.out.println(name);// this line of code print child class variable string
		System.out.println(super.name);// super keyword refer to parent class Variable string
	}
	
	public void getInt()
	{
		System.out.println(a);// this line of code print child class integer variable
		System.out.println(super.a);// super keyword refer to parent class Integer Variable
	}

	public void getData()
	{
		System.out.println("I am from child Class");//this line of code print child class method.
		super.getData();//super keyword refer to parent class method.
	}
	
	public SuperChildClass()
	{
		super();// this super method keyword automatically call parent class 
		//constructor..one thing always keep in mind, in constructor case super method
		//line of code should be always in first line.
		System.out.println("Child Class Constructor");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SuperChildClass SC = new SuperChildClass();
		SC.getString();
		SC.getInt();
		SC.getData();
			
	}

}
