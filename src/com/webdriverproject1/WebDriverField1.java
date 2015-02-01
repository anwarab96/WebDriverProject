package com.webdriverproject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverField1 {

	public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.gmail.com");
	/*WebElement username = driver.findElement(By.id("Email"));
	username.sendKeys("anware");
	WebElement password = driver.findElement(By.id("password"));
	password.sendKeys("xxxxxxxxxx");
*/
	WebElement username = driver.findElement(By.xpath("//input[@id='Email']"));
	username.sendKeys("welcome");
	WebElement password = driver.findElement(By.xpath("//a[@id='link-forgot-passwd']"));
	password.click();
	}
 
}
