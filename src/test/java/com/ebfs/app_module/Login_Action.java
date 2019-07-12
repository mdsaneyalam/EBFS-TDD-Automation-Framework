package com.ebfs.app_module;

import org.openqa.selenium.WebDriver;

import com.ebfs.page_objects.AuthenticationPage;
import com.ebfs.page_objects.HomePage;
import com.ebfs.utilities.ExcelUtils;

public class Login_Action {
	
	public static void SignIn(WebDriver driver, String email, String password) {
		
		HomePage.lnk_SignIn(driver).click();
		System.out.println("Step 1: Click on Signin link");
		
		AuthenticationPage.txt_Email(driver).sendKeys(email);
		System.out.println("Step 2: Type Email Address");
		
		AuthenticationPage.txt_Password(driver).sendKeys(password);
		System.out.println("Step 3: Type Password");
		
		AuthenticationPage.btn_signin(driver).click();
		System.out.println("Step 4: Click on Signin Button");
		
		
	}
	
	
public static void SignInFromExcel(WebDriver driver) {
	
		String email = ExcelUtils.getCellData(1, 1);
		String password = ExcelUtils.getCellData(1,  2);
		
		HomePage.lnk_SignIn(driver).click();
		System.out.println("Step 1: Click on Signin link");
		
		AuthenticationPage.txt_Email(driver).sendKeys(email);
		System.out.println("Step 2: Type Email Address");
		
		AuthenticationPage.txt_Password(driver).sendKeys(password);
		System.out.println("Step 3: Type Password");
		
		AuthenticationPage.btn_signin(driver).click();
		System.out.println("Step 4: Click on Signin Button");
		
		
	}

}
