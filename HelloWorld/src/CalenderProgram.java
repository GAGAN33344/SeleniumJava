import java.text.SimpleDateFormat;
import java.util.Calendar;
/*
 Calendar class have some extra features than Date class
 */


public class CalenderProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar cal =Calendar.getInstance();// create the calendar object
		System.out.println(cal.getTime());// this method print the current day,date, time
		// same as Date Class method.
		
		
		SimpleDateFormat sfd = new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		System.out.println(sfd.format(cal.getTime()));
		
		System.out.println(cal.get(cal.DAY_OF_MONTH));
		System.out.println(cal.get(cal.DAY_OF_WEEK));
		System.out.println(cal.get(cal.HOUR));
		
	//There are lots of methods in calendar class.	
	}

}
