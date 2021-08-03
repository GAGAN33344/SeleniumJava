 package JavaPrograms;

public class CompareTwoIntegers {

	// Compare two integer numbers (Integer caching)
	
	public static void main(String[] args) {
         // integer caching range from -128 to 127, if numbers are in range due to integer caching then 
		// it would be equal however both wouldn't equal.
		Integer num1 = 200;
		Integer num2 = 200;
		
		if(num1 == num2) {
			System.out.println("both are equal");
		} 
		else {
			System.out.println("both are not equal");
		}
	}
}
