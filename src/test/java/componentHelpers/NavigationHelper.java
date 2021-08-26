package componentHelpers;

import org.openqa.selenium.NoSuchElementException;

import driverUtilities.DriverRepository;
import driverUtilities.DriverUtilities;

public class NavigationHelper extends DriverUtilities
{
    public static void NavigateToUrl(String Url)
    {
        try {
            System.out.println("navigating to URL...");
            DriverRepository.Driver.navigate().to(Url);
            System.out.println("Page login successful");
        } catch (
                NoSuchElementException el) {
            System.out.println(("No page found"));
        }


    }

    
    
}
