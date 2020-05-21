package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DropDown;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTests extends BaseTests {

    @Test
    public void testSelectedOption1(){
        DropDown dropDownPage = homePage.clickDropDown();
        String option = "Option 1";
        dropDownPage.selectFromDropDown(option);
        var selectedOptions = dropDownPage.getSelectedOptions(); // this should only return one element
        assertEquals(selectedOptions.size(),1, "Incorrect no of selections");
        assertTrue(selectedOptions.contains(option),"Option incorrect");

    }

    @Test
    public void testSelectedOption2(){
        DropDown dropDownPage = homePage.clickDropDown();
        String option = "Option 2";
        dropDownPage.selectFromDropDown(option);
        var selectedOptions = dropDownPage.getSelectedOptions(); // this should only return one element
        assertEquals(selectedOptions.size(),1, "Incorrect no of selections");
        assertTrue(selectedOptions.contains(option),"Option incorrect");

    }
}
