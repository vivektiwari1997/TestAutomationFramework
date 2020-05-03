package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlert {

    private WebDriver driver;
    private By triggerAlert = By.xpath(".//button[text()='Click for JS Alert']");
    private By triggerJSConfirmAlert = By.xpath(".//button[text()='Click for JS Confirm']");
    private By triggerJSPrompt = By.xpath(".//button[text()='Click for JS Prompt']");

    private By result = By.id("result");
    public JavaScriptAlert(WebDriver driver){
        this.driver=driver;
    }

    public void clickAlertButton(){              //click Alert
        driver.findElement(triggerAlert).click();
        AlertBox();
    }

    public void clickJSConfirmAlert(){          // click JS confirm
        driver.findElement(triggerJSConfirmAlert).click();
        driver.switchTo().alert().getText();
    }

    public void clickJSPrompt(String text){          // click JS confirm
        driver.findElement(triggerJSPrompt).click();
        driver.switchTo().alert().sendKeys(text);

    }



    public String getJSConfirmAlertText(){ // method to get the text in alert box
        return driver.switchTo().alert().getText();
    }

    public void AlertBox(){
        driver.switchTo().alert().accept();
    }

    public String getResult(){
        return driver.findElement(result).getText();
    } //get result on JS page

}
