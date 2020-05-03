package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUpload {

    private WebDriver driver;
    private By input = By.id("file-upload");

    public FileUpload (WebDriver driver){
        this.driver=driver;
    }
    public void sendFilePath(String path){
        driver.findElement(input).sendKeys(path);
        clickUploadButton();
    }

    public void clickUploadButton(){
        driver.findElement(By.id("file-submit")).click();
    }

    public String validateResult(){
        return driver.findElement(By.id("uploaded-files")).getText();
    }


}
