package componentHelpers;

import driverUtilities.DriverRepository;
import org.openqa.selenium.By;
import driverUtilities.DriverUtilities;

public class SetTextHelper extends DriverUtilities
{

    //Enter Text

    public static void EnterText(By nameInputField, String value, String elementtype)
    {
        if (elementtype == "Id")
        	DriverRepository.Driver.findElement(nameInputField).clear();
            DriverRepository.Driver.findElement(nameInputField).sendKeys(value);
        if (elementtype == "Name")
        	DriverRepository.Driver.findElement(nameInputField).clear();
            DriverRepository.Driver.findElement(nameInputField).sendKeys(value);
        if (elementtype == "CssSelector")
        	DriverRepository.Driver.findElement(nameInputField).clear();
            DriverRepository.Driver.findElement(nameInputField).sendKeys(value);
        if (elementtype == "LinkText")
        	DriverRepository.Driver.findElement(nameInputField).clear();
            DriverRepository.Driver.findElement(nameInputField).sendKeys(value);
        if (elementtype == "ClassName")
        	DriverRepository.Driver.findElement(nameInputField).clear();
            DriverRepository.Driver.findElement(nameInputField).sendKeys(value);
        if (elementtype == "XPath")
        	DriverRepository.Driver.findElement(nameInputField).clear();
            DriverRepository.Driver.findElement(nameInputField).sendKeys(value);

    }

    //click into button , Checkbox, option etc

    public static void click(String element, String elementtype)
    {
        if (elementtype == "Id")
            DriverRepository.Driver.findElement(By.id(element)).click();
        if (elementtype == "Name")
            DriverRepository.Driver.findElement(By.name(element)).click();
        if (elementtype == "CssSelector")
            DriverRepository.Driver.findElement(By.cssSelector(element)).click();
        if (elementtype == "LinkText")
            DriverRepository.Driver.findElement(By.linkText(element)).click();
        if (elementtype == "ClassName")
            DriverRepository.Driver.findElement(By.className(element)).click();
        if (elementtype == "XPath")
            DriverRepository.Driver.findElement(By.xpath(element)).click();

    }

}

