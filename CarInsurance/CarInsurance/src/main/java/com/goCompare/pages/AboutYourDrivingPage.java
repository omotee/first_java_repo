package com.goCompare.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AboutYourDrivingPage extends BasePage{

	public AboutYourDrivingPage(WebDriver driver) {
		super(driver);
		//DrivingLicenceNumberPanel_Provided_false
	}
	public void LicenseInfo(){
		try{
		WebElement license = driver.findElement(By.id("YourDriving_LicenceType"));
		Select myLicense = new Select(license);
		myLicense.selectByValue("UKFull");
		
		WebElement license2 = driver.findElement(By.id("YourDriving_LicenceLength_Years"));
		Select myLicense2 = new Select(license2);
		myLicense2.selectByValue("Two");
		
		WebElement cac4 = driver.findElement(By.id("YourDriving_HasIAM_false"));
		if(cac4.isSelected()){
			System.out.println("Hello, this option has been selected");
		}else{
			cac4.click();
		}
		
		WebElement license3 = driver.findElement(By.id("YourDriving_MedicalConditions"));
		Select myLicense3 = new Select(license3);
		myLicense3.selectByValue("No");
		
		WebElement license4 = driver.findElement(By.id("YourDriving_NoClaimsBonus"));
		Select myLicense4 = new Select(license4);
		myLicense4.selectByValue("TwoYears");
		
		WebElement license5 = driver.findElement(By.id("YourDriving_OtherVehicles"));
		Select myLicense5 = new Select(license5);
		myLicense5.selectByValue("No");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public void licenseNumber(){
		WebElement cac5 = driver.findElement(By.id("DrivingLicenceNumberPanel_Provided_false"));
		if(cac5.isSelected()){
			System.out.println("Hello, this option has been selected");
		}else{
			cac5.click();
		}
	}
	public void claimsAndConvictions(){
		WebElement cac = driver.findElement(By.id("ClaimsConvictions_AccidentsInLastFiveYears_false"));
		if(cac.isSelected()){
			System.out.println("Hello, this option has been selected");
		}else{
			cac.click();
					
			WebElement cac2 = driver.findElement(By.id("ClaimsConvictions_ConvictionsInLastFiveYears_false"));
			if(cac2.isSelected()){
				System.out.println("Hello, this option has been selected");
			}else{
				cac2.click();
			}
		}
		WebElement cac3 = driver.findElement(By.id("ClaimsConvictions_UnspentNonMotoringConvictions_false"));
		if(cac3.isSelected()){
			System.out.println("Hello, this option has been selected");
		}else{
			cac3.click();
		}
		driver.findElement(By.xpath("//*[@id='driver-form']/div[5]/input")).click();
		
	}
}
