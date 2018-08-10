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
            Thread.sleep(3000);
            Assert.assertEquals(Expected,Actual);
            System.out.println("validated successfully #SAVING ");
            Thread.sleep(3000);
            screenshot.takeScreenshot("PASS");
        }
        else{
            System.out.println("Not verified ");
            Thread.sleep(3000);
            screenshot.takeScreenshot("FAIL");
        }
    }

    public void validateField(String Expected, String Actual) throws Exception {
        Thread.sleep(3000);
        Error_log.info("Entered validatefield method ");
        if (Expected.equalsIgnoreCase(Actual)) {
            System.out.println("text matched ***");
            Thread.sleep(3000);
            screenshot.takeScreenshot("PASS");
        } else {
            System.out.println("Not matched....");
            Thread.sleep(3000);
            screenshot.takeScreenshot("FAIL");
        }
    }
    public void checkHeading (String Expected, String Actual) throws Exception{
        Thread.sleep(3000);
        Error_log.info("check Heading method ");
            if(Expected.equalsIgnoreCase(Actual)) {
                Thread.sleep(3000);
                System.out.println("Heading matched ***");
                screenshot.takeScreenshot("PASS");
            }
            else{
                Thread.sleep(3000);
                System.out.println("Heading Not matched....");
                screenshot.takeScreenshot("FAIL");
            }
        }
    }

