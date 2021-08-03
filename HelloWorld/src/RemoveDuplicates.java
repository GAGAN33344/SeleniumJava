
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	public static String removeDuolicates(String str) {
		int maxLen = str.length();
		Set <String> temp = new LinkedHashSet<String>();
		String[] arr = str.split(",");
		for(String s:arr) {
			temp.add(s);
		}
		String newStr = temp.toString().replace(",", "").replace("[", "").replace("]", "");
		return newStr;
	}
	
	
	public static void main(String args[]) {
		String input = "cat,0,,5,dog,cat,100,0";
		
		System.out.println("Updated String - " + removeDuolicates(input));
	
		
	}
}
