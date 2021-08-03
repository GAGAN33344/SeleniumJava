package JavaPrograms;

public class MaxDifferenceAdjacentArray {

	//Max difference between any adjacent index in array.
	public static void main(String[] args) {

		int [] a = {1,4,8,11,15,21};
		int diff = 0;
		
		for(int i=0; i<a.length-1; i++) {
			if(a[i+1]-a[i]>diff)
			{
				diff = a[i+1]-a[i];
			}
		}
		System.out.println("Two adjacent num max diff is : " + diff);
	}
}
