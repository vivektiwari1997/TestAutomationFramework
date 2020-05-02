package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailConfirmationPage {

    private WebDriver driver;
    private By alertConfirmationText = By.id("content");

    public EmailConfirmationPage(WebDriver driver){
        this.driver=driver;
    }

    public String getAlertConfirmationText(){
      return driver.findElement(alertConfirmationText).getText();
    }
}
