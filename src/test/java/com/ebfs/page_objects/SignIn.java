package com.ebfs.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.ebfs.page_object_properties.SignInPageProperties;

public class SignIn {
	
	private static WebElement element = null;
	
	public static WebElement LNK_Create_Account_Email(WebDriver driver) {
		
		element = driver.findElement(By.id(SignInPageProperties.Create_Account_Email));
		
		return element;
	}
	
	public static WebElement LNK_Create_Account_Button(WebDriver driver) {
		
		element = driver.findElement(By.id(SignInPageProperties.Create_Account_Button));
		
		return element;
	}
	
	public static WebElement LNK_Registered_Account_Email(WebDriver driver) {
		
		element = driver.findElement(By.id(SignInPageProperties.Registered_Account_Email));
		
		return element;
	}
	
	public static WebElement LNK_Registered_Account_Password(WebDriver driver) {
		
		element = driver.findElement(By.id(SignInPageProperties.Registered_Account_Password));
		
		return element;
	}
	
	public static WebElement LNK_Registered_Account_Button(WebDriver driver) {
		
		element = driver.findElement(By.id(SignInPageProperties.Registered_Account_Button));
		
		return element;
	}
	
	public static WebElement LNK_Forget_Password_Button(WebDriver driver) {
		
		element = driver.findElement(By.className(SignInPageProperties.Forget_Password_Button));
		
		return element;
	}
	

}
