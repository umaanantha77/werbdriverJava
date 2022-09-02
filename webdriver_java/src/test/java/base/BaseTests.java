package base;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homepage;
@BeforeClass
    public void setUp(){
        System.setProperty("WebDriver.Chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        homepage = new HomePage(driver);

    }
    @AfterClass
    public void tearDown(){
    driver.quit();
    }
}
