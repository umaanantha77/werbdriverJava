package dropdown;

import base.BaseTests;
import org.junit.Test;
import pages.DropdownPage;

import java.util.List;
import static org.testng.Assert.*;

public class DropDownTests extends BaseTests {

    @Test
     public void testDropDown(){
        String Option = "Option 1";
       DropdownPage dropDownPage= homepage.clickDropDownPage();
       dropDownPage.selectFromDropdown(Option);
      List<String> selectedOptions = dropDownPage.getSelectedOption();
      assertEquals(selectedOptions.size(),1,"Invalid Value");
assertTrue(selectedOptions.contains(Option),"Incorrect Option");
    }
}
