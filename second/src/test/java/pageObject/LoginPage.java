package pageObject;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	public WebDriverWait wait ;
	
	//Elements
	
	 @FindBy(name="username" ) WebElement username;
	
	 @FindBy(name = "password") WebElement password;
	 
	 @FindBy(xpath = "/html/body/pharma-root/pharma-login-layout/pharma-signin/div/div/form/div[2]/div[3]/button")
	 WebElement loginbutton;
	 
	 @FindBy(xpath = "//*[@id=\"location7\"]/div[2]/span") WebElement selectlocation;
	 
	 //Action method to send value to user name
	public void SetUserName(String loginusername)
	{
		System.out.println("Reach LoginPage.Java");
		username.sendKeys(loginusername);
		wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		System.out.println("user name passed");
		wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	
	}
	//Action method to send value to password
	public void setPassword(String loginpassword)
	{
		password.sendKeys(loginpassword);
		//password.submit();
		System.out.println("pwd name passed");
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}
	
	//Action method to click on login button
	public void ClickOnLoginButton()
	{
		wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		System.out.println("Going to click login button");
		loginbutton.click();
		
		//   WebElement changePasswordDialog = wait.until(
	          //      ExpectedConditions.presenceOfElementLocated(By.id("changePasswordDialog"))); // Replace with the actual dialog locator
	            

	            // Find and click the close button
	         //   WebElement closeButton = changePasswordDialog.findElement(By.className("closeButton")); // Replace with the actual close button locator
	       //    
	        //    closeButton.click();
		//
	           // Alert alert = driver.switchTo().alert();
	         //   alert.accept();
	}
	
	public void locationselection()
	{
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		selectlocation.click();
	}
}
