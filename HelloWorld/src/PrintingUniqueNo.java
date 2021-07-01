import java.util.ArrayList;

public class PrintingUniqueNo {

	// Printing the  unique number and print how many times that number comes in list.
	
	
	public static void main(String[] args) {

		int a[] = {2,3,4,5,3,4,2,4,9};
		
		//first i will create ArrayList and push this number to arraylist
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i=0; i<a.length; i++)
		{
			int k=0;
			
			if(!al.contains(a[i]))
			{
				al.add(a[i]);
				k++;
				
				for(int j=i+1; j<a.length; j++)
				{
					if(a[i]==a[j])
					{
						k++;
					}
				}
				
				System.out.println(a[i]);
				System.out.println(k);
				
			}
			
			
		}
		

	}

}
