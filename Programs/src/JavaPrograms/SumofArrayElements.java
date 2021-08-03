package JavaPrograms;

public class SumofArrayElements {

	//Create a method which accepts Array and returns sum of all the elements in array
	public static void main(String[] args) {

		int[] a = {1,2,3,4,5,6,7,8,9,10};
		int totalSum = arraySum(a);
		System.out.println("Total Sum is : " + totalSum);
		
	}
	
	public static int arraySum(int[] a)
	{
		int sum = 0;
		for(int i=0; i<a.length; i++)
		{
			sum = sum + a[i];
		}
		return sum;
	}

}
