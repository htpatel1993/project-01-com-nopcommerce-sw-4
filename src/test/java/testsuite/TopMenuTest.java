package testsuite;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ElectronicsPage;
import testbase.BaseTest;

public class TopMenuTest extends BaseTest {
    ElectronicsPage electronicsPage =new ElectronicsPage();
    // HomePage homePage = new HomePage();


    @Test
    public void verifyPageNavigation() {
        String menuName = "Electronics";
        String expectedMessage = "Electronics";
        // This method select Electronics tab on top menu
        electronicsPage.selectMenu(menuName);
        String actualMessage= electronicsPage.getElectronicsHeaderText();
        Assert.assertEquals(expectedMessage,actualMessage,"Unable to click on");
    }
}
