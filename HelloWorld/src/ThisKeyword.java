
public class ThisKeyword {

	// This Keyword is use on class level and this refer to current object 
	//object scope lies on class level.
	
	    int a=100;// class variable
	
	public void getData()// this Method body i want to print the value of a is 100 and 200 also.
	{
		int a = 200;// local variable in this method and i want value of a = 200
		//in this method
		System.out.println("This is local variable " + a);// this line of code 
		//print the value of local variable a=200 
		
		System.out.println("This is Class variable " + this.a);//this line of code
		//print the value of class variable a=100 with the help of THIS keyword.
		
		// now i want to print the sum of both variables.
		int b = a+this.a;
		System.out.println("Sum of class variable and local variable is " + b);
		
	}
	
	public void getData1()// i want to print the value of class variable in this method only.
	{
		System.out.println("In this Method, Class variable is " + this.a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThisKeyword TK = new ThisKeyword();
		TK.getData();
		TK.getData1();
		
		
	}

}
