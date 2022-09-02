package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    //private By formAuthenticationLink = By.linkText("Form Authentication");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage clickFormAuthenticationLink(){
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

     private void clickLink(String LinkText){
        driver.findElement(By.linkText(LinkText)).click();

     }
     public DropdownPage clickDropDownPage(){
        clickLink("DropDown");
        return new DropdownPage(driver);
     }
    public KeyPressesPage clickKeyPresses(){
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }

public ContextMenu clickContextMenuPage(){
        clickLink( "Context Menu");
        return new ContextMenu(driver);

}
public EntryAdPage clickEntryAd(){
        clickLink("Entry Ad");
        return new EntryAdPage(driver);
}
}
