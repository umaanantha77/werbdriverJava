package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;

    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }

    private By uploadfile = By.id("file-upload");
    private By uploadbutton = By.id("file-submit");

    public void clickUploadFile(String absolutepathoffile){
        driver.findElement(uploadfile).sendKeys(absolutepathoffile);
        clickUploadButton();

    }
    public void clickUploadButton(){
        driver.findElement(uploadbutton).click();
    }
}
