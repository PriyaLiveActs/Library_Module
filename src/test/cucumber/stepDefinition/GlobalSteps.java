package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import supportClass.GenericBaseClass;

import java.io.File;
import java.util.List;

import static webDriver.WebDriverDeclarationGenericMethods.driver;
public class GlobalSteps extends GenericBaseClass {

    @FindBy(how = How.ID, using = "txtUserName")
    static WebElement log;
    @FindBy(how = How.ID, using = "txtPassword")
    static WebElement pswrd;
    @FindBy(how = How.ID, using = "btnLogin")
    static WebElement loginbtn;
    @FindBy(how = How.XPATH, using = "//a[@href=\"/LibraryManager/\"]")
    static WebElement GoButton;
    private static File file = new File("Properties/globalConfig.properties");
     /*   @Given("^Go to url$")
    public void goToUrl() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //gm.readProperty(globalConfig,"url");
        System.out.println("Entered Background");
        dm.getUrl(gm.readProperty(file, "url"));
        dm.implicitWait();
        dm.maximize();
    }

    @When("^user enter username and pasword and click login$")
    public void userEnterUsernameAndPaswordAndClickLogin() throws Throwable {
        PageFactory.initElements(driver, GlobalSteps.class);
        // Write code here that turns the phrase above into concrete actions
        log.sendKeys(gm.readProperty(file, "id"));
        pswrd.sendKeys(gm.readProperty(file, "pswrd"));
        loginbtn.click();
    }

    @Then("^for correct credentials it logged IN then hit go to library$")
    public void forCorrectCredentialsItLoggedINThenHitGoToLibrary() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        dm.implicitWait();
        String ExpectedUrl = driver.getCurrentUrl();
        String ActualUrl = "http://qaerp.franciscanecare.net/Modules.aspx";
        if (ExpectedUrl.equalsIgnoreCase(ActualUrl)) {
            System.out.println("hit go button");
            GoButton.click();
        }
        dm.switchToChildWindow(1);
        System.out.println("Current Child URL " + driver.getCurrentUrl());
        Thread.sleep(3000);
        System.out.println("This is background");
    }*/
}
