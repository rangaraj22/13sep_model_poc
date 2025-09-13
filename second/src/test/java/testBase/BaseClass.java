package testBase;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.apache.logging.log4j.Logger;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.*;

public class BaseClass {
	
	public WebDriver driver;
	
	//public   Logger logger;
	
	@Test
	void setup()
	{
		
		//logger = LogManager.getLogger(this.getClass());
		/*
		System.out.println("starts");	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-dev-shm-usage");
		driver = new ChromeDriver(options);
*/
		System.out.println("Executed headless chrome");	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	driver.get("http://117.247.185.219:122/onepharmacy");
	driver.manage().window().maximize();	
	System.out.println("Browser maximized");	
		
	}
	
	/*
	
	@AfterClass
	void tearDown()
	{
		//driver.quit(); 
	}
	*/
	//Generate random data
	
	//Generate random string
	
	/*
	public String randomString() {
		
		String generatedString = RandomStringUtils.randomAlphabetic(5);
		return(generatedString);
	}
	//Generate random numbers
	public String randomNumber() {
		String generatedNumber = RandomStringUtils.randomNumeric(10);
		return(generatedNumber);
	}
	
	public String randomAlphanumeric() {
		String genereatedAlphanumeric = RandomStringUtils.randomAlphanumeric(5);
		return(genereatedAlphanumeric);
	}
	
	public String randomAlphaNumeric() {
		String generatestring1 = RandomStringUtils.randomAlphabetic(5);
		String generatestring2 = RandomStringUtils.randomNumeric(5);
		return(generatestring1 + "@" + generatestring2);
	}
*/
}
