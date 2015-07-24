package com.goCompare.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
	
	public HomePage(WebDriver driver) {
		super(driver);
		
	}

	public void verifyPresenceOf(String homeText){
		try{
			String mesage = "The page you are looking for does not exist";
			Assert.assertTrue(mesage, driver.getPageSource().contains(homeText));
		
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public void startNewQuote(){
		 try{
			 driver.findElement(By.xpath("//*[@id='headerBandContainer']/div[1]/div/div[1]/p[3]/a[1]/img")).click();
				 
		 }catch(Exception e){
			 e.printStackTrace();
		 }
		 
	 }
	
//	public void checkIn(){
//		 try{
//			 driver.findElement(By.xpath("//*[@id='headerBandContainer']/div[1]/div/div[1]/p[3]/a[2]/img")).click();	
//			 driver.findElement(By.id("Password")).sendKeys("carInsurance");
//	 
//		 }catch(Exception e){
//			 e.printStackTrace();
//		 }
//		 
//	 }
}
