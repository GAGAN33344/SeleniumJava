
final class FinalKeyword {// Final keyword on class level

	//Final keyword can be used on class level, method level and variable level.
	// when we put final keyword on class level, then no one another can extends 
	// and inherit the properties of that Class.
	// when we put final keyword on method level then we couldn't override that method.
	// when we put final keyword on variable level, then we can't change the value of
	//that variable.
	
	
	final void getData()// Final Keyword on Method level
	{
		System.out.println("This method can't be override ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int a =10;// Final keyword on variable level.
		FinalKeyword FK = new FinalKeyword();
		FK.getData();
		System.out.println("This value can't be change " + a);
		
		
		
	}

}
