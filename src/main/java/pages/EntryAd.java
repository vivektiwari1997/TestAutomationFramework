package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

public class EntryAd {

    private WebDriver driver;
    private By textOnWindow = By.cssSelector(".modal-body p");

    public EntryAd(WebDriver driver){
        this.driver=driver;
    }

    public PopUp clickButton() {
        driver.findElement(By.xpath("//*[@id=\"restart-ad\"]")).click();
        return new PopUp(driver);
    }

    public String getText(){
        return driver.findElement(textOnWindow).getText();
    }

}
