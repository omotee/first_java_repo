package com.goCompare.pages;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;


public class BasePage {
	
	protected WebDriver driver;
	String base_url = "http://www.gocompare.com";
	protected static Logger logger = LogManager.getLogger("TayoLog4J");
	
	public BasePage(WebDriver driver){
		this.driver = driver;
	}
	
	public void setUp(){
		try{
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);//used so that the web browser will wait for 15 sec in case of any failures b4 continue to max
			logger.info("Imlicit wait has commenced and will do for 15 seconds");
			driver.manage().window().maximize();
			logger.info("Window has been maximized");
			driver.get(base_url);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	public void tearDown(){
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
			e.printStackTrace();
	}
		driver.quit();
		driver = null;
	}


}
