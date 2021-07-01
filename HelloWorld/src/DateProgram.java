import java.text.SimpleDateFormat;
import java.util.Date;

public class DateProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date d = new Date();// This is date class, come from util package.
		System.out.println(d.toString());// toString method present in date class,
		//which one we can use to retrieve the day,month,year and time
		
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");//  This is SimpleDateFormat class, come from text package.
		// we have to pass the format in this class which we want.
		
		System.out.println(sdf.format(d));
		
		SimpleDateFormat sd = new SimpleDateFormat("M/d/yyyy hh:mm:ss" );
		System.out.println(sd.format(d));
	}

}
