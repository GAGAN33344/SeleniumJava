package ExcelDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {
	
	
	public ArrayList<String> getData(String testcasename) throws IOException
	{
		ArrayList<String> al = new ArrayList<String>();	
		
		
        FileInputStream Excel= new FileInputStream("/Users/GaGaNmAnn/Desktop/DataDriven.xlsx");
        //Excel object have access to read the file at given location and store in Excel object.
		XSSFWorkbook workbook = new XSSFWorkbook(Excel);
		// this class is available in Apache POI
		//i will pass the object in XSSFWorkbook class argument.who have the power to read the file 
	    //Now workbook object have knowledge of excel sheet location.
		
		int sheets=workbook.getNumberOfSheets();//this line of tell us total number of sheets.
		System.out.println("Number of sheets are " + sheets);
		for(int i=0; i<sheets; i++)
		{
			if(workbook.getSheetName(i).equalsIgnoreCase("testdata"))
			{
				XSSFSheet sheet=workbook.getSheetAt(i);//this line of code get the sheet
				String a=sheet.getSheetName();//this line of code get the name of sheet
				System.out.println("I grab the " + a + " Sheet");//print the name of sheet
		//Now i will identify the test column by scanning the entire 1st row
			 Iterator<Row> row =sheet.iterator();//Sheet is the collection of rows
			 Row firstrow = row.next();
		       
			 Iterator<Cell> cell =firstrow.cellIterator();//row is the collection of cells.
			 int k=0;
			 int column=0;
			 while(cell.hasNext())
			 {
				Cell value= cell.next();
				if(value.getStringCellValue().equalsIgnoreCase("TestCase"))
                  {
	                       column = k;
                  }
				k++;
			 }
		 	System.out.println("Testcase Keyword is placed on " + column + " Index");
	// once column is identified then i will scan entire testcase column to identify 
		 	//purchase testcase row.
		 	
		 	while(row.hasNext()) 
		 	{
		 		Row r =row.next();
		 		if(r.getCell(column).getStringCellValue().equalsIgnoreCase(testcasename))
		 		{
		 			
		 //After grabing the purchase testcase row--pull all the data of that row and feed
		 			//into test.
		 			Iterator<Cell> cv =r.cellIterator();
		 			while(cv.hasNext())
		 			{
		 				//String PRD =cv.next().getStringCellValue();
		 				//System.out.println(PRD);
		 	//Now i will store this data into ArrayList and send to test case.
		 		    Cell c= cv.next();		
		 				if(c.getCellTypeEnum()==CellType.STRING)
		 				{
		 					  al.add(c.getStringCellValue());
		 				}
		 				else {
		 				String d = NumberToTextConverter.toText(c.getNumericCellValue());
		 					  al.add(d);
		 				}
		 			}
		 			
		 		}
		 	}
				
				
			}
			
			
		}
		return al;
		
	}
	
	
	public static void main(String[] args) throws IOException {
	
		
	}

}
