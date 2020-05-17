package WindowsManager;

import base.BaseTests;
import org.testng.annotations.Test;

public class windowsActionsTest extends BaseTests {

    @Test
    public void validateWindowsActions(){
        homePage.clickDynamicLoading().clickExample2();

        windowsManagerActions().goBack();
        windowsManagerActions().refreshPage();
        windowsManagerActions().goForward();
        windowsManagerActions().goToURL("https://www.google.com");
    }
}
