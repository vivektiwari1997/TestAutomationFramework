package EntryAd;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.EntryAd;
import pages.PopUp;

import static org.testng.Assert.assertEquals;

public class EntryAdModalTests extends BaseTests {

    @Test
    public void validateModal(){
       EntryAd entryAd = homePage.clickEntryAd();
      entryAd.clickButton();
        PopUp popUp = entryAd.clickButton();
       System.out.println(entryAd.getText());

       assertEquals(entryAd.getText(),  "It's commonly used to encourage a user to take an action (e.g., give their e-mail address to sign up for something or disable their ad blocker).", "incorrect text");

    }
}
