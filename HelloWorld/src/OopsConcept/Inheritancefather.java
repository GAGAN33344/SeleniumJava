package OopsConcept;

public class Inheritancefather extends InheritanceGrandfather{

	public void city()
	{
		System.out.println("Bathinda");
		
	}
	
	public void car()
	{
		System.out.println("Scorpio");
	}
	
	public void country()// Overridden Method
	{
	    System.out.println("Live in Canada");// Method Body
	}
	
	public void dog()/* when same method is present in parent class as well as child class
	with name and same number of arguments is know as method OVERRIDDING.*/
	{
		System.out.println("Bullmastiff Breed");
	}
	
	public static void main (String [] args)
	{
		Inheritancefather IF = new Inheritancefather();
		IF.country();
		IF.state();
		IF.city();
		IF.car();
		IF.dog();
		
		System.out.println("********");
		
		InheritanceGrandfather IG = new Inheritancefather();
		IG.country();// This line of code give us result of overridden method body.
		IG.state();
		
		
		
	}
	
	
}
