package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlert {

    private WebDriver driver;
    private By triggerAlert = By.xpath(".//button[text()='Click for JS Alert']");
    private By result = By.id("result");
    public JavaScriptAlert(WebDriver driver){
        this.driver=driver;
    }

    public void clickAlertButton(){
        driver.findElement(triggerAlert).click();
        AlertBox();
    }

    public void AlertBox(){
        driver.switchTo().alert().accept();
    }

    public String getResult(){
        return driver.findElement(result).getText();
    }

}
