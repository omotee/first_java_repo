package secondPackage;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Volvo {
	private int age;
	private String carName;
	private Scanner	myScanner = new Scanner(System.in);
	private WebDriver driver;
		
	
		public Volvo(){
			System.out.println("Enter a browser: chrome, ie, firefox");
			String browserName = myScanner.nextLine();
			
			
			if(browserName.equals("firefox")){
			this.driver = new FirefoxDriver();
			}else if(browserName.equals("chrome")){
				driver = new ChromeDriver();
			}else if (browserName.equals("ie")){
				driver = new InternetExplorerDriver();
				
			}else{
				System.out.println("Sorry you have entered the wrong option");
				}
		}
	
	
		
	public void setDetails(String carName, int age){
		this.carName = carName;
		this.age = age;
	}
		
	public void setUp(){
		System.out.println(carName);
	}
	
	
	public void tearDown(){
		System.out.println(age);
		System.out.println(carName);
	}



	public String getCarName() {
		return carName;		
	}

}
