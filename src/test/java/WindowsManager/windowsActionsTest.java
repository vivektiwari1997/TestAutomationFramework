package WindowsManager;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class windowsActionsTest extends BaseTests {

    @Test
    public void validateWindowsActions(){
        homePage.clickDynamicLoading().clickExample2();

        windowsManagerActions().goBack();
        windowsManagerActions().refreshPage();
        windowsManagerActions().goForward();
        windowsManagerActions().goToURL("https://www.google.com");

    }
    @Test
    public void validateMultipleWindowsHandles(){
        homePage.clickMultipleWindows().clickHere();

        windowsManagerActions().switchToTab("New Window");
    }

    @Test
    public void validateholdkeyPressMultipleWindow(){
        homePage.clickDynamicLoading().clickExample2();
        //windowsManagerActions().holdAndSwitch();
        windowsManagerActions().switchToNewTab();
    }

    @Test
    public void testWindowTabs(){
        var buttonPage = homePage.clickDynamicLoading().rightClickExample2();
        windowsManagerActions().switchToNewTab();
        assertTrue(buttonPage.isStartButtonDisplayed(), "Start button is not displayed");

    }
}
