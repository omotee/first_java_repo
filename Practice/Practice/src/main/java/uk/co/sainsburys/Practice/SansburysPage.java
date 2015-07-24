package uk.co.sainsburys.Practice;

import junit.framework.Assert;

public class SansburysPage {

	
	public void homePage (){
		String message = "This is to show that my web address does not match";
		String pageTitle = "McDonald's UK :: McDonalds.co.uk";
		Assert.assertEquals(message, pageTitle, driver.getTitle());
		Assert.assertTrue(message, driver.getPageSource().contains("Privacy"));
	}
}
