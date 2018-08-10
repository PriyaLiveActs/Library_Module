package pageObjects.globalmaster;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import static supportClass.GenericBaseClass.*;
import static supportClass.LogFile.*;
public class DefineAuthor {

    public DefineAuthor(WebDriver d){
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);

    }
    public void openGlobalmaster(){
        System.out.println("path of file "+file);
        dm.Clicking(dm.getElement(file,"glomaster"));
    }
    public void openAuthor(){
        dm.Clicking(dm.getElement(file,"authormenu"));
    }
    public void validateBlank() throws Exception{
        String text=dm.getElement(file,"blankfieldmessage").getText();
        System.out.println("validate Blank method :- text " +text);
        validation.validateBlankField(dm.getElement(file,"authorfield"),gm.readProperty(file,"blankvalidationmessage"),text);
    }
    public void hitSave(){
        System.out.println("Iam in hit save ");
       WebElement save=dm.getElement(file,"savebutton");
       dm.implicitWait();
       System.out.println("Save webelemet "+save);
       //dm.movehover(save);
       dm.Clicking(save);
    }

    public void textEntering(String text){
        Error_log.info("Entered text entering method");
       WebElement authortextfield = dm.getElement(file,"authorfield");
       dm.implicitWait();
       dm.enterText(authortextfield,text);
    }

    public void validateSaveText()throws Exception{
        Error_log.info("Entered validate savetext method ");
        dm.switchToParentWindow();
        String text=dm.getElement(file,"savemessage").getText();
        Thread.sleep(3000);
        System.out.println("text*** "+text);
       // String headtext = dm.getElement(file,"saveHeadingmessage").getText();
        //System.out.println("headtext*** "+headtext);
        dm.implicitWait();
        try {
            Thread.sleep(3000);
           validation.validateField(gm.readProperty(file, "savedsuccessfullymessage"), text);
           Thread.sleep(3000);
         //  validation.checkHeading(gm.readProperty(file,"saveHeading"),headtext);

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        Thread.sleep(3000);
        WebElement ok=dm.getElement(file,"okaybutton");
        dm.Clicking(ok);

    }
    public void checkmenustatus(WebElement status){
        String attribute=status.getAttribute("class");
        Error_log.info("Entered in checkmenu status. Now the class attribute value is " +attribute);
        boolean active_status= genericPageMethods.gloMasterOpen(attribute);
        Error_log.debug("Status got from method is "+active_status);
        if (active_status==true){
           Error_log.debug("Entered the other text ");
        }
        else
            Error_log.info("Not to do anything just hit author menu now ");
            dm.implicitWait();
            openGlobalmaster();
            dm.implicitWait();
            openAuthor();
        }
}
