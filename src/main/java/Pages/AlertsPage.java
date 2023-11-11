package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {
   private WebDriver driver;
   private By results=By.id("result");
   private By triggerAlertButton=By.xpath(".//button[text()='Click for JS Alert']");
    public AlertsPage(WebDriver driver){
        this.driver=driver;
    }
    public void triggerAlert(){
        driver.findElement(triggerAlertButton).click();
    }
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }
    public String getResult(){
       return driver.findElement(results).getText();
    }
}
