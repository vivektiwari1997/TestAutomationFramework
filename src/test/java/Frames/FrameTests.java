package Frames;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.MultipleFrames;
import pages.NestedFrames;

import static org.testng.Assert.assertEquals;

public class FrameTests extends BaseTests {

    @Test
    public void validateNestedFrames(){
       MultipleFrames multipleFrames= homePage.clickFrames();
       NestedFrames nestedFrames = multipleFrames.clickNestedFrames();

       assertEquals(nestedFrames.switchToNestedLeft(),"LEFT","incorrect frame text");
    }
}
