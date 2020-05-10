package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LargeDeepDOM {

    private WebDriver driver;



    public LargeDeepDOM (WebDriver driver){
        this.driver=driver;
    }

    public void scrollToTable(){
        WebElement tableElement = driver.findElement(By.id("large-table"));
        String script = "arguments[0].scrollIntoView();";                       //scrollIntoView is a function to scroll
        ((JavascriptExecutor)driver).executeScript(script, tableElement);       //tableElement will replace arguments[0]
    }


}
