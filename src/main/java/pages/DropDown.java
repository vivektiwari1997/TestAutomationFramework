package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropDown {
    private WebDriver driver;
    private By dropDown = By.id("dropdown");
    public  DropDown (WebDriver driver){
        this.driver=driver;
    }

    public void selectFromDropDown(String option){          // getting options by text visible of the drop down options
        findDropDownElement().selectByVisibleText(option);
    }

    private Select findDropDownElement(){
        return new Select(driver.findElement(dropDown));   // selecting drop down option on the drop down page
    }

    public List <String> getSelectedOptions (){          // method for getting text of the drop down options
        List <WebElement> selectedElements =
                findDropDownElement().getAllSelectedOptions(); // all values in the drop down
        return selectedElements.stream().map(e->e.getText()).collect(Collectors.toList()); // getting text for every item in the list we are storing it to new list
    }


}
