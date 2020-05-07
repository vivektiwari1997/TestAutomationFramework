package WYSIWYGEditorPage;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.WYSIWYGEditor;

import static org.testng.Assert.assertEquals;

public class WYSIWYGEditorTests extends BaseTests {

    @Test
    void validateWYSIWYGEditorTests(){
        var editorPage = homePage.clickWYSIWYGEditor();
        editorPage.clearTextArea();

        String text1 = "hello ";
        String text2 = "world";

        editorPage.setTextArea(text1);
        editorPage.decreaseIndention();
        editorPage.setTextArea(text2);

        assertEquals(editorPage.getTextFromEditor(), text1+text2, "Text from editor is incorrect");
    }
}
