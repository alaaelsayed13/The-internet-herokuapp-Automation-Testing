package keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class KeysTest extends BaseTests {
    @Test
    public void TestBackSpace(){
        var keypage=homePage.clickkeypresses();
        keypage.enterText("A" + Keys.BACK_SPACE);
        assertEquals(keypage.getresult(),"You entered: BACK_SPACE","error");


    }
}
