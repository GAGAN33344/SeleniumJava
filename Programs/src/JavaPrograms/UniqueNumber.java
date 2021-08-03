package JavaPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class UniqueNumber {

	public static void main(String[] args) {

		int a[] = {4,5,5,4,6,5,7,8,8,9,6,9,10};
		
		//1. Using ArrayList
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0; i<a.length; i++) 
		{
			int count=0;
			if(!al.contains(a[i]))
			{
				al.add(a[i]);
				count++;
			
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]==a[j]) 
				{
					count++;
				}
			}
			//System.out.println(a[i]);
			//System.out.println(count);
			if(count==1)
			{
				System.out.println(a[i] + " is unique number");
			}
		}
		}
		
		System.out.println("**************");
		
		
		//2. Using HashMap
		int b[] = {4,5,5,4,6,5,7,8,8,9,6,9,10};
		Map<Integer, Integer> hp = new HashMap<Integer, Integer>();
		for(Integer h : b)
		{
			Integer count = hp.get(h);
			//System.out.println(count);
			if(count==null) {
				hp.put(h,1);
			}
			else
			{
				hp.put(h,++count);
			}
		}
		
		Set<Entry<Integer, Integer>> m =hp.entrySet();
		for(Entry<Integer, Integer> entry : m)
		{
			if(entry.getValue()==1)
			{
				System.out.println(entry.getKey() + " : " + entry.getValue());
				System.out.println(entry.getKey() + " is unique number");
			}
		}
	}
}
