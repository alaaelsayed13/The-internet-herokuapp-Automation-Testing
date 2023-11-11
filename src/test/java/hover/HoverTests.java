package hover;

import base.BaseTests;
import com.google.errorprone.annotations.Var;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HoverTests extends BaseTests {
    @Test
    public void testHoverUser1(){
var hoverspage=homePage.clickHovers();
var caption =hoverspage.HoverOverFig(1);
assertTrue(caption.isCaptionDisplayed(), "error");
assertEquals(caption.getTitle(),"name: user1","eror");
assertEquals(caption.getLinkText(),"View profile","error");
assertTrue(caption.getLink().endsWith("/users/1"),"error");
    }
}
