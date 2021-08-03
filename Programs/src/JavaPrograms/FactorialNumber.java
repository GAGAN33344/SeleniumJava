package JavaPrograms;

public class FactorialNumber {
	/*
	 *10= 10*9*8*7*6*5*4*3*2*1
	 *4=4*3*2*1=24
	 *5=5*4*3*2*1=120
	 *factorial of 0 is always 1
	 */

	//1. without recursive function : with for loop
	public static int factorial(int num)
	{
		int fact=1;
		if(num==0)
			return 1;
		for(int i=1; i<=num; i++) {
			fact=fact*i;
		}
		return fact;
	}
	
	//2. with recursive function : a function is calling itself
	public static int fact(int num)
	{
		if(num==0)
			return 1;
		else
			return (num * fact(num-1));
	}
	
	public static void main(String[] args) {

		System.out.println("Factorial of 5 is : " + factorial(5));
		System.out.println("***********");
		System.out.println("Factorial of 7 is : " + factorial(7));
		System.out.println("***********");
		System.out.println("Factorial of 10 is : " + factorial(10));
		System.out.println("***********");
		System.out.println("Factorial of 7 is : " + fact(7));
		System.out.println("***********");
		System.out.println("Factorial of 10 is : " + fact(10));
	}

}
