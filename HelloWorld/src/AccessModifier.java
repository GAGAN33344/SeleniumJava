
public class AccessModifier {

	//Default variable and methods can be access by any class within the same package.
	// public variable and methods can be access by any class across all the packages.
	/*Private variable and methods can be access by same class. No one another class 
	can access the private methods and variables across all the packages*/
	/*protected variable and methods can be access by any class within the same packages,
	 But if another package class want to access that variables and methods, then
	 another package class have to become subclass and extends the parent class,
	 then subclass access the variables and methods of parent class.*/
		

	int a = 100;// Default Modifier
	
	void getData()// Default Modifier
	{
	System.out.println("Default Access Modifier");	
	}
	
	
	
   public int b = 200;// public Modifier
	
	public void getData1()// public Modifier
	{
	System.out.println("Public Access Modifier");	
	}
	
	
	
    protected int c = 300;// protected Modifier
	
	protected void getData2()// protected Modifier
	{
	System.out.println("Protected Access Modifier");	
	}
	
	
	
    private int d = 400;// private Modifier
	
	private void getData3()// private Modifier
	{
	System.out.println("Private Access Modifier");	
	}
	
	public static void main(String[] args)
	{
		AccessModifier AM = new AccessModifier();
		AM.getData3();
		
	System.out.println(AM.d);
		
	}
	
	
}
