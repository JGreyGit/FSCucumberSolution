package componentHelpers;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import driverUtilities.DriverRepository;

import driverUtilities.DriverUtilities;

public class GenericHelper extends DriverUtilities
{

    public static boolean IsElementPresent(By Locator)
    {
       try
       {
           return DriverRepository.Driver.findElements(Locator).size() == 1;
       }
        catch (Exception e)
        {
            return false;

        }
    }

    public static WebElement GetElement(By Locator)
    {
        if (IsElementPresent(Locator))
            return DriverRepository.Driver.findElement(Locator);
        else
        {
            throw new NoSuchElementException("Element Not Found : " + Locator.toString());

        }

    }

}
