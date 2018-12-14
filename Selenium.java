import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
	
	public static void main(String[] args) throws InterruptedException {
	
		//String exePath = "D:\\ChromeDriver2\\chromedriver.exe";
		//System.setProperty("webdriver.chrome.driver", exePath);
		
		System.out.println("hn1");
		WebDriver driver = new ChromeDriver();
		System.out.println("hn3");
		driver.get("https://dev.khelplayrummy.com");
		Thread.sleep(500);
		driver.get("https://uat.khelplayrummy.com");
		Thread.sleep(500);
		driver.navigate().to("https://dev.khelplayrummy.com");
		Thread.sleep(500);
		driver.navigate().back();
		Thread.sleep(500);
		driver.navigate().forward();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String a = driver.getPageSource();
		System.out.println(a);
		driver.close();
	}
}