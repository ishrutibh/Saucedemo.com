package com.saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchApp {

	@Test
	public void GoogleLaunch()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.id("APjFqb")).sendKeys("Amazon",Keys.ENTER);
	//Assertion
		String expectedtitle="Amazon - Google Search";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(expectedtitle,actualTitle,"Title is mismatch");
		// to reduce code we can remove Assert. in above statement and directly write assert.equal
		
	}
	
	@Test
	public void AmazonLaunch()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
				
	}
}
