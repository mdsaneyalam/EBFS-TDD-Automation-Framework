package com.ebfs.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.ebfs.page_object_properties.CreateAccountPageProperties;


public class CreateAccount {
	
private static WebElement element = null;
	
	public static WebElement LNK_Title_Mr(WebDriver driver) {
		
		element = driver.findElement(By.id(CreateAccountPageProperties.Title_Mr));
		
		return element;
	}
	
	public static WebElement LNK_Title_Mrs(WebDriver driver) {
		
		element = driver.findElement(By.id(CreateAccountPageProperties.Title_Mrs));
		
		return element;
	}
	
	public static WebElement LNK_Customer_First_Name(WebDriver driver) {
		
		element = driver.findElement(By.id(CreateAccountPageProperties.Customer_First_Name));
		
		return element;
	}
	
	public static WebElement LNK_Customer_Last_Name(WebDriver driver) {
		
		element = driver.findElement(By.id(CreateAccountPageProperties.Customer_Last_Name));
		
		return element;
	}
	
	public static WebElement LNK_Customer_Email(WebDriver driver) {
		
		element = driver.findElement(By.id(CreateAccountPageProperties.Customer_Email));
		
		return element;
	}
	
	public static WebElement LNK_Customer_password(WebDriver driver) {
		
		element = driver.findElement(By.id(CreateAccountPageProperties.Customer_password));
		
		return element;
	}
	
	public static WebElement LNK_NewsLetter_Checkboax(WebDriver driver) {
		
		element = driver.findElement(By.id(CreateAccountPageProperties.Checkbox_newsletter));
		
		return element;
	}
	
	public static WebElement LNK_SpecialOfer_Checkboax(WebDriver driver) {
		
		element = driver.findElement(By.id(CreateAccountPageProperties.Checkbox_specialoffer));
		
		return element;
	}

}
