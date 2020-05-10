package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Example1Page {

    private WebDriver driver;
    private By startLoadButton = By.cssSelector("#start button");
    private By loadingImage = By.id("loading");
    private By afterLoadingText = By.id("finish");

    public Example1Page(WebDriver driver){
        this.driver=driver;
    }

    public void clickButton(){
        driver.findElement(startLoadButton).click();
       waitMethod();
    }
    public void waitMethod()
    {

        //Explicit wait method//
        /*
        WebDriverWait wait = new WebDriverWait(driver, 5);  //setup line for wait (Explicit), this won't do anything
        wait.until(ExpectedConditions.
                invisibilityOf(driver.findElement(loadingImage)));
         */

        //Fluent wait
        FluentWait wait = new FluentWait(driver).
                withTimeout(Duration.ofSeconds(5)).
                pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);

        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingImage)));


    }

    public String returnLoadingText(){
        return driver.findElement(afterLoadingText).getText();
    }
}
