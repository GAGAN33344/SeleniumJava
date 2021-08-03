package JavaPrograms;

public class PalindromeString {

	//palindrome Strings like teet, aca, tukut
	
		public static void isPalindromeString(String str) {
			
			System.out.println("Given String is " + str);
			String rev = "";
			String t;
			
			t=str;
			int len = str.length();
			
			for (int i = len-1; i>=0 ; i--)
			{
				rev = rev + str.charAt(i);
				
			}
			
			if(t.equals(rev)) {
				System.out.println("This is Palindrome String");
			}
			else {
				System.out.println("This is not a Palindrome String");
			}
		}
		
		public static void main(String[] args) {

			isPalindromeString("teet");
			System.out.println("************");
			isPalindromeString("aca");
			System.out.println("************");
			isPalindromeString("asdf");
			System.out.println("************");
			isPalindromeString("adfda");
		}
}
