package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By usernameField = By.id("username"); // locator for username field
    private By passwordField = By.id("password"); // locator for password field
    private By submitButton = By.className("radius"); // locator for button field

    public LoginPage (WebDriver driver){
        this.driver=driver;
    }

    public void setUsername (String username){
        driver.findElement(usernameField).sendKeys(username);
    }

    public void setPassword (String password){
        driver.findElement(passwordField).sendKeys(password);

    }

    public SecureAreaPage clickLoginButton(){
        driver.findElement(submitButton).click();
        return new SecureAreaPage (driver);
    }
}
