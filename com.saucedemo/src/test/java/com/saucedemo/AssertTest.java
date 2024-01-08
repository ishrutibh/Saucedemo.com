package com.saucedemo;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertTest {

	public WebDriver driver;
	@Test
	public void LaunchFacebook() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("Shrutirrrrrrrrrrrrrrrrrr",Keys.ENTER);
		//driver.findElement(By.id("loginbutton")).click();
		/*5 things 1. verify the browser title 
		2. URL,
		3 textb feild is empty 
		4. text feild is becoming red or not 
		5. error message */
		
		Thread.sleep(1000);
		//Title Assertion (Hard assertion)
		
		String actualtitle=driver.getTitle();
		String expectedtitle="Log in to Facebook";
		assertEquals(actualtitle,expectedtitle,"Title mismatch");
		
		//URL Assertion
		
		String actualURL=driver.getCurrentUrl();
		String expectedURL="https://www.facebook.com/login";
		assertEquals(actualURL,expectedURL,"URL mismatch");
		
		//Text Assertion
		
		String actualText=driver.findElement(By.name("email")).getAttribute("value");
		String expectedText="";
		assertEquals(actualText,expectedText,"text is mismatch");
		
		//border Assertion
		String actualBorder=driver.findElement(By.name("email")).getCssValue("border");
		String expectedBorder="1px solid rgb(240, 40, 73)";
		assertEquals(actualBorder,expectedBorder,"Border is mismatch");
		
		//Error Assertion
				String actualErrorMessage=driver.findElement(By.xpath("//div[@id='email_container']/div[2]")).getText();
				String expectedErrorMessage="The email address or mobile number you entered isn't connected to an account.";
				assertEquals(actualErrorMessage,expectedErrorMessage,"Error messagee is mismatch");
		
		
	}
}
