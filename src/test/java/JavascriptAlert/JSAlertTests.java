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

    @Test
    public void getJSConfirmAlert(){
        JavaScriptAlert javaScriptAlert=homePage.clickJavaScriptAlertPage();
        javaScriptAlert.clickJSConfirmAlert();
        System.out.println(javaScriptAlert.getJSConfirmAlertText());
        assertEquals(javaScriptAlert.getJSConfirmAlertText(),"I am a JS Confirm","Incorrect JS ALert text");
    }

    @Test
    public void getJSPrompt(){
        JavaScriptAlert javaScriptAlert=homePage.clickJavaScriptAlertPage();
        String text="Vivek Tiwari!";
        javaScriptAlert.clickJSPrompt(text);
        javaScriptAlert.AlertBox();
        System.out.println(javaScriptAlert.getResult());

        assertEquals(javaScriptAlert.getResult(),"You entered: " + text,"Incoreect prompt message");
    }
}
