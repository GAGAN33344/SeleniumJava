package JavaPrograms;

public class ReverseInteger {

	public static void main(String[] args) {
		
		//1.) Using Algorithm Logic
		int number = 123456789;
		 int r = 0;
		 int rev = 0;
		 
		 while(number !=0)
		 {
			 r = number % 10 ;
			 rev = (rev * 10) + r;
			 number = number / 10;
		 }

		 System.out.println(rev);
		 
		 System.out.println("**************");
		 
		 //2.) using StringBuffer
		 int number1 = 987654321;
		 StringBuffer sb = new StringBuffer(String.valueOf(number1));//String.valueOf method will change number to string 
		 sb.reverse();
		 System.out.println(sb);
	}

}
