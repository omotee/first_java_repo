package com.goCompare.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.goCompare.pages.BasePage;

public class Screenshot extends BasePage {
	// There is need to extend the BasePage so all other pages can use the
	// method in screenshot class when taking shot
	public Screenshot(WebDriver driver) {
		super(driver);

	}

//	public void takeshot() {
//		scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  
//    	try {
//    		FileUtils.copyFile(scrFile, new File("C:\\Users\\EDWIN\\Desktop\\eCommerceBAT\\src\\main\\resources\\screenshots\\" + screenName + ".png"));
//    	}catch (IOException e1) {
//    		e1.printStackTrace();
//    	} 
//	}
}
