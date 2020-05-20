package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleWindowsPages {

    private WebDriver driver;
    private By clickHereLink = By.linkText("Click Here");

    public MultipleWindowsPages(WebDriver driver){
        this.driver=driver;
    }

    public void clickHere(){
        driver.findElement(clickHereLink).click();
    }
}
