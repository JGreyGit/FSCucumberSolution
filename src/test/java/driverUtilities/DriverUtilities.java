package driverUtilities;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import componentHelpers.NavigationHelper;
import constants.Constants;


public class DriverUtilities extends Constants
{   
	
	   //need to change PATH for ReadProperties
	   public static ReadProperties configProperties = new ReadProperties("C:\\Users\\Owner\\eclipse-workspace\\FSCucumberSolution\\src\\test\\resources\\config\\config.properties"); 
	
	   public static void initializeDriver() throws IOException {


	        String browser = configProperties.getPropertyValue("browser_chrome_prop");
	        String geckoDriverPath = configProperties.getPropertyValue("gecko_driver_path");
	        String chromeDriverPath = configProperties.getPropertyValue("chrome_driver_path");
	        String url = configProperties.getPropertyValue("url");

	        System.out.println("done with configuration in Driver page");

	        System.out.println("browser:" + browser);


	        if (browser.equalsIgnoreCase(browser_firefox)) {
	        	
	            System.setProperty(webdriver_gecko_driver, geckoDriverPath); 	       
	            DriverRepository.Driver = new FirefoxDriver();
	            
	        } else if (browser.equalsIgnoreCase(browser_chrome)) {
	            
	        	System.setProperty(webdriver_chrome_driver, chromeDriverPath);
	            DriverRepository.Driver = new ChromeDriver();
	            
	        } else {
	            System.out.println("Setup complete");
	         
	        }

	        System.out.println("Setup complete");

	        DriverRepository.Driver.manage().window().maximize();
	        DriverRepository.Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        NavigationHelper.NavigateToUrl(configProperties.getPropertyValue("url"));
	        System.out.println("Url is: " + url);

    }
}
