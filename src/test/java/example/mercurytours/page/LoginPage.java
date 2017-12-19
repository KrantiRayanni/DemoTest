package example.mercurytours.page;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

WebDriver driver;
	
    @FindBy(name="userName")
    WebElement username;
 
    @FindBy(name="password")
    WebElement password;
    
    @FindBy(name="login")
    WebElement signIn;
    
    @FindBy(linkText="SIGN-OFF")
    WebElement signOff;
 
   
 
     public LoginPage(WebDriver driver){
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
       }
 
            //Set user name in textbox
            public void setUserName(String userid)
            {
            username.sendKeys(userid);
            }
 
           //Set password in password textbox
           public void setPassword(String pass)
           {
           password.sendKeys(pass);
           }
 
           //Click on login button
           public void clickOnLogintoProceed()
           {
            signIn.click();
           }
           public void clickOnSignOff()
           {
            signOff.click();
           }
    
          //Get the title of Login Page
         /* public String LoginTitle()
          {
          return    hometitle.getText();
          }*/
 
    /**
 
     * This POM method will be exposed in test case to login in the application
 
     * @param strUserName
 
     * @param strPasword
 
     * @return
 
     */
 
    public void loginToMercuryTours(String userid,String pass){
 
        username.sendKeys(userid);
        password.sendKeys(pass);
        signIn.click();
    
        
 
    }

}
