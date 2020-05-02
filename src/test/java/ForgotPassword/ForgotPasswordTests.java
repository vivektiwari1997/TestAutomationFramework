package ForgotPassword;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.EmailConfirmationPage;
import pages.ForgotPassword;

import static org.testng.Assert.assertTrue;

public class ForgotPasswordTests extends BaseTests {

    @Test
    public void alertConfirmationText(){
        ForgotPassword forgotPassword=homePage.clickForgotPassword();
        forgotPassword.sendEmailAddress("vvktiwari621@gmail.com");
        EmailConfirmationPage emailConfirmationPage = forgotPassword.clickRetrieve();
        assertTrue(emailConfirmationPage.getAlertConfirmationText().contains("Your e-mail's been sent!"),"Incorrect text");
    }
}
