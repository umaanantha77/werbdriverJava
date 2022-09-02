package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureArea {
    private WebDriver driver;
    public SecureArea(WebDriver driver) {
        this.driver = driver;
    }
    private By SecureAreaAlert = By.id("flash");

    public String getStatusAlert(){
        return driver.findElement(SecureAreaAlert).getText();
    }
}
