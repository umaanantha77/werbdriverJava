package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenu {
    private WebDriver driver;
    public ContextMenu(WebDriver driver){
        this.driver = driver;
    }
    private By rightClickBox = By.id("hot-spot");

    public void rightClickbox() {

Actions actions = new Actions(driver);
actions.contextClick(driver.findElement(rightClickBox)).perform();


    }
    public String getPopUpAlert(){
        return driver.switchTo().alert().getText();
    }

    public void clickOk(){
        driver.switchTo().alert().accept();
    }

    }

