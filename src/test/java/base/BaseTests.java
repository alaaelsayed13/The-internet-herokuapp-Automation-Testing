package base;

import Pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.sql.Driver;
import java.util.List;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;
@BeforeClass
    public void SetUp(){
    driver = new ChromeDriver();
    GoHome();
        homePage= new HomePage(driver);

    }
    @BeforeMethod
    public void GoHome(){
        driver.get("https://the-internet.herokuapp.com/");

    }
@AfterClass
public void teardown(){
    driver.quit();
}
}
