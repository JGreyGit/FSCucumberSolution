package componentHelpers;

import driverUtilities.DriverRepository;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import driverUtilities.DriverUtilities;

public class GetMethodsHelper extends DriverUtilities
{
    public static String GetText(By element, String elementtype) {
        if (elementtype == "Id")
            return DriverRepository.Driver.findElement(element).getAttribute("value");
        if (elementtype == "Name")
            return DriverRepository.Driver.findElement(element).getAttribute("value");
        if (elementtype == "CssSelector")
            return DriverRepository.Driver.findElement(element).getAttribute("value");
        if (elementtype == "LinkText")
            return DriverRepository.Driver.findElement(element).getAttribute("value");
        if (elementtype == "ClassName")
            return DriverRepository.Driver.findElement(element).getAttribute("value");
        if (elementtype == "XPath")
            return DriverRepository.Driver.findElement(element).getAttribute("value");
        else {

            throw new NoSuchElementException("Element Not Found : " + elementtype.isEmpty());
        }
    }
}
