// a utility to perform multiple actions of Windows Manager

package utils;

import org.apache.poi.util.SystemOutLogger;
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


        //multiple windows handles
        public void switchToTab(String tabTitile){
           var windows =  driver.getWindowHandles();     // windows will store windows handle

            System.out.println("total tabs open"+windows.size()); // print total no. of open tabs

            windows.forEach(System.out::println);  // printing unique handles of each open window

            for (String window: windows){
                System.out.println("Window switched to"+ window); // here windows will traverse and print window
                driver.switchTo().window(window);

                System.out.println("Current window title :"+ driver.getTitle()); // each window and title


                if(tabTitile.equals(driver.getTitle())){
                    break;
                }
            }
        }
}
