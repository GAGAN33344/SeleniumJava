package JavaPrograms;

import java.util.ArrayList;

public class CompareArray {

	//Compare same indexes of two different arrays and create another array for matching values.
	public static void main(String[] args) {

		int [] a = {1,3,6,9};
		int [] b = {0,3,5,9};
		ArrayList<Integer> al = new ArrayList<Integer>();
		//After comparing based on indexes, value should be 3,9 in new array
		for(int i=0; i<a.length; i++)
		{
			if(a[i] == b[i])
			{
		//now we don't know how many values we have to add, so that's why we will create ArrayList to 
	    //store matching values because ArrayList is dynamic
				al.add(a[i]);//add macthing values in al ArrayList
			}
		}
		//now we will convert ArrayList to Array
		Object [] o = al.toArray();
		//Now O object have all matching values, now its time to iterate
		for(Object ob : o)
		{
			System.out.println("Matching Value is : " + ob);
		}
	}

}
