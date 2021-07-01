package WayFair;



import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Object_Repository.Element_Searching_Page;
import Object_Repository.Landing_Page;
import Object_Repository.Wall_Mirror_Page;
import WayFairUtility.Base;

public class Landing_PageTest {
	
	@BeforeClass
	public void launch_browser()
	{
		Base.launch("chrome","https://www.wayfair.com");
	}
	@Test
	public void pillow_validation() throws InterruptedException
	{
		
		
		Landing_Page lp = new Landing_Page();
		/*if(lp.PopUpSize()>0)
		{
			lp.getPopUp().click();
		}*/
        // OR
     	lp.getPopUp().click();
		
		lp.pillowValidation().click();	 
	}
	
	
	@Test(dependsOnMethods= {"pillow_validation"})
	public void itemSearching_Page() throws InterruptedException
	{
		Element_Searching_Page s =new Element_Searching_Page();
		s.Mirror().click();
		
		Wall_Mirror_Page w = new Wall_Mirror_Page();
		w.clickonShape().click();
		w.clickonframe_finish().click();
		w.clickonDimensions().click();
		w.clickonprice_per_item().click();
		w.clickonfeatures().click();
		w.clickondoor().click();
		
	    w.get_title();
	}
	
	
	@AfterClass
	public void closeBrowser()
	{
		//Base.close();
	}
	
	
	
}

