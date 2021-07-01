package OopsConcept;

/* 1. Abstract classes must include at least one abstract methods or may or may not
 concrete methods.
2. If a class is declared abstract then it cannot be instantiated.
3. If a class has abstract method then we have to declare the class as abstract class
4. When an abstract class is subclassed, the subclass usually provides implementations 
for all of the abstract methods in its parent class. However, if it does not,
then the subclass must also be declared abstract.*/

/*Abstract Method:

An abstract method is a method that is declared without an implementation 
(without braces, and followed by a semicolon), like this:
abstract void method1();*/


 public abstract class Abstraction {

	   public int a = 10;
	   
	abstract void method1();// abstract method
	
	void method2(int x) {// concrete method
		System.out.println("I am in Parent class, I am not a abstract method, however a concrete method");
	}
}
	

