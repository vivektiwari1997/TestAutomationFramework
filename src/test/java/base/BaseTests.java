package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

import java.util.List;

public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishal\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com");

        homePage = new HomePage(driver);

        //To find no of tags present on page
        //WebElement inputsLink = driver.findElement(By.linkText("Shifting Content"));
        //inputsLink.click();
       // WebElement menuElement = driver.findElement(By.partialLinkText("Example 1: Menu Element"));
        //menuElement.click();
        //List<WebElement> anchorTags = driver.findElements(By.tagName("li"));
        //System.out.println("No of list tags :" + anchorTags.size());

    }

    @AfterClass
    public void close(){
        driver.quit();
    }

}