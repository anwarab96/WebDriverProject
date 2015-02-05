package com.webdriverproject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverScript {

	public static void main(String[] args) throws Exception {
		//declaration and instantiation of objects / variables
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "http://newtours.demoaut.com";
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle="";
		// launch Firefox and direct it to the Base URL
		driver.get(baseUrl);
		//get the actual value of the title
		actualTitle = driver.getTitle();
		/*compare the actual title of the page with the expected the result as "Passed" 
		or "Failed"*/
		if(actualTitle.contentEquals(expectedTitle)){
			System.out.println("Test Passed!");
		}else {
			System.out.println("Test Failed");
		}
		//waiting time
				Thread.sleep(3000);
		//close firefox
		driver.close();
		
		//exit the program explicitly	
  System.out.println(0);
}
}
