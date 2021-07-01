package OopsConcept;

public class InheritanceSon extends Inheritancefather{// This relationship known as has-a relationship.
	
	
	public void bike()
	{
		System.out.println("Red Color Bullet 350cc");
	}

	public void area()
	{
		System.out.println("Jujhar Singh Nagar");
	}
	
	public void dog()/* when same method is present in parent class as well as child class
	with name and same number of arguments is know as method OVERRIDDING.*/
	{
		System.out.println("Bulldog Breed");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		InheritanceSon IS = new InheritanceSon();/* Child Class object can be referred
		by Child class reference variable is known as STATIC OR COMPILE TIME POLYPHORMISM.*/ 
		IS.country();
		IS.state();
		IS.city();
		IS.car();
		IS.bike();
		IS.area();
		IS.dog();/* this dog(); method is present in Inheritancefather class also 
		InheritanceSon Class but when i call and excute it, result only show 
		InheritanceSon Class method, why.. because compiler understand same dog method
		is available in both classes, but if son class have it, why are you inherit from
		your parent class..thats why compiler print son class method body.*/
		
		System.out.println("**********");// this one just for space on console
		
		Inheritancefather IF = new InheritanceSon();/* Child Class object can be referred
		by parent class reference variable is known as DYNAMIC OR RUN TIME POLYPHORMISM.
		and known as TOP CASTING*/
		IF.car();
		IF.city();
		IF.dog();
		IF.country();
		IF.state();
	
	}

}
