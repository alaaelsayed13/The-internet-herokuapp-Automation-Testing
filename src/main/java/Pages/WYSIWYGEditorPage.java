package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WYSIWYGEditorPage {
private WebDriver driver;
private String EditorIdFrame="mce_0_ifr";
private By TextArea=By.id("tinymce");
public WYSIWYGEditorPage(WebDriver driver){
    this.driver=driver;
}
public void ClearTextArea(){
    SwitchToEditArea();
    driver.findElement(TextArea).clear();
    SwitchToMain();
}
    public void SendTextArea(String text){
        SwitchToEditArea();
        driver.findElement(TextArea).sendKeys(text);
        SwitchToMain();
    }
private void SwitchToEditArea(){
    driver.switchTo().frame(EditorIdFrame);
}
private void SwitchToMain(){
    driver.switchTo().parentFrame();
}
}
