
public class AccessModifier1 {
	
	/*This class would access default, public and protected variables and methods from
	  AccessModifier Class*/
	

	public static void main(String[] args)
	{
		AccessModifier AM = new AccessModifier();
		System.out.println(AM.a);
		AM.getData();
		System.out.println(AM.b);
		AM.getData1();
		System.out.println(AM.c);
		AM.getData2();
		
		
	}
	
	
	
	
	
}
