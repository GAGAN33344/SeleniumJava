package Beta;

import org.testng.annotations.Test;
import org.apache.logging.log4j.*;
import org.testng.annotations.Test;

public class Demo1 {

	private static Logger log = LogManager.getLogger(Demo1.class.getName());
	
	@Test
	public void Log1()
	{
		
		log.debug("click on email");
		log.info("Email is Displayed");
		log.error("I am failed to click on email link");
		log.fatal("Email is missing");
	
	}
	
	
	
}
