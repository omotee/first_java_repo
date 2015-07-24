//package com.goCompare2;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Ignore;
//import org.junit.Test;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//import com.goCompare.pages.AboutCarPage;
//import com.goCompare.pages.BasePage;
//import com.goCompare.pages.HomePage;
//import com.goCompare.pages.PersonalDetailsPage;
//import com.goCompare.pages.AboutYouPage;
//import com.goCompare.pages.AboutYourCoverPage;
//import com.goCompare.pages.AboutYourDrivingPage;
//import com.goCompare.pages.GetQuotesPage;
//import com.goCompare.pages.SignInPage;
//
//
//public class TestGoCompare {
//	public WebDriver driver;
//	protected HomePage homePage;
//	protected BasePage basePage;
//	protected PersonalDetailsPage personalDetailsPage;
//	protected AboutCarPage aboutCarPage;
//	protected AboutYouPage aboutYouPage;
//	protected AboutYourDrivingPage aboutYourDrivingPage;
//	protected AboutYourCoverPage aboutYourCoverPage;
//	protected GetQuotesPage getQuotesPage;
//	protected SignInPage signInPage;
//	private String email = "theveryperson2002@yahoo.com";
//	private String password = "carInsurance";
//	private String day = "10";
//	private String month = "07";
//	private String year = "1990";
//	
//		
//	@Before
//	public void startTest(){
//		basePage.setUp();
//	}
//	
//	@After
//	public void finishTest(){
//		basePage.tearDown();
//	}
//		public TestGoCompare(){
//		driver = new FirefoxDriver();
//		homePage = new HomePage(driver);
//		basePage = new BasePage(driver);
//		personalDetailsPage = new PersonalDetailsPage(driver);
//		aboutCarPage = new AboutCarPage(driver);
//		aboutYouPage = new AboutYouPage(driver);
//		aboutYourDrivingPage = new AboutYourDrivingPage(driver);
//		aboutYourCoverPage = new AboutYourCoverPage(driver);
//		getQuotesPage = new GetQuotesPage(driver);
//		signInPage = new SignInPage(driver);
//		
//		}
//		
//@Ignore
//@Test
//	public void newQuote(){
//	homePage.verifyHomePage();
//	homePage.startNewQuote();
//	personalDetailsPage.completeForm();
//	aboutCarPage.carDetails();
//	aboutCarPage.ownAndUseCar();
//	aboutYouPage.driverDetails();
//	aboutYouPage.addressDetails();
//	aboutYouPage.occupationDetals();
//	aboutYourDrivingPage.LicenseInfo();
//	aboutYourDrivingPage.licenseNumber();
//	aboutYourDrivingPage.claimsAndConvictions();
//	aboutYourCoverPage.policyCover();
//	aboutYourCoverPage.securityAndSignInDetails();
//	aboutYourCoverPage.rightCover();
//	aboutYourCoverPage.renewalContact();
//	
//		}
//	
//@Test
//public void retrieveQuote(){
//	homePage.verifyHomePage();
//	getQuotesPage.pullMyQuote();
//	signInPage.logIn(email, password, day, month, year);
//	
//}
//}
