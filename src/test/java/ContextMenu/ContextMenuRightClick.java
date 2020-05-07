package ContextMenu;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ContextMenu;

import static org.testng.Assert.assertEquals;

public class ContextMenuRightClick extends BaseTests {

    @Test
    public void validateRightClick()
    {
       ContextMenu contextMenu = homePage.clickContextMenu();
       contextMenu.rightClickOnBox();
        String ActualText = contextMenu.getAlertText();
        contextMenu.alertAccept();
       assertEquals(ActualText,"You selected a context menu", "incorrect text");

    }
}
