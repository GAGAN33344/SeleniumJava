package Basics2;

public class AcessModifier2 {

	// public variable and methods can be access by any class across all the packages.
	/*protected variable and methods can be access by any class within the same packages,
	 But if another package class want to access that variables and methods, then
	 another package class have to become subclass and extends the parent class,
	 then subclass access the variables and methods of parent class.*/
	
		public int e = 500;// public modifier
		
		public void getData4()// public modifier
		{
			System.out.println("Public Access Modifiers");
		}
		
		
		
		protected int f =600;// protected modifier
		
		protected void getData5()// protected modifier
		{
			System.out.println("Protected Access Modifier");
		}
		
		
	}


