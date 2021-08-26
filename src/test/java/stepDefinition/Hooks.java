package stepDefinition;

import java.io.IOException;


import cucumber.api.java.After;
import cucumber.api.java.Before;

import driverUtilities.DriverUtilities;





public class Hooks {

	@Before
    public void before(){ 
		try {
			DriverUtilities.initializeDriver();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @After
    public void after()
    {
      //ObjectRepository.Driver.close();
      //ObjectRepository.Driver = null;

    }
}