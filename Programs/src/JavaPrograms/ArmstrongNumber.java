package JavaPrograms;

public class ArmstrongNumber {
 
	//cube of each digit after sum together of all digit then sum should be equal to given number
	//like 0,1,153,407,370,371
	/*
	 logic is example we have 153 
	  1*1*1=1
	  5*5*5=125
	  3*3*3=27
	  1+125+27=153
	 */
	
	public static void isArmstrongNumber(int num) {
		System.out.println("Given Number is : " + num);
		int r;
		int t;
		int cube=0;
		t=num;
		
		while(num>0) {
			r=num%10;
			cube=cube+(r*r*r);
			num=num/10;
		}
	
	if(t==cube) {
		System.out.println("This is an armstrong number");
	} else
	{
		System.out.println("This is not an armstrong number");
	}
	}
	
	public static void main(String[] args) {
		isArmstrongNumber(153);
		System.out.println("***********");
		isArmstrongNumber(407);
		System.out.println("***********");
		isArmstrongNumber(370);
		System.out.println("***********");
		isArmstrongNumber(128);
		System.out.println("***********");
		isArmstrongNumber(345);
		System.out.println("***********");
		isArmstrongNumber(0);
		System.out.println("***********");
		isArmstrongNumber(1);
	}

}
