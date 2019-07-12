package com.ebfs.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.ebfs.page_object_properties.HomePageProperties;

public class HomePage {

	private static WebElement element = null;
	
	public static WebElement lnk_Popular(WebDriver driver) {
		
		element = driver.findElement(By.className(HomePageProperties.LINK_POPULAR));
		
		return element;
		
	}
	
	public static WebElement lnk_BestSellers(WebDriver driver) {
			
			element = driver.findElement(By.className(HomePageProperties.LINK_BEST_SELLER));
			
			return element;
			
	}
	
	public static WebElement lnk_SignIn(WebDriver driver) {
		
		element = driver.findElement(By.className(HomePageProperties.LINK_SIGN_IN));
		
		return element;
		
}
	
	
	
	
}
