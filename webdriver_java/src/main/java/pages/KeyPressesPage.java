package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {
    private WebDriver driver;
     public KeyPressesPage(WebDriver driver){
         this.driver = driver;
     }
     private By inputField = By.id("target");
    private By textDisplay = By.id("result");

     public void entertext(String text){
         driver.findElement(inputField).sendKeys(text);
     }
     public String getText(){
         return driver.findElement(textDisplay).getText();
     }

}
