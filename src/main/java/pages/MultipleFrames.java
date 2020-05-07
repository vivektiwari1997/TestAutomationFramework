package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleFrames {

    private WebDriver driver;


    public MultipleFrames(WebDriver driver){
        this.driver=driver;
    }

    public NestedFrames clickNestedFrames(){
        driver.findElement(By.linkText("Nested Frames")).click();
        return new NestedFrames(driver);
    }



}
