package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class Example2Page {

    private WebDriver driver;
    private By startLoadButton = By.cssSelector("#start button");
    private By afterLoadingText = By.id("finish");

    public Example2Page(WebDriver driver){
        this.driver=driver;
    }

    public void clickButton(){
        driver.findElement(startLoadButton).click();
        waitMethod();
    }

    public void waitMethod(){
        FluentWait wait = new FluentWait(driver).
                withTimeout(Duration.ofSeconds(5)).
                pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);

        wait.until(ExpectedConditions.presenceOfElementLocated(afterLoadingText));
    }

    public String returnLoadingText(){
        return driver.findElement(afterLoadingText).getText();
    }

    public Boolean isStartButtonDisplayed(){
        return driver.findElement(startLoadButton).isDisplayed();
    }
}
