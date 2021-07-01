package OopsConcept;

import Basics2.AcessModifier2;

/* one thing always keep in mind, when we access methods and variables from another 
 class that belongs to another package, then we have to import package of that class 
 which one we want to execute. 
 */


/*public class AccessModifier3 {

		/*This class would access public variables and methods from
		  Basics2 Package,AcessModifier2 Class*/
		/*we can access public variables and methods from AcessModifier2 Class after just
         creating the object of that class*/
	
	/*	public static void main(String[] args) {
			// TODO Auto-generated method stub
	     // for access public variables and methods

			AcessModifier2 AM= new AcessModifier2();
			AM.getData4();
			System.out.println(AM.e);
			
	}

}*/

/*This class would access protected variables and methods from
Basics2 Package,AcessModifier2 Class*/

/*if we want to access protected variables and methods then this class have to
  become subclass and use extends keyword*/

public class AccessModifier3 extends AcessModifier2{
	
	public static void main(String[] args)
	{
		
		AccessModifier3 AM = new AccessModifier3();
		AM.getData5();
	   System.out.println(AM.f);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}












