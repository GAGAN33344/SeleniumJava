package JavaPrograms;

public class PalindromeNumbers {

	//palindrome numbers like 151, 12321, 343
	
	public static void isPalindromeNumber(int num) {
		
		System.out.println("Given Number is " + num);
		int r;
		int sum=0;
		int t;
		
		t=num;
		
		while(num>0) {
			r = num % 10;//get the remainder
			sum = (sum*10)+r;
			num = num/10;
		}
		
		if(t==sum) {
			System.out.println("This is Palindrome Number");
		}
		else {
			System.out.println("This is not a Palindrome Number");
		}
	}
	
	public static void main(String[] args) {

		isPalindromeNumber(44);
		System.out.println("************");
		isPalindromeNumber(151);
		System.out.println("************");
		isPalindromeNumber(2345);
		System.out.println("************");
		isPalindromeNumber(78987);
		System.out.println("************");
		isPalindromeNumber(1);
		System.out.println("************");
		isPalindromeNumber(0);
	}

}
