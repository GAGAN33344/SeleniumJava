package OopsConcept;

/*
 
 Points to remember:
1. Java interface represents IS-A relationship similar to Inheritance
2. Interface cannot be instantiated same like abstract class
3. Java compiler adds public and abstract keywords before the interface methods
4. Java compiler adds public, static and final keywords before data members
5. Interface extends another interface just like a Class extends another Class
 but a class implements an interface.
6. The class that implements interface must implement all the methods of that interface.
7. Java allows you to implement more than one interface in a Class

 */

public interface USBANK {
	
	int a = 100;// static by default
	
	public void educationLoan();// public and abstract method by default
	
	public void carLoan();// public and abstract method by default
	

}
