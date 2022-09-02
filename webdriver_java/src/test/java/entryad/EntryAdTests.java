package entryad;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.EntryAdPage;
import static org.testng.Assert.*;

public class EntryAdTests extends BaseTests {

    @Test

    public void testEntryAd(){
       EntryAdPage entryadpage = homepage.clickEntryAd();
       entryadpage.displayModal();
      String title = entryadpage.getText();
      assertEquals(title, "This is a modal window","Wrong Title");
      entryadpage.clickCloseButton();
    }
}
