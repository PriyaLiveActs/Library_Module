package utility;


import org.codehaus.plexus.util.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import supportClass.GenericBaseClass;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import static supportClass.LogFile.*;
import static webDriver.WebDriverDeclarationGenericMethods.driver;
public class ScreenshotsMethods extends GenericBaseClass{

    public void takeScreenshot(String TestcaseStatus)throws Exception {
        String timeStamp = getTimeStamp();
        File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        Error_log.info("Screenshot name " + gm.readProperty(globalConfig, "screenshotpath") + File.separator + page +
                File.separator + timeStamp + ".png");
        if (TestcaseStatus.equalsIgnoreCase("PASS")) {
            FileUtils.copyFile(f, new File(gm.readProperty(globalConfig, "screenshotpath") + File.separator + page +
                    File.separator + timeStamp + "_ PASS" + ".png"));
        }
        else if (TestcaseStatus.equalsIgnoreCase("FAIL")){
            FileUtils.copyFile(f, new File(gm.readProperty(globalConfig, "screenshotpath") + File.separator + page +
                    File.separator + timeStamp + "_ FAIL" + ".png"));
        }
        else{
            Error_log.info("might have some warning ->Methodname -"+getClass().getSimpleName());
            FileUtils.copyFile(f, new File(gm.readProperty(globalConfig, "screenshotpath") + File.separator + page +
                    File.separator + timeStamp + "_ OTHER ISSUE" + ".png"));
        }
    }
    public String getTimeStamp(){
        return new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
    }
}
