package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSlider {

    private WebDriver driver;
    private By slider = By.cssSelector(".sliderContainer input");
    private By indexValueOnPage = By.id("range");
    private int index=0;

    public HorizontalSlider(WebDriver driver){
        this.driver=driver;
    }

    public void enterKey(String key){

        driver.findElement(slider).sendKeys(key);
    }

    public String getIndexValueOnPage(){
        return driver.findElement(indexValueOnPage).getText();
    }


}
