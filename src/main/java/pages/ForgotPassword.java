package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPassword {

    private WebDriver driver;
    private By emailField = By.id("email");
    private By button = By.id("form_submit");

    public ForgotPassword(WebDriver driver){
        this.driver=driver;
    }

    public void sendEmailAddress(String email){
        driver.findElement(emailField).sendKeys(email);
    }

    public EmailConfirmationPage clickRetrieve(){
        driver.findElement(button).click();
        return new EmailConfirmationPage (driver);

    }

}
