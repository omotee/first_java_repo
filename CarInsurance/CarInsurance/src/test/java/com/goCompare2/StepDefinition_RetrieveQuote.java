package com.goCompare2;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.goCompare.pages.AboutCarPage;
import com.goCompare.pages.AboutYouPage;
import com.goCompare.pages.AboutYourCoverPage;
import com.goCompare.pages.AboutYourDrivingPage;
import com.goCompare.pages.BasePage;
import com.goCompare.pages.GetQuotesPage;
import com.goCompare.pages.HomePage;
import com.goCompare.pages.PersonalDetailsPage;
import com.goCompare.pages.SignInPage;









import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition_RetrieveQuote {
	
		public WebDriver driver;
		protected HomePage homePage;
		protected BasePage basePage;
		protected PersonalDetailsPage personalDetailsPage;
		protected AboutCarPage aboutCarPage;
		protected AboutYouPage aboutYouPage;
		protected AboutYourDrivingPage aboutYourDrivingPage;
		protected AboutYourCoverPage aboutYourCoverPage;
		protected GetQuotesPage getQuotesPage;
		protected SignInPage signInPage;
//		private String email = "theveryperson2002@yahoo.com";
//		private String password = "carInsurance";
//		private String day = "10";
//		private String month = "07";
//		private String year = "1990";
		
		
		public StepDefinition_RetrieveQuote(){
		
		driver = new FirefoxDriver();
		homePage = new HomePage(driver);
		basePage = new BasePage(driver);
		personalDetailsPage = new PersonalDetailsPage(driver);
		aboutCarPage = new AboutCarPage(driver);
		aboutYouPage = new AboutYouPage(driver);
		aboutYourDrivingPage = new AboutYourDrivingPage(driver);
		aboutYourCoverPage = new AboutYourCoverPage(driver);
		getQuotesPage = new GetQuotesPage(driver);
		signInPage = new SignInPage(driver);
		}
		
		
		@Before
		public void startTest(){
			basePage.setUp();
		}
		
		@After
		public void finishTest(){
			basePage.tearDown();
		}

	

	@Given("^that a customer is on the application homepage \"(.*?)\"$")
	public void that_a_customer_is_on_the_application_homepage(String homeText) throws Throwable {
		homePage.verifyPresenceOf(homeText);
	}
	
	@When("^he enters his details using email as \"(.*?)\" password as \"(.*?)\" and dob as day \"(.*?)\", month \"(.*?)\", \"(.*?)\"$")
	public void he_enters_his_details_using_email_as_password_as_and_dob_as_day_month(String email, String password, String day, String month, String year) throws Throwable {
		getQuotesPage.pullMyQuote();
		signInPage.logIn(email, password, day, month, year);
	}
	
	@Then("^he should be taken to quotes page \"(.*?)\"$")
	public void he_should_be_taken_to_quotes_page(String quotes) throws Throwable {
		homePage.verifyPresenceOf(quotes);
	}
	

}
