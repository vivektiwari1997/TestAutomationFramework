package HorizontalSlireTests;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.HorizontalSlider;

import static org.testng.Assert.assertEquals;

public class HorizontalSliderTests extends BaseTests {

    @Test
    public void getSliderValue(){
          String key = "Keys.ARROW_RIGHT";

          HorizontalSlider horizontalSlider= homePage.clickHorizontalPage();
          horizontalSlider.enterKey("A"+ Keys.ARROW_RIGHT);

            System.out.println(horizontalSlider.getIndexValueOnPage());
          assertEquals(horizontalSlider.getIndexValueOnPage(),"0.5","Incorrect key");

    }
}
