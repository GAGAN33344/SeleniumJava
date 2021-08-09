package JavaPrograms;

import java.util.ArrayList;

public class practice {
	
	public static void main(String[] str) {
		
		int [] num = {2,1,4,11,12,9,7,8,4,9,12,11};
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i=0; i<num.length; i++) {
			int count =0;
			if(!al.contains(num[i])) {
				al.add(num[i]);
				count++;
				
				for(int j=i+1; j<num.length; j++) {
					if(num[i]==num[j]) {
						count++;
					}
				}
			}
			if(count==1) {
				System.out.println(num[i] + " is unique number");
			
			}
		}
	
	}
	}

