package com.ebfs.shared_properties;

public interface CommonProperties {
	
	
	public  final String CHROME_PROP = "webdriver.chrome.driver";
	public final String CHROME_DRIVER_PATH = System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\chromedriver.exe";
	public final String TARGET_URL = "http://ebfs.bruteforcesolution.net/ebfs/index.php"; 

}
