package ExcelDriven;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.ArrayList;



public class DataDrivenTest extends DataDriven {

	@Test
	public void GrabData() throws IOException
	{

		ArrayList<String> ExcelData =getData("DeleteProfile");
		System.out.println(ExcelData.get(0));
		System.out.println(ExcelData.get(1));
		System.out.println(ExcelData.get(2));
		System.out.println(ExcelData.get(3));
	}
	
}
