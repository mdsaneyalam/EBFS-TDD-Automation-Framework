package com.ebfs.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ebfs.app_module.Login_Action;
import com.ebfs.page_object_properties.AuthenticationPageProperties;
import com.ebfs.page_objects.HomePage;
import com.ebfs.shared_properties.CommonProperties;
import com.ebfs.utilities.ExcelUtils;

public class FirstDriver {
	
	private static WebDriver driver = null;

	public static void main(String[] args) throws Exception {
		
		// open the Excel file.
		ExcelUtils.setExcelFile(AuthenticationPageProperties.TEST_DATA_FILE, "Sheet1");
		
		System.setProperty(CommonProperties.CHROME_PROP, CommonProperties.CHROME_DRIVER_PATH);
		driver = new ChromeDriver();
		
		driver.get(CommonProperties.TARGET_URL);		
		System.out.println("Succesfuly opened the ebfs site");
		
//		System.out.println("testcase 1: Verify valid login...");
//		Login_Action.SignIn(driver, AuthenticationPageProperties.EMAIL_ADDRESS, AuthenticationPageProperties.PASSWORD);
		
		
		System.out.println("testcase 2: Verify login with valid eamil and valid password from excel file.......");
		Login_Action.SignInFromExcel(driver);
				
		Thread.sleep(5000);
		
		driver.quit();
		
		// write the result in the excel file
		ExcelUtils.setCellData("Pass", 1, 3);

	}

}
