package JavaPrograms;

public class DivideByZero {

	// what will be output when we divide a number by zero ?
	//Number could be integer, double and float
	
	public static void main(String[] args) {
		
		//System.out.println(9/0);// will get arithmetic exception when divide by integer number
		System.out.println(9.0/0);// will get Infinity when divide by double/float number
		System.out.println(12.33f/0);// will get Infinity when divide by double/float number
		System.out.println(10/0.0);// will get Infinity when divide by double/float number
		System.out.println(19.9999d/0);// will get Infinity when divide by double/float number
		//if double or floating numbers are divided by 0 or 0.0, we will get infinity  
	}

}
