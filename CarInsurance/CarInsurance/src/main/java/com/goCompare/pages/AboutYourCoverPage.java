package com.goCompare.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AboutYourCoverPage extends BasePage {

	public AboutYourCoverPage(WebDriver driver) {
		super(driver);
		
	}
	
	public void policyCover(){
		WebElement cover = driver.findElement(By.id("Cover_TypeOfCover"));
		Select myCover = new Select(cover);
		myCover.selectByValue("Comprehensive");
		
		driver.findElement(By.id("Cover_CoverStartDay")).sendKeys("01");
		driver.findElement(By.id("Cover_CoverStartMonth")).sendKeys("08");
		driver.findElement(By.id("Cover_CoverStartYear")).sendKeys("2015");
		
		WebElement cover2 = driver.findElement(By.id("Cover_VoluntaryExcess"));
		Select myCover2 = new Select(cover2);
		myCover2.selectByValue("TwoFifty");
		
		WebElement specialTerms = driver.findElement(By.id("Cover_AnyInsuranceDeclined_false"));
		if(specialTerms.isSelected()){
			System.out.println("it has been seelected");
		}else{
			specialTerms.click();
			
			WebElement policyPayment = driver.findElement(By.id("Cover_PolicyPaymentMethod_Monthly"));
			if(policyPayment.isSelected()){
				System.out.println("it has been seelected");
			}else{
				policyPayment.click();
			}
		
		}
		}
	public void securityAndSignInDetails(){//String Password
		try{
			driver.findElement(By.id("Security_Password")).sendKeys("carInsurance");
			driver.findElement(By.id("Security_PasswordConfirmation")).sendKeys("carInsurance");
			driver.findElement(By.id("Security_PasswordClue")).sendKeys("Insurance");
			driver.findElement(By.id("Security_MothersMaidenName")).sendKeys("Mama Ray");
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void rightCover(){
		WebElement rightcvr = driver.findElement(By.id("OptOut_True"));
		if(rightcvr.isSelected()){
			System.out.println("it has been seelected");
		}else{
			rightcvr.click();
		}
		}
		public void renewalContact(){
			WebElement rc = driver.findElement(By.id("CrossSellQuestion_InterestedInHome_false"));
			if(rc.isSelected()){
				System.out.println("it has been seelected");
			}else{
				rc.click();
				driver.findElement(By.xpath("//*[@id='form0']/div[6]/input")).click();
			}

	}
	
	}

