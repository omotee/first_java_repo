package com.goCompare.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AboutYouPage extends BasePage{

	public AboutYouPage(WebDriver driver) {
		super(driver);
		}

	public void driverDetails(){
		try{
			
			WebElement carDriver = driver.findElement(By.id("Customer_Salutation"));
			Select myCar = new Select(carDriver);
			myCar.selectByValue("Mr");
					
			WebElement carDriver2 = driver.findElement(By.id("Customer_MaritalStatus"));
			Select myCar2 = new Select(carDriver2);
			myCar2.selectByValue("Married");
			
			WebElement element = driver.findElement(By.id("Customer_UKResidentFrom_Birth"));
			if(element.isSelected()){
			String message = "Hi Tester this option has been selected";
			System.out.println(message);
		}else{
			element.click();
		}
			driver.findElement(By.id("Customer_MainTelNo_FullNumber")).sendKeys("075468321");
			
			WebElement element2 = driver.findElement(By.id("Customer_Homeowner_false"));
			if(element2.isSelected()){
			String message = "Hi Tester this option has been selected";
			System.out.println(message);
		}else{
			element2.click();
		}
			WebElement carDriver3 = driver.findElement(By.id("Customer_NoOfChildrenUnder16"));
			Select myCar3 = new Select(carDriver3);
			myCar3.selectByValue("Two");
			
			WebElement carDriver4 = driver.findElement(By.id("Customer_CustomerHook"));
			Select myCar4 = new Select(carDriver4);
			myCar4.selectByValue("4");
			
			}catch(Exception e){
			e.printStackTrace();
		}
	}
	public void addressDetails(){
		try{
			driver.findElement(By.id("postcodeentry")).sendKeys("SE2 9SJ");
			driver.findElement(By.id("postcodesubmit")).click();
			
			WebElement carDriver6 = driver.findElement(By.id("Address_Moniker"));
			Select myCar6 = new Select(carDriver6);
			myCar6.selectByValue("0EOGBRFAPfBwEDAQAAAAFvQl7AAAAAADI3AGQA");
			
			WebElement element3 = driver.findElement(By.id("Address_OvernightPostalCodeSame_true"));
			if(element3.isSelected()){
			}else{
				element3.click();
			}
			driver.findElement(By.id("Address_CarsInHousehold")).sendKeys("1");
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public void occupationDetals() {
		try{
			WebElement carDriver5 = driver.findElement(By.id("Occupation_EmploymentStatus"));
			Select myCar5 = new Select(carDriver5);
			myCar5.selectByValue("Employed");
			
			driver.findElement(By.id("Occupation_FullTimeOccupationAutoDescription")).sendKeys("Technical Analyst");
			driver.findElement(By.id("Occupation_FullTimeBusinessAutoDescription")).sendKeys("Information Technology");
			WebElement element4 = driver.findElement(By.id("Occupation_HasPartTimeEmployment_false"));
			if(element4.isSelected()){
			}else{
				element4.click();
			}
			driver.findElement(By.xpath("//*[@id='form0']/div[4]/input")).click();
			
		}catch(Exception e){
			e.printStackTrace();
			//
		}
		
	}
}
