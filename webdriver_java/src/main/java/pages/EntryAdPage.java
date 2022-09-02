package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EntryAdPage {
     private WebDriver driver;

     public EntryAdPage(WebDriver driver){
         this.driver = driver;
     }
     private By modalDisplay = By.className("modal");
     private By closeButton = By.className("modal-footer");
    private By modalTitle = By.className("modal-title");
     public void displayModal(){
        WebElement display = driver.findElement(modalDisplay);

     }
     public String getText (){
       // WebElement title =  driver.findElement(modalTitle);
        // String modalTitle= driver.getTitle();
        // return modalTitle; current study
         return driver.findElement(modalTitle).getText();

     }
     public void clickCloseButton(){
         driver.findElement(closeButton).click();
     }
}
