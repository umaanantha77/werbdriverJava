package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureArea;

import static org.testng.Assert.*;


public class LoginTests extends BaseTests {

@Test
    public void testSuccessfullLogin(){
     LoginPage loginPage = homepage.clickFormAuthenticationLink();
     loginPage.setUsernameField("tomsmith");
     loginPage.setPasswordField("SuperSecretPassword!");
     SecureArea securearea = loginPage.clickLoginButton();
    //assertEquals(securearea.getStatusAlert(), "You logged into a secure area! x", "Alert text is incorrect");
assertTrue(securearea.getStatusAlert().contains("You logged into a secure area! x"), "Alert text is incorrect");

    }

}
