 package JavaPrograms;

public class PrimeNumbers {

	public static boolean isPrimeNumber(int num) {   //will check number is prime or not with passing number parameter
		
		//edge/corner/cases
		if(num<=1) {
			return false;
		}
		
		for(int i=2; i<num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void getPrimeNumbers(int num) { //will check numbers are prime or not till passing number parameter
		
		for(int i=2; i<=num; i++) {
			if(isPrimeNumber(i)) {
			   System.out.print(i + " ");
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("2 is prime number : " + isPrimeNumber(2));
		System.out.println("4 is prime number : " + isPrimeNumber(4));
		System.out.println("10 is prime number : " + isPrimeNumber(10));
		System.out.println("19 is prime number : " + isPrimeNumber(19));
		
		System.out.println("*****************");
		
		getPrimeNumbers(20);
		
        System.out.println("*****************");
		
		getPrimeNumbers(27);
		
	}

}
