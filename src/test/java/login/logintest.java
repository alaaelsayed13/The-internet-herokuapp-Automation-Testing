package login;

import Pages.LoginPage;
import Pages.SecureAreaPage;
import base.BaseTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class logintest extends BaseTests {
    @Test
    public void SuccessfulLogin(){
     LoginPage loginPage = homePage.ClickFormAuthentication();
     loginPage.SetUserName("tomsmith");
     loginPage.SetPassword("SuperSecretPassword!");
   SecureAreaPage secureAreaPage= loginPage.clickloginbutton();
   secureAreaPage.getAlertText();
   assertTrue("Error", secureAreaPage.getAlertText().contains("You logged into a secure area!"));
    }
}
