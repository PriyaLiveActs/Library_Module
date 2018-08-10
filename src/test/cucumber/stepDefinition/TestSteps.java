package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebElement;
import pageObjects.globalmaster.DefineAuthor;
import supportClass.GenericBaseClass;
//import static supportClass.GenericBaseClass;
import static webDriver.WebDriverDeclarationGenericMethods.driver;
import static supportClass.LogFile.*;
public class TestSteps extends GenericBaseClass{

    @When("^User Open Define Author page$")
    public void user_Open_Define_Author_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //Info_log.info("Opening Define Author Page");
        Error_log.info("Open Define Author page ");
        dm.implicitWait();
        new DefineAuthor(driver).openGlobalmaster();
        Thread.sleep(2000);
        new DefineAuthor(driver).openAuthor();
        //dm.Clicking(dm.getElement("glomaster"));
        dm.implicitWait();
    }
    @And("^hit Save Button$")
    public void hit_Save_Button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(3000);
        Error_log.info("Hit save Button ");
        dm.switchFrame("Define Author");
        Thread.sleep(3000);
        new DefineAuthor(driver).hitSave();
        dm.implicitWait();
    }

    @Then("^Verify the error messages$")
    public void verify_the_error_messages() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Error_log.info("Verifying the Error Message");
        Thread.sleep(3000);
        new DefineAuthor(driver).validateBlank();
    }

    @When("^User Open Define Author Page$")
    public void user_Open_Define_Author_Page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Error_log.info("Open Define Author page , Now chck whether menyu is opened or not");
        dm.implicitWait();
        WebElement status=dm.getElement(globalConfig,"glomasteropencheck");
        new DefineAuthor(driver).checkmenustatus(status);
        Thread.sleep(2000);
        //dm.Clicking(dm.getElement("glomaster"));
        dm.implicitWait();
        System.out.println("This is autohr page");
    }
    @And("^Enter Input to \"([^\"]*)\" field$")
    public void enterInputToField(String text) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        dm.switchFrame("Define Author");
        Error_log.info("Entered Input To Field " +text);
        Thread.sleep(3000);
        String s1=text;
        new DefineAuthor(driver).textEntering(s1);
    }

    @Then("^Hit Save and Verify the input$")
    public void hit_Save_and_Verify_the_input() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Error_log.info("HIT SAVE NOW ");
        Thread.sleep(3000);
        new DefineAuthor(driver).hitSave();
        dm.implicitWait();
        dm.implicitWait();
        Thread.sleep(5000);
        new DefineAuthor(driver).validateSaveText();

    }


    @And("^Enter multiple \"([^\"]*)\" inputs to AuthorName field$")
    public void enterMultipleInputsToAuthorNameField(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Verify the length validations on inputs$")
    public void verifyTheLengthValidationsOnInputs() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^Enter the Authorname as \"([^\"]*)\"$")
    public void enterTheAuthornameAs(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^While hitting save verify the message$")
    public void whileHittingSaveVerifyTheMessage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }



}
