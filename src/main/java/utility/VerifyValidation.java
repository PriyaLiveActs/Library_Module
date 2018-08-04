package utility;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import supportClass.GenericBaseClass;
import static supportClass.LogFile.*;

import static supportClass.GenericBaseClass.*;
public class VerifyValidation {

    public void validateBlankField(WebElement w,String Expected,String Actual) throws Exception{
        System.out.println("get text of W " +w.getText());
        if(w.getText().equalsIgnoreCase("")){
            Assert.assertEquals(Expected,Actual);
            System.out.println("validated successfully #SAVING ");
            screenshot.takeScreenshot("PASS");
        }
        else{
            System.out.println("Not verified ");
            screenshot.takeScreenshot("FAIL");
        }
    }

    public void validateField(String Expected, String Actual) throws Exception {
        Error_log.info("Entered validatefield method ");
        if (Expected.equalsIgnoreCase(Actual)) {
            System.out.println("text matched ***");
            screenshot.takeScreenshot("PASS");
        } else {
            System.out.println("Not matched....");
            screenshot.takeScreenshot("FAIL");
        }
    }
    public void checkHeading (String Expected, String Actual) throws Exception{
        Error_log.info("check Heading method ");
            if(Expected.equalsIgnoreCase(Actual)) {
                System.out.println("Heading matched ***");
                screenshot.takeScreenshot("PASS");
            }
            else{
                System.out.println("Heading Not matched....");
                screenshot.takeScreenshot("FAIL");
            }
        }
    }

