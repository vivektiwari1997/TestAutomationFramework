package JavascriptAlert;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.JavaScriptAlert;

import static org.testng.Assert.assertEquals;

public class JSAlertTests extends BaseTests {

    @Test
    public void getAlertValidation(){
      JavaScriptAlert javaScriptAlert = homePage.clickJavaScriptAlertPage();
      javaScriptAlert.clickAlertButton();

      assertEquals(javaScriptAlert.getResult(),"You successfuly clicked an alert","Incorrect buttons");
    }
}
