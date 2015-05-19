package firstAutomationProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstThing {
	static WebDriver driver = new FirefoxDriver();

	public static void main(String[] args) {
		driver.manage().window().maximize();
		driver.navigate().to("http://demostore.kenticolab.com/Home.aspx");
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//*[@id='form']/header/div[1]/div/div[3]/a[3]")).click();
		driver.findElement(By.id("p_lt_ctl08_wPP_p_lt_ctl01_wPL_p_lt_ctl00_wCL_wCL_l1_wLF_Login1_UserName")).sendKeys("remeo@gmail.com");
		driver.findElement(By.id("p_lt_ctl08_wPP_p_lt_ctl01_wPL_p_lt_ctl00_wCL_wCL_l1_wLF_Login1_Password")).sendKeys("password");
		driver.findElement(By.id("p_lt_ctl08_wPP_p_lt_ctl01_wPL_p_lt_ctl00_wCL_wCL_l1_wLF_Login1_LoginButton")).click();
		driver.close();
		driver = null;
		driver.manage().window().maximize();
		driver.navigate().to("http://demostore.kenticolab.com/Home.aspx");
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//*[@id='form']/header/div[1]/div/div[3]/a[3]")).click();
		driver.findElement(By.id("p_lt_ctl08_wPP_p_lt_ctl01_wPL_p_lt_ctl00_wCL_wCL_l1_wLF_Login1_UserName")).sendKeys("remeo@gmail.com");
		driver.findElement(By.id("p_lt_ctl08_wPP_p_lt_ctl01_wPL_p_lt_ctl00_wCL_wCL_l1_wLF_Login1_Password")).sendKeys("password");
		driver.findElement(By.id("p_lt_ctl08_wPP_p_lt_ctl01_wPL_p_lt_ctl00_wCL_wCL_l1_wLF_Login1_LoginButton")).click();
		driver.close();
		driver = null;
		driver.manage().window().maximize();
		driver.navigate().to("http://demostore.kenticolab.com/Home.aspx");
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//*[@id='form']/header/div[1]/div/div[3]/a[3]")).click();
		driver.findElement(By.id("p_lt_ctl08_wPP_p_lt_ctl01_wPL_p_lt_ctl00_wCL_wCL_l1_wLF_Login1_UserName")).sendKeys("remeo@gmail.com");
		driver.findElement(By.id("p_lt_ctl08_wPP_p_lt_ctl01_wPL_p_lt_ctl00_wCL_wCL_l1_wLF_Login1_Password")).sendKeys("password");
		driver.findElement(By.id("p_lt_ctl08_wPP_p_lt_ctl01_wPL_p_lt_ctl00_wCL_wCL_l1_wLF_Login1_LoginButton")).click();
		driver.close();
		driver = null;
		driver.manage().window().maximize();
		driver.navigate().to("http://demostore.kenticolab.com/Home.aspx");
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//*[@id='form']/header/div[1]/div/div[3]/a[3]")).click();
		driver.findElement(By.id("p_lt_ctl08_wPP_p_lt_ctl01_wPL_p_lt_ctl00_wCL_wCL_l1_wLF_Login1_UserName")).sendKeys("remeo@gmail.com");
		driver.findElement(By.id("p_lt_ctl08_wPP_p_lt_ctl01_wPL_p_lt_ctl00_wCL_wCL_l1_wLF_Login1_Password")).sendKeys("password");
		driver.findElement(By.id("p_lt_ctl08_wPP_p_lt_ctl01_wPL_p_lt_ctl00_wCL_wCL_l1_wLF_Login1_LoginButton")).click();
		driver.close();
		driver .quit();
	}
	
		
	
	public int add(int a, int b){
		int result = a * b;
		return result;
	}

}
