package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
private WebDriver driver;
private By usernamefield= By.id("username");
private By passwordfield= By.id("password");
private By LoginButton= By.cssSelector("#login button");

public LoginPage(WebDriver driver){
this.driver = driver;
}
public void SetUserName(String username){
    driver.findElement(usernamefield).sendKeys(username);

}
    public void SetPassword(String password){
        driver.findElement(passwordfield).sendKeys(password);

    }
    public SecureAreaPage clickloginbutton(){
    driver.findElement(LoginButton).click();
    return new SecureAreaPage(driver);
    }

}

