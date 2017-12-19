package example.mercurytours.page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import bsh.Capabilities;

public class BrowserFactory {
	static WebDriver driver;
	
    
	   public static WebDriver startBrowser(String browserName, String url) throws AWTException
	   {
		   if (browserName.equals("firefox"))
		   {
			   System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
			    ProfilesIni profile = new ProfilesIni();
			    FirefoxProfile ffProfile = profile.getProfile("default"); 
			    driver = new FirefoxDriver(ffProfile);          
			    Robot robot = new Robot();
		    	robot.keyPress(KeyEvent.VK_ENTER);
		    	robot.keyRelease(KeyEvent.VK_ENTER);
		   }
		   
	   else if (browserName.equals("chrome"))
		   {   
				  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
				  driver = new ChromeDriver();
		   }
		   
		   
		   else if (browserName.equals("IE"))
		   {
			   driver = new InternetExplorerDriver();
		   }
		  
		   
		 //  driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   driver.get(url);
		   return driver; 
	   }
}
