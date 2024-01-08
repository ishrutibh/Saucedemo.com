package com.saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SauceDemo {

		public static WebDriver driver;
@Test
public void  ALaunchWebsite()
{
	driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com/v1/");
	
}
@Test
public void BUserlogin()
{
	//WebDriver driver=new ChromeDriver();
	//driver=new ChromeDriver();
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	driver.findElement(By.id("login-button")).click();
	
}
@Test
	public void CSelectItem()
	{
	//WebDriver driver=new ChromeDriver();
	driver.findElement(By.xpath("//div[normalize-space()='Sauce Labs Bolt T-Shirt']")).click();
	driver.findElement(By.xpath("//button[normalize-space()='ADD TO CART']")).click();
}
}
