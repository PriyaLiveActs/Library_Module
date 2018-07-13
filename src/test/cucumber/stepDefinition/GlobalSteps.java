package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import supportClass.GenericBaseClass;

import java.util.List;

import static webDriver.WebDriverDeclarationGenericMethods.driver;
public class GlobalSteps extends GenericBaseClass{

 @FindBy(how=How.ID,using = "txtUserName")
 static WebElement log;
 @FindBy(how=How.ID,using = "txtPassword")
 static WebElement pswrd;
 @FindBy(how=How.ID,using = "btnLogin")
 static WebElement loginbtn;
 @FindBy(how=How.XPATH,using = "//a[@href=\"/LibraryManager/\"]")
  static WebElement GoButton;

    @Given("^Go to url$")
    public void goToUrl() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       //gm.readProperty(globalConfig,"url");
       dm.getUrl(gm.readProperty(globalConfig,"url"));
       dm.implicitWait();
       dm.maximize();
    }

    @When("^user enter username and pasword and click login$")
    public void userEnterUsernameAndPaswordAndClickLogin() throws Throwable {
        PageFactory.initElements(driver,GlobalSteps.class);
        // Write code here that turns the phrase above into concrete actions
        log.sendKeys(gm.readProperty(globalConfig,"id"));
        pswrd.sendKeys(gm.readProperty(globalConfig,"pswrd"));
        loginbtn.click();
    }

    @Then("^for correct credentials it logged IN then hit go to library$")
    public void forCorrectCredentialsItLoggedINThenHitGoToLibrary() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        dm.implicitWait();
        String ExpectedUrl=driver.getCurrentUrl();
        String ActualUrl="http://qaerp.franciscanecare.net/Modules.aspx";
        if (ExpectedUrl.equalsIgnoreCase(ActualUrl)){
            System.out.println("hit go button");
            GoButton.click();
        }
        dm.switchToChildWindow(1);
        System.out.println("Current Child URL " +driver.getCurrentUrl());
        Thread.sleep(3000);
    }

    @Given("^Go to Global Master icon and hit it$")
    public void goToGlobalMasterIconAndHitIt() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        dm.implicitWait();
        Thread.sleep(2000);
        dm.Clicking(dm.getElement("glomaster"));
        dm.implicitWait();
    }

    @Then("^Check all the sub menus of Global Master$")
    public void checkAllTheSubMenusOfGlobalMaster() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(2000);
        dm.Clicking(dm.getElement("opensessionarrow"));
        List<WebElement> e1= dm.getElements("glomasterelements");
        Thread.sleep(2000);
        int i=0;
        System.out.println(e1.size());

        for (WebElement s1:e1) {
            Thread.sleep(1000);
            System.out.println(e1.get(i).getText());
           // System.out.println("value of i "+i+" "+e1.get(i));
            //System.out.println(s1.getText());
i++;
            }
        System.out.println(i);
        }
    /*@When("^pickup the menus from the main page$")
    public void pickupTheMenusFromTheMainPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("pahuja2");
    }

    @And("^validate the menus from expected menus$")
    public void validateTheMenusFromExpectedMenus() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("pahuja3");
    }

    @Then("^if matched it should move to next scenario and if not then it should throw an error messgae$")
    public void ifMatchedItShouldMoveToNextScenarioAndIfNotThenItShouldThrowAnErrorMessgae() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("pahuja4");
    }*/
}
