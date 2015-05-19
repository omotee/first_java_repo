package firstAutomationProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstAutomation {
	static WebDriver driver = new FirefoxDriver();
	static String vehicleName = "Mercedes";
	
	

	public static void main(String[] args) {
		setUp();
		validLoginTest();
		verifyValidLogin();
		tearDown();
	}

	
	
	
	public static void validLoginTest(){
		driver.findElement(By.xpath("//*[@id='form']/header/div[1]/div/div[3]/a[3]")).click();
		driver.findElement(By.id("p_lt_ctl08_wPP_p_lt_ctl01_wPL_p_lt_ctl00_wCL_wCL_l1_wLF_Login1_UserName")).sendKeys("remeo@gmail.com");
		driver.findElement(By.id("p_lt_ctl08_wPP_p_lt_ctl01_wPL_p_lt_ctl00_wCL_wCL_l1_wLF_Login1_Password")).sendKeys("password");
		driver.findElement(By.id("p_lt_ctl08_wPP_p_lt_ctl01_wPL_p_lt_ctl00_wCL_wCL_l1_wLF_Login1_LoginButton")).click();
	}
	
	public static void verifyValidLogin(){
		if(driver.getPageSource().contains("Okeke")){
			System.out.println("You have logged in successfully!");
		}else{
			System.err.println("Failed Login, please try again!!!");
		}
	}
	
	
	public static void setUp(){
		driver.manage().window().maximize();
		driver.navigate().to("http://demostore.kenticolab.com/Home.aspx");
		System.out.println("Browser launched and ready for test!!!");
	}
	
	public static void tearDown(){
		driver.close();
		driver = null;
		System.out.println("Browser has now closed");
	}

}
