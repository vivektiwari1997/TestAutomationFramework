package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;


    public HomePage (WebDriver driver){
        this.driver=driver;
    }

    public LoginPage  clickFormAuthentication(){      // method for clicking link of Login page and redirecting handle to loginPage in framework
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public DropDown clickDropDown(){
        clickLink("Dropdown");
        return new DropDown(driver);
    }

    public ForgotPassword clickForgotPassword(){
        clickLink("Forgot Password");
        return new ForgotPassword(driver);
    }

    public HoversPage clickHover(){
        clickLink("Hovers");
        return new HoversPage(driver);
    }

    public KeyPresses clickKeyPress(){
        clickLink("Key Presses");
        return new KeyPresses(driver);
    }

    public HorizontalSlider clickHorizontalPage(){
        clickLink("Horizontal Slider");
        return new HorizontalSlider(driver);
    }

    public JavaScriptAlert clickJavaScriptAlertPage(){
        clickLink("JavaScript Alerts");
        return new JavaScriptAlert(driver);
    }

    public FileUpload clickFileUpload(){
        clickLink("File Upload");
        return new FileUpload(driver);
    }

    public EntryAd clickEntryAd(){
        clickLink("Entry Ad");
        return new EntryAd(driver);
    }

    public ContextMenu clickContextMenu(){
        clickLink("Context Menu");
        return new ContextMenu(driver);
    }

    public WYSIWYGEditor clickWYSIWYGEditor(){
        clickLink("WYSIWYG Editor");
        return new WYSIWYGEditor(driver);
    }


    private void clickLink(String linkTextActual){                  // generic method for clicking the links on homepage
        driver.findElement(By.linkText(linkTextActual)).click();
    }
}
