package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
  private WebDriver driver;
    private By FormAuthenticationLink = By.linkText("Form Authentication");
    public HomePage(WebDriver driver){
    this.driver=driver;
    }
    public LoginPage ClickFormAuthentication(){
driver.findElement(FormAuthenticationLink).click();
return new LoginPage(driver);
    }
    private void Clicklink(String linktext){
      driver.findElement(By.linkText(linktext)).click();
    }
    public HoversPage clickHovers(){
      Clicklink("Hovers");
      return new HoversPage(driver);
    }
    public KeyPressesPage clickkeypresses(){
        Clicklink("Key Presses");
        return new KeyPressesPage(driver);
    }
    public AlertsPage clickJSAlert(){
        Clicklink("JavaScript Alerts");
     return new AlertsPage(driver);
    }
    public WYSIWYGEditorPage clickwysiwyg(){
Clicklink("WYSIWYG Editor");
return new WYSIWYGEditorPage(driver);

    }
}
