package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

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

    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com");
    }

    @AfterClass
    public void close(){
        driver.quit();
    }

}