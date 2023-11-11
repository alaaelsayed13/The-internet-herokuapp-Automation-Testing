package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {
    private WebDriver driver;
    private By inputfield= By.id("target");
    private By resulttext=By.id("result");
    public KeyPressesPage(WebDriver driver){
        this.driver=driver;
    }
    public void enterText(String text){
        driver.findElement(inputfield).sendKeys(text);
    }
    public String getresult(){
        return driver.findElement(resulttext).getText();

    }
}
