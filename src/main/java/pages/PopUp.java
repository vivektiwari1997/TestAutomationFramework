package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class PopUp {

    private WebDriverWait wait;
    private final By closeElementLocator = By.id(".modal-title p");
    private final By popupIdLocator = By.cssSelector(".modal-title h3");

    public PopUp(WebDriver driver) {
        this.wait = new WebDriverWait(driver, 5);
    }

    public void close() throws InterruptedException {
        if (isDisplayed()) {
            WebElement closeElement = wait.until(
                    visibilityOfElementLocated(closeElementLocator));
            closeElement.click();
        }
    }
    private Boolean isDisplayed() throws InterruptedException {
        try {
            WebElement popup = wait.until(
                    visibilityOfElementLocated(popupIdLocator));
            return popup.isDisplayed();
        }
        catch (Exception ex) {
            return false;
        }
    }

}

