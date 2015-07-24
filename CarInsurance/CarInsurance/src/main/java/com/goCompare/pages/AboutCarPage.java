package com.goCompare.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AboutCarPage extends BasePage{

	public AboutCarPage(WebDriver driver) {
		super(driver);
	}

	public void carDetails(){
		try{
			WebElement element = driver.findElement(By.id("AboutTheCarViewModel_AboutTheCar_KnowRegNo_true"));
		if(element.isSelected()){
			System.out.println("Hello Test Analyst,This has already been Selected");
		}else{
			element.click();
		}
			driver.findElement(By.id("AboutTheCarViewModel_AboutTheCar_Registration")).sendKeys("YT06NEF");
			driver.findElement(By.id("vehicle-find-by-registration-button")).click();
			
			WebElement element2 = driver.findElement(By.id("AboutTheCarViewModel_AboutTheCar_DetailsAreCorrect_true"));
			if(element2.isSelected()){
				System.out.println("Hello Test Analyst,This has already been Selected");
			}else{
				element2.click();
			}
			WebElement element3 = driver.findElement(By.id("AboutTheCarViewModel_AboutTheCar_AnyModifications_false"));
			if(element3.isSelected()){
				System.out.println("Hello Test Analyst,This has already been Selected");
			}else{
				element3.click();
			}
			driver.findElement(By.id("AboutTheCarViewModel_AboutTheCar_EstimatedValue")).sendKeys("4500");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void ownAndUseCar(){
		try{
			WebElement element4 = driver.findElement(By.id("UseOfCar_DatePurchased_NotBought"));
			if(element4.isSelected()){
				System.out.println("Hello Test Analyst,This has already been ticked");
			}else{
				element4.click();
			}
			WebElement element5 = driver.findElement(By.id("UseOfCar_IsLegalOwner_true"));
			if(element5.isSelected()){
				System.out.println("Hello Test Analyst,This has already been ticked");
			}else{
				element5.click();
			}
			WebElement element6 = driver.findElement(By.id("UseOfCar_IsRegisteredKeeper_true"));
			if(element6.isSelected()){
				System.out.println("Hello Test Analyst,This has already been ticked");
			}else{
				element6.click();
			}
			
			WebElement tayo = driver.findElement(By.id("UseOfCar_ClassOfUse"));
			Select carUse = new Select(tayo);
			carUse.selectByValue("SocialDomesticPleasure");
			
			WebElement tayo2 = driver.findElement(By.id("UseOfCar_ParkedOvernight"));
			Select carUse2 = new Select(tayo2);
			carUse2.selectByValue("OnADriveway");
			
			WebElement tayo3 = driver.findElement(By.id("UseOfCar_Mileage"));
			Select carUse3 = new Select(tayo3);
			carUse3.selectByValue("Upto5000");
			
			WebElement element7 = driver.findElement(By.id("UseOfCar_DriveDuringPeakTimes_false"));
			if(element7.isSelected()){
				System.out.println("Hello Test Analyst,This has already been ticked");
			}else{
				element7.click();
			}
			driver.findElement(By.xpath("//*[@id='vehicle-form']/div[3]/input")).click();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
	
	
		

