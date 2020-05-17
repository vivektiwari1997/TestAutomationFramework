package utils;

import org.openqa.selenium.WebDriver;

public class WindowsManager {

    private WebDriver driver;

    public WindowsManager(WebDriver driver){
        this.driver=driver;
        }

        public void goBack(){
        driver.navigate().back();
        }

        public void goForward(){
        driver.navigate().forward();
        }

        public void refreshPage(){
        driver.navigate().refresh();
        }

        public void goToURL(String URL){
        driver.navigate().to(URL);
        }
}
