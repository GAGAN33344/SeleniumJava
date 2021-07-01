package Basics2;


// I will access this class to ArraylistExample2 Class.
public class ArrayListDefinedClass {

	String name;// Class Variable
	Integer age;//Class Variable
	String Department;//Class Variable
	
	public ArrayListDefinedClass(String name, Integer age, String Department)// all are local variable
	{
	
		this.age=age;// this means local variables are equal class variables
		this.Department= Department;// this means local variables are equal class variables
		
		this.name=name;// this means local variables are equal class variables
		
	}
	
	/*public static void main(String[] args)
	{
		ArrayListDefinedClass AC= new ArrayListDefinedClass("Gagan",29,"Electrical");
		
	}
	
	*/
}
