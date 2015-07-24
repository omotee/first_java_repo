package com.goCompare.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


		public class PersonalDetailsPage extends BasePage{
		private String name1 = "Tayo";
		private String surname = "Babalola";
		private String email = "theveryperson2002@yahoo.com";
		
		public PersonalDetailsPage(WebDriver driver) {
		super(driver);
		}

	public void completeForm(){
		 try{
			String forename = "Customer_FirstName";
			String secondname = "Customer_Surname";
			String day = "Customer_DateOfBirth_Day";
			String month = "Customer_DateOfBirth_Month";
			String year = "Customer_DateOfBirth_Year";
			driver.findElement(By.id(forename)).sendKeys(name1);
			driver.findElement(By.id(secondname)).sendKeys(surname);
			driver.findElement(By.id(day)).sendKeys("10");
//			WebElement webElement = driver.findElement(By.id(id))("");
//			webElement.sendKeys(Keys.TAB);
			driver.findElement(By.id(month)).sendKeys("07");// Hardcoded because dont expect date of birth to change, subject to me changing it as instructed by boss
			driver.findElement(By.id(year)).sendKeys("1990");
			driver.findElement(By.id("Customer_Email")).sendKeys(email);
			driver.findElement(By.id("Customer_EmailConfirmation")).sendKeys(email); 
			driver.findElement(By.xpath("//*[@id='form0']/div[4]/div[1]/input")).click();
			
				 
		 }catch(Exception e){
			 e.printStackTrace();
		 }
	}
}

//		WebElement webElement = driver.findElementByXPath("");
//		webElement.sendKeys(Keys.TAB);
//		webElement.sendKeys(Keys.ENTER)