package Alpha;

import org.testng.annotations.Test;
import org.apache.logging.log4j.*;

public class Demo {

	private static Logger log = LogManager.getLogger(Demo.class.getName());
	
	@Test
	public void Log1()
	{
		
		log.debug("click on email");
		log.info("Email is Displayed");
		log.error("I am failed to click on email link");
		log.fatal("This is Fatal");
		
		
	}
	
	
	
}
