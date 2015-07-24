package sainsburys.test;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;

public class MyTest {

	private static WebDriver driver;
	public String currentUrl = "http://www.mcdonalds.co.uk/ukhome.html";


	
	
	public void setUp() {
		driver = new WebDriver();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(currentUrl);
		}
	
	

	public void tearDown() {
		driver.close();
	
	}
}
