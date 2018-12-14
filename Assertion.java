import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class Assertion {
	
	WebDriver driver = new ChromeDriver();
		
		@Test
		public void getTitlePage() throws InterruptedException
		{
			String title = driver.getTitle();
			Assert.assertTrue(title.contains("Rummy Online | Play Rummy Game in India at KhelPlayRummy"));
			System.out.println("Main Test");
			
		}
		@Test
		public void getTitlePage3() throws InterruptedException
		{
			String title = driver.getTitle();
			Assert.assertTrue(title.contains("Rummy Online | Play Rummy Game in India at KhelPlayRummy"));
			System.out.println("Main Test2");
			
		}
		@After
		public void getTitlepage4()
		{
			System.out.println("After the test");
			driver.quit();
		}
	    
		@Before
		public void getTitlePage2() throws InterruptedException {
			System.out.println("Before Test");
			driver.get("https://dev.khelplayrummy.com");
			Thread.sleep(500);
		}
}
