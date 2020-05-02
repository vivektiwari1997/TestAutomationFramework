package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPresses {

    private WebDriver driver;
    private By inputField = By.id("target");
    private By resultField = By.id("result");

    public KeyPresses(WebDriver driver){
        this.driver=driver;
    }

    public void enterKey(String key){                   // method for entering key on the input field
        driver.findElement(inputField).sendKeys(key);
    }

    public String getResult(){
        return driver.findElement(resultField).getText();  // method to get result corresponding to key entered
    }

    public void sendPie(){
        enterKey(Keys.chord(Keys.SHIFT,"2"));   //pressing two keys simultaneously // try using break point
    }
}
