package pageObjects;


import org.openqa.selenium.By;

import componentHelpers.GenericHelper;
import componentHelpers.GetMethodsHelper;
import componentHelpers.LinkTextHelper;
import componentHelpers.SetTextHelper;
import componentHelpers.TextBoxHelper;

public class LetsTalkTeaPageObjects {
	
	//Link Objects
	 public static By letsTalkTeaLink = By.cssSelector("a[href='let-s-talk-tea.html']");
	
	//Text Objects
	public static By letsTalkTeaText = By.xpath("//a[@data-title='Let's Talk Tea'");
	 public static By letstalkTeaHeaderText = By.xpath("//h1[normalize-space(text()='Let's Talk Tea')]");
	 public static By sendUsAnEmailHeaderText = By.xpath("//h1[normalize-space(text()='Send us an email')]");
	 public static By nameLabelText = By.xpath("//label[text()='Name: ']");
	 public static By emailLabelText = By.xpath("//label[text()='Email: ']");
	 public static By subjectLabelText = By.xpath("//label[text()='Subject: ']");
	 public static By messageLabelText = By.xpath("//label[text()='Message: ']");

	 
	 //* asterisk 
	 public static By asteriskNameLabel = By.xpath("//label[text()='Name: ']/span[text()='*']");
	 public static By asteriskEmailLabel = By.xpath("//label[text()='Email: ']/span[text()='*']");
	 public static By asteriskSubjectabel = By.xpath("//label[text()='Subject: ']/span[text()='*']");
	 public static By asteriskMessageLabel = By.xpath("//label[text()='Message: ']/span[text()='*']");
	 
	 //Input Field Object 
	 public static By nameInputField = By.cssSelector("input[name='name']");
	 public static By emailInputField = By.cssSelector("input[name='email']");
	 public static By subjectInputField = By.cssSelector("input[name='subject']");
	 public static By messageInputTextArea =By.cssSelector("textarea[name='message']");
	 
	 //boolean 
	 public static boolean welcomeHeader;
	 public static boolean nameFieldLabel;
	 
	 //submit button 
	 public static By submitButton = By.cssSelector("input[class='form-submit']");

	 
	 //submit button return false
	 public static By submitButtonReturnFalse = By.cssSelector("input[onclick='return false;']");
	 
	 
	 public static boolean isLetsTalkTeaHeaderTextDisplayed() {
		 
		 
		boolean letsTalkTeaPageHeader = GenericHelper.IsElementPresent(letstalkTeaHeaderText);
		 return letsTalkTeaPageHeader;
	 }
	 
	 public static String getLetsTalkTeaHeaderText() {
			String letsTalkHeaderText  = GetMethodsHelper.GetText(letstalkTeaHeaderText,"XPath");
			return letsTalkHeaderText.toString();
			
		 }
		 
	 	 
	 
	 
	 //check field label names displayed
	 public static boolean isNameLabelDisplayed() {
		 return GenericHelper.IsElementPresent(nameLabelText);
		
	 }

	
	 
	 public static boolean isEmailLabelDisplayed() {
		 
		 return GenericHelper.IsElementPresent(emailLabelText);
	 }
	 
	 
	 public static boolean isSubjectLabelDisplayed() {
		 
		 
		 return GenericHelper.IsElementPresent(subjectLabelText);
	 }
	 
	 
	 public static boolean isMessageLabelDisplayed() {
		 
		 
		 return GenericHelper.IsElementPresent(messageLabelText);
	 }
	 
	 //check * Asterisk on Labels
	 
	 public static boolean isAsteriskNameLabelDisplayed() {
		 return GenericHelper.IsElementPresent(nameLabelText);
		
	 }
	 public static boolean isAsteriskEmailLabelDisplayed() {
		 return GenericHelper.IsElementPresent(emailLabelText);
		
	 }
	 public static boolean isAsteriskSubjectLabelDisplayed() {
		 return GenericHelper.IsElementPresent(subjectLabelText);
		
	 }
	 public static boolean isAsteriskMessageLabelDisplayed() {
		 return GenericHelper.IsElementPresent(messageLabelText);
		
	 }
	 
	 //clear and enter text in fields
	 

 public static void setNameField(String text) {
	 
	 SetTextHelper.EnterText(nameInputField, text, "XPath");
		 
	 }
 

 public static void setEmailField(String text) {
	 
	 SetTextHelper.EnterText(emailInputField, text, "XPath");
		 
	 }
 

 public static void setSubjectField(String text) {
	 
	 SetTextHelper.EnterText(subjectInputField, text, "XPath");
		 
	 }
 

 public static void setMessageField(String text) {
	 
	 
	 TextBoxHelper.ClearTextBox(messageInputTextArea);
	 TextBoxHelper.TypeInTextBox(messageInputTextArea, text);
		 
	 }
 
 
 //get Text from fields
 
 public static String getNameFieldText() {
	 return GetMethodsHelper.GetText(nameInputField,"XPath");
 }
 
 public static String getEmailFieldText() {
	return GetMethodsHelper.GetText(emailInputField,"XPath");
 }
 
 public static String getSubjectFieldText() {
	return GetMethodsHelper.GetText(subjectInputField,"XPath");
 }
 
 public static String getMessageFieldText() {
return GetMethodsHelper.GetText(messageInputTextArea,"XPath");

	
 }
 
 public static void clickSubmitButton() {
	 
	 LinkTextHelper.ClickLink(submitButton);

 }
 
 public static boolean isSubmitButtonFalseDisplayed() {
	 return GenericHelper.IsElementPresent(submitButtonReturnFalse);
	
 }
 
	 
}
