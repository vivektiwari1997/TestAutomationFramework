package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InfiniteScroll {

    private WebDriver driver;
    public By textBlock = By.className("jscroll-added");

    public InfiniteScroll(WebDriver driver) {
        this.driver = driver;
    }

    public void switchToParagraph(int index) {   //this will scroll until paragraph with index is found
        String scrollMethod = "window.scrollTo(0, document.body.scrollHeight)";  //scrollTo method takes two arguments (x axis, y axis)
        // (document.body.scrollHeight) scrolls by a normal amount

        var jsExecutor = (JavascriptExecutor) driver;     // casted my driver to JavascriptExecutor, which can now perform several JS actions

        while (numberOfParagraphsPresentOnDOM() < index) {
            jsExecutor.executeScript(scrollMethod);
        }

    }

    private int numberOfParagraphsPresentOnDOM() {
        System.out.println(driver.findElements(textBlock).size());
        return driver.findElements(textBlock).size();
    }
}