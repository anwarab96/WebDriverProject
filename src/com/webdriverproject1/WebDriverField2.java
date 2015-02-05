package com.webdriverproject1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverField2 {	
	public static void main(String[] args) throws Exception
	{
	System.out.println("Webdriver 1");
	WebDriver driver = new FirefoxDriver();
	//driver will get url
	driver.get("http://www.dice.com/");
	//driver will findelement by name searchbox
	driver.findElement(By.name("q")).sendKeys("selenium");
	//driver will find element by name for place
	
	driver.findElement(By.name("l")).clear();
	driver.findElement(By.name("l")).sendKeys("New York,NY");
	//driver will find element by name for submitbutton
	driver.findElement(By.xpath("//*[@id='search-form']/fieldset/div[4]/div/div[1]/button")).click();
	//wait for 3 seconds
	
	//Thread.sleep(2000);
	//driver.navigate().back();
	
	Thread.sleep(3000);
	//driver.findElement(By.className("btn btn-primary")).click();
	String mainHandle = driver.getWindowHandle();
    Set<String> allHandles = driver.getWindowHandles();
//    Iterator<String> iter = allHandles.iterator();
//    allHandles.remove(mainHandle);
//    String childHandle=iter.next();
    Thread.sleep(2000);
    //driver.close();
	String mySearch = driver.findElement(By.id("pull-left posiCount sort")).getText();
	System.out.println("My search was "+mySearch);
	String myXP = "//*[@id='search-form']/fieldset/div[1]/div/strong";
	if("Search Results".equals(driver.findElement(By.xpath(myXP)).getText()))
	{
		System.out.println("Found");
	}else 
	{
		System.out.println("Not Found");
	}
	//Thread.sleep(2000);
	//driver.findElement(By.linkText("/jobs/advancedSearch.html")).click();
	//Thread.sleep(3000);
	
	}
	
	
}


