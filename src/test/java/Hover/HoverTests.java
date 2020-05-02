package Hover;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HoversPage;

import static org.testng.Assert.*;

public class HoverTests extends BaseTests {

    @Test
    public void testHoverUser1(){
        HoversPage hoversPage=homePage.clickHover();
        HoversPage.ImageCaption imageCaption= hoversPage.hoverOverImage(1);
        assertTrue(imageCaption.captionIsDisplayed(),"Caption not displayed");
        assertEquals(imageCaption.getImageCaptionHeader(),"name: user1","incorrect details");
        assertTrue(imageCaption.getImageCaptionProfileLink().endsWith("/users/1"), "Link incorrect");

    }
}
