package KeyPress;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.KeyPresses;

import static org.testng.Assert.assertEquals;

public class KeyPressTests extends BaseTests {

    @Test
    public void keyPress(){
        KeyPresses keyPresses=homePage.clickKeyPress();
        keyPresses.enterKey("A"+Keys.ARROW_DOWN);
        assertEquals(keyPresses.getResult(),"You entered: DOWN", "Incorrect key");
    }
    //@Test
    //public void keyPressPie(){
      //  KeyPresses keyPresses=homePage.clickKeyPress();  // test method for verifying double key press simultaneously
        //keyPresses.sendPie();
    //}
}
