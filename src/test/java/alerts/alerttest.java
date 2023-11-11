package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class alerttest extends BaseTests {
    @Test
    public void testAcceptalert(){
       var alertspge= homePage.clickJSAlert();
       alertspge.triggerAlert();
       alertspge.acceptAlert();
       alertspge.getResult();
       assertEquals(alertspge.getResult(),"You successfully clicked an alert","error");
    }
}
