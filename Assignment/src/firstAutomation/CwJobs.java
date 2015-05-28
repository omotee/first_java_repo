package firstAutomation;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CwJobs {
	private static String name = "Tayo";
	private static String secondName = "Babalola";
	private static String mailbox = "tayo_babalola@outlook.com";
	protected static WebDriver driver;
	private static String base_url =  "http://www.cwjobs.co.uk";
	
		public CwJobs(){
			 driver = new FirefoxDriver();
		}
	
	
	public static void register(){
		driver.manage().window().maximize();
		driver.get(base_url);
		driver.findElement(By.xpath("//*[@id='navbar-user-personalisation']/ul/li[1]/a")).click();
		
		}
	
	public static void personalDetails(){
		driver.findElement(By.id("firstname")).sendKeys(name);
		driver.findElement(By.id("surname")).sendKeys(secondName);
		driver.findElement(By.id("email")).sendKeys(mailbox);
		
	}
	
	public static void logInDetails(){
		driver.findElement(By.id("password")).sendKeys("omotayo1");
		driver.findElement(By.id("confirmpassword")).sendKeys("omotayo1");	
		
		WebElement select = driver.findElement(By.id("mjnahsdvbjdbjbv"));
		Select t = new Select(select);
		t.selectByVisibleText("Mazda");
		Assert.assertTrue(driver.getPageSource().endsWith("come"));
	}
	
	
	
	
	
}
