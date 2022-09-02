package keys;

import base.BaseTests;
import org.junit.Test;
import org.openqa.selenium.Keys;
import pages.KeyPressesPage;
import static org.testng.Assert.*;

public class KeysTests extends BaseTests {

    @Test
     public void testKeys(){
       KeyPressesPage keyPresses=  homepage.clickKeyPresses();
       keyPresses.entertext("A" + Keys.BACK_SPACE);
      assertEquals( keyPresses.getText(),"You entered: BACK_SPACE","Invalid Message");
    }
}
