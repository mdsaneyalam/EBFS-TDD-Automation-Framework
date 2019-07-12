package com.ebfs.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.ebfs.page_object_properties.AuthenticationPageProperties;

public class AuthenticationPage {

private static WebElement element = null;
	
	public static WebElement txt_Email(WebDriver driver) {
		
		element = driver.findElement(By.id(AuthenticationPageProperties.TXTBOX_EMAIL));
		
		return element;
		
	}
	
	public static WebElement txt_Password(WebDriver driver) {
		
		element = driver.findElement(By.id(AuthenticationPageProperties.TXTBOX_PASSWORD));
		
		return element;
		
	}
	
	public static WebElement btn_signin(WebDriver driver) {
		
		element = driver.findElement(By.id(AuthenticationPageProperties.BTN_SIGNIN));
		
		return element;
		
	}
	
}
