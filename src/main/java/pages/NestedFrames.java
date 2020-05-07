package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFrames {

    private WebDriver driver;
    String nestedTop = "frame-top";
    String nestedLeft = "frame-left";
    String nestedRight = "frame-bottom";

    public NestedFrames(WebDriver driver){
        this.driver=driver;
    }

    public String switchToNestedLeft(){
        driver.switchTo().frame(nestedTop);
        driver.switchTo().frame(nestedLeft);
        String text = getFrameText();
        driver.switchTo().parentFrame();
        return text;
    }

    public String getFrameText(){
        return driver.findElement(By.tagName("body")).getText();
    }

}
