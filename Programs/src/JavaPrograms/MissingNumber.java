package JavaPrograms;

public class MissingNumber {

	public static void main(String[] args) {

		int number[] = {-1,0,1,2,3,4,5,6,7,8,9,11,12};
		
		int sum=0;
		for(int i=0; i<number.length; i++) {
			sum = sum + number[i];
		}
		System.out.println("Sum with missing numbers are : " + sum);
		
		int sum1=0;
		for(int j=-1; j<=12; j++) {
			sum1 = sum1 + j;
		}
		System.out.println("Sum without missing numbers are  : " + sum1);
		
		System.out.println("Missing number is  : " + (sum1-sum));
	}
}
