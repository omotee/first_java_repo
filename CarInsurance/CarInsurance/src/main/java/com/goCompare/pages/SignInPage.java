package com.goCompare.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage extends BasePage{

	public SignInPage(WebDriver driver) {
		super(driver);
		
	}
	public void logIn(String email, String password, String day, String month, String year){ 
		try{
			driver.findElement(By.id("Email")).sendKeys("theveryperson2002@yahoo.com");
			driver.findElement(By.id("Password")).sendKeys("carInsurance");
			driver.findElement(By.id("DateOfBirth_Day")).sendKeys("10");
			driver.findElement(By.id("DateOfBirth_Month")).sendKeys("07");
			driver.findElement(By.id("DateOfBirth_Year")).sendKeys("1990");
			driver.findElement(By.xpath("//*[@id='form0']/div[4]/input")).click();	
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void quotes(){
		driver.findElement(By.xpath("//*[@id='your-quotes-content']/div[3]/div[2]/div[3]/a[2]")).click();	
		
	}
}
