package contextmenu;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ContextMenu;
import static org.testng.Assert.*;

@Test
public class ContextMenuTests extends BaseTests {
    public void testContextMenu(){
     ContextMenu contextmenu =   homepage.clickContextMenuPage();
     contextmenu.rightClickbox();
     String AlertContent= contextmenu.getPopUpAlert();
     assertEquals(AlertContent, "You selected a context menu", "Incorrect Message");
    }

}
