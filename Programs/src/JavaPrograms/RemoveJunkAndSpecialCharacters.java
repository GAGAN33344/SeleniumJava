package JavaPrograms;

public class RemoveJunkAndSpecialCharacters {

	public static void main(String[] args) {
		String s = "!%%##&*#*$ Selenium &$**(#)#) Automation *&$$&$%* Testing";
		
		//Will use regular expression  : []
		
		s = s.replaceAll("[^a-zA-z0-9]", "");
		
		System.out.println(s);

	}

}
