package com.goCompare.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GetQuotesPage extends BasePage {

	public GetQuotesPage(WebDriver driver) {
		super(driver);
		
	}
	public void pullMyQuote(){
		driver.findElement(By.xpath("//*[@id='headerBandContainer']/div[1]/div/div[1]/p[3]/a[2]/img")).click();
	}
}
