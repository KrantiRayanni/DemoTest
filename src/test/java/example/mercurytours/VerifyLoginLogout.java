package example.mercurytours;

import java.awt.AWTException;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import example.mercurytours.page.BrowserFactory;
import example.mercurytours.page.LoginPage;




public class VerifyLoginLogout  {
	static WebDriver driver;
	
	  @Test
	   public void checkValidUser() throws AWTException 
	   {
		  System.out.println("Opening Mercury Tour Site..");
		  WebDriver driver = BrowserFactory.startBrowser("chrome", "http://newtours.demoaut.com/");
		 // System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");

		  /*System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("http://newtours.demoaut.com/");	 
	 	  driver.findElement(By.name("userName")).sendKeys("kranti");*/
		   
		  LoginPage  login = PageFactory.initElements(driver, LoginPage.class);
		  System.out.println("Continue Login..");
	 	  login.loginToMercuryTours("kranti", "kranti"); 
	 	  System.out.println("Login Complete..");
	 	  System.out.println("Title="+driver.getTitle());
	 	  login.clickOnSignOff();
	 	  System.out.println("User logged off..");
	 	  driver.quit();

}
		 
}