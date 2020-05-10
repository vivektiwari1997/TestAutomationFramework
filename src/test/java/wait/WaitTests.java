package wait;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DynamicLoading;
import pages.Example1Page;
import pages.Example2Page;

import static org.testng.Assert.assertEquals;

public class WaitTests extends BaseTests {

    @Test
    public void validateWaitFunctionExample1(){
        DynamicLoading dynamicLoading= homePage.clickDynamicLoading();
        Example1Page example1Page = dynamicLoading.clickExample1();
        example1Page.clickButton();

        assertEquals(example1Page.returnLoadingText(), "Hello World!","incorrect text returned");
    }

    @Test
    public void validateWaitFunctionExample2(){
       DynamicLoading dynamicLoading = homePage.clickDynamicLoading();
        Example2Page example2Page= dynamicLoading.clickExample2();
        example2Page.clickButton();

        assertEquals(example2Page.returnLoadingText(), "Hello World!","incorrect text returned");

    }

}
