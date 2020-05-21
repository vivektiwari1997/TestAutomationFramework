package base;

import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utils.WindowsManager;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishal\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  //implicit wait call for 5 seconds
        goHome();

        homePage = new HomePage(driver);

        //To find no of tags present on page
        //WebElement inputsLink = driver.findElement(By.linkText("Shifting Content"));
        //inputsLink.click();
       // WebElement menuElement = driver.findElement(By.partialLinkText("Example 1: Menu Element"));
        //menuElement.click();
        //List<WebElement> anchorTags = driver.findElements(By.tagName("li"));
        //System.out.println("No of list tags :" + anchorTags.size());

    }

    @AfterMethod
    public void takeScreenshot(){
       var camera =  (TakesScreenshot)driver;  // casted my driver to TakesScreenshot class and allocated to object camera
        File screenshot = camera.getScreenshotAs(OutputType.FILE);
        try {
            Files.move(screenshot, new File("C:\\Users\\Vishal\\TestAutomation\\src\\main\\java\\Screenshots\\test.png"));
        }catch (IOException e){
            e.printStackTrace();
        }

        System.out.println("Path of screenshot" + screenshot.getAbsolutePath());
    }

    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com");
    }

    @AfterClass
    public void close(){
        driver.quit();
    }

    public WindowsManager windowsManagerActions(){
        return new WindowsManager(driver);
    }
}