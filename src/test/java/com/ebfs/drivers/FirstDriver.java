package com.ebfs.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ebfs.page_objects.HomePage;
import com.ebfs.shared_properties.CommonProperties;

public class FirstDriver {
	
	private static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty(CommonProperties.CHROME_PROP, CommonProperties.CHROME_DRIVER_PATH);
		driver = new ChromeDriver();
		
		driver.get(CommonProperties.TARGET_URL);
		
		System.out.println("Succesfuly opened the ebfs site");
		
		HomePage.lnk_BestSellers(driver).click();
		System.out.println("Succesfuly clikced on the Best Sellers Link.");
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}
