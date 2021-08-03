package JavaPrograms;

public class NotANumber {

	/*
	 * What is NaN-Not A Number ? - that is undefined number
	 */
	
	public static void main(String[] args) {

     System.out.println(0.0/0.0);//NaN	
     System.out.println(Math.sqrt(-1));//NaN
     
     System.out.println(Float.NaN == Float.NaN);//false because numbers are not defined
     System.out.println(Float.NaN != Float.NaN);//true
     
     double nan = 2.1 % 0;//NaN
     System.out.println(2.1 % 0 == nan);//false
     System.out.println(nan == nan);//false
	}

}
