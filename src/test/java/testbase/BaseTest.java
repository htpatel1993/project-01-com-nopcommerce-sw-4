package testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import propertyreader.PropertyManager;
import utilities.Utility;

public class BaseTest extends Utility {
    String browser = PropertyManager.getInstance().getBrowser();

    @BeforeMethod
    public void setUp() {

        selectBrowser(browser);
    }

    @AfterMethod
    public void tearDown() {
        closeBrowser();
    }

}
