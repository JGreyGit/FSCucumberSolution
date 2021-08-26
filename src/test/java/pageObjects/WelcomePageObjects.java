package pageObjects;

import org.openqa.selenium.By;
import componentHelpers.GetMethodsHelper;
import componentHelpers.GenericHelper;

public class WelcomePageObjects {
	
	 public static By teaPassionlogo = By.xpath("//a[@href='welcome.html']/img");
	 public static  By weArePassionateAboutTeaHeader = By.xpath("//h1[normalize-space(text()='We're passionate about tea.')]");
	  
	 
public static boolean teaPassionlogoPresent;
public static boolean WelcomePageHeaderText;
	 
	 
	 public static boolean isLogoDisplayed() {
		 
		 
		 teaPassionlogoPresent = GenericHelper.IsElementPresent(teaPassionlogo);
		 return teaPassionlogoPresent;
	 }
	 
 public static boolean isWelcomePageHeaderDisplayed() {
		 
		 
		 teaPassionlogoPresent = GenericHelper.IsElementPresent(weArePassionateAboutTeaHeader);
		 return teaPassionlogoPresent;
	 }
	 
 public static String getWelcomePageHeaderText() {
	 
	 
	 return GetMethodsHelper.GetText(weArePassionateAboutTeaHeader,"XPATH");

 }
 
 
 
 
}
