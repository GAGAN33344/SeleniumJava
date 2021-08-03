 package JavaPrograms;

public class ReverseString {

	public static void main(String[] args) {
		String s = "Gaganpreet";
		
		int len = s.length();
		System.out.println("String length is : " + len);
		System.out.println("***************");
		
		String rev = "";
		
		for (int i = len-1; i>=0 ; i--)
		{
			rev = rev + s.charAt(i);
			
		}
		System.out.println(rev);
		
		System.out.println("***************");
		
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		System.out.println(sb);
	}

}
