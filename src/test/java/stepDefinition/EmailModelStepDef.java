package stepDefinition;

import static org.openqa.selenium.support.PageFactory.initElements;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

import org.openqa.selenium.By;

import pageObjects.WelcomePageObjects;
import testData.DataFile;
import pageObjects.LetsTalkTeaPageObjects;
import driverUtilities.DriverRepository;
import driverUtilities.ReadProperties;




public class EmailModelStepDef {
	public static ReadProperties configProperties = new ReadProperties("C:\\Users\\Owner\\eclipse-workspace\\FSCucumberSolution\\src\\test\\resources\\config\\config.properties");
	
	 public static By getNameText = By.cssSelector("input[name=name]");

			 
	public WelcomePageObjects wPageObjs;
	public LetsTalkTeaPageObjects letsTalkTeaObjs;


@Given("^the user navigates to the correct url$")
public void the_user_navigates_to_the_correct_url() throws Throwable {
	
	
	wPageObjs = initElements(DriverRepository.Driver, WelcomePageObjects.class);
	letsTalkTeaObjs = initElements(DriverRepository.Driver, LetsTalkTeaPageObjects.class);
         
     //check that user is on the right URL 
     String currentUrl = DriverRepository.Driver.getCurrentUrl();   
     String expectedUrl =  configProperties.getPropertyValue("url");
     Assert.assertEquals(currentUrl, expectedUrl);
      
  
}
@And("the loaded page displays current title {string}")
public void the_loaded_page_displays_current_title(String currentTitle) {
	
	
	currentTitle = DriverRepository.Driver.getTitle();

	 String expectedTitle = DataFile.HomePageTitle;
	 Assert.assertEquals(currentTitle,expectedTitle);

}


@And("the form displays name label with mandatory asterisk")
public void the_form_displays_name_label_with_mandatory_asterisk() {
	
	boolean nameLabelDisplayed = LetsTalkTeaPageObjects.isNameLabelDisplayed();
	if(nameLabelDisplayed) {
		try {
			Thread.sleep(5000);
			Assert.assertEquals(true,LetsTalkTeaPageObjects.isAsteriskNameLabelDisplayed());
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}
}


@And("the form displays email label with mandatory asterisk")
public void the_form_displays_email_label_with_mandatory_asterisk() {
	
	boolean emailLabelDisplayed = LetsTalkTeaPageObjects.isEmailLabelDisplayed();
	
	if(emailLabelDisplayed) {
		try {
			Thread.sleep(5000);
			Assert.assertEquals(true,LetsTalkTeaPageObjects.isAsteriskEmailLabelDisplayed());
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}
     
}

@And("the form displays subject label with mandatory asterisk")
public void the_form_displays_subject_label_with_mandatory_asterisk() {
	boolean subjectLabelDisplayed = LetsTalkTeaPageObjects.isSubjectLabelDisplayed();
	if(subjectLabelDisplayed) {
		try {
			Thread.sleep(5000);
			Assert.assertEquals(true,LetsTalkTeaPageObjects.isAsteriskSubjectLabelDisplayed());
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}
     
}

@And("the form displays message label with mandatory asterisk")
public void the_form_displays_message_label_with_mandatory_asterisk() {
	boolean messageLabelDisplayed = LetsTalkTeaPageObjects.isMessageLabelDisplayed();
	if(messageLabelDisplayed) {
		try {
			Thread.sleep(5000);
			Assert.assertEquals(true,LetsTalkTeaPageObjects.isAsteriskMessageLabelDisplayed());
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}
     
}

@Then("the user enters name ([^\"]*) email ([^\"]*) subject ([^\"]*) and message ([^\"]*) in empty input fields")
public void the_user_enters_name_email_subject_and_message_in_empty_input_fields(String name, String email, String subject, String message ) throws InterruptedException {

	//enter details in fields 
	LetsTalkTeaPageObjects.setNameField(name);
	LetsTalkTeaPageObjects.setEmailField(email);
	LetsTalkTeaPageObjects.setSubjectField(subject);
	LetsTalkTeaPageObjects.setMessageField(message);
		

}

@Then("name ([^\"]*) email ([^\"]*) subject ([^\"]*) and message ([^\"]*) details are visible in fields")
public void name_email_subject_message_details_are_visible_in_fields(String name, String email, String subject, String message) {
	
	String userNameDetails = LetsTalkTeaPageObjects.getNameFieldText().toString();	
	Assert.assertEquals(userNameDetails, name);
	String userEmailDetails = LetsTalkTeaPageObjects.getEmailFieldText().toString();
	Assert.assertEquals(userEmailDetails, email);
	String userSubjectDetails = LetsTalkTeaPageObjects.getSubjectFieldText().toString();
	Assert.assertEquals(userSubjectDetails, subject);
	String userMessageDetails = LetsTalkTeaPageObjects.getMessageFieldText().toString();
	Assert.assertEquals(userMessageDetails, message);
}

@Then("the user confirms email not sent upon clicking submit button")
public void the_user_confirms_email_not_sent_upon_clicking_submit_button() {

	
	LetsTalkTeaPageObjects.clickSubmitButton();
	
	//After submitting, message is not sent because submit button returns false
	
	boolean messageNotSubmitted = LetsTalkTeaPageObjects.isSubmitButtonFalseDisplayed();
	Assert.assertTrue(messageNotSubmitted);
	
		
}


}