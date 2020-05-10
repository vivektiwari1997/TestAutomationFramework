package LargeAndDeepDOM;

import base.BaseTests;
import org.testng.annotations.Test;

public class ScrollTests extends BaseTests {

    @Test
    public void validateLargeAndDeepDOM(){                  //test for Large and deep dom
        homePage.clickLargeDeepDOM().scrollToTable();     // use breakpoint & debug method
    }

    @Test
    public void validateInfiniteScroll(){
        homePage.clickInfiniteScroll().switchToParagraph(5);
    }
}
