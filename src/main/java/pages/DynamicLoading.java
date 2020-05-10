package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoading {
    private WebDriver driver;

    public DynamicLoading(WebDriver driver){
        this.driver=driver;
    }

    public Example1Page clickExample1(){
        driver.findElement(By.cssSelector(".example a")).click();
        return new Example1Page(driver);
    }

    public Example2Page clickExample2(){
        driver.findElement(By.xpath(".//a[contains(text(),'Example 2')]")).click();
        return new Example2Page(driver);
    }

}
