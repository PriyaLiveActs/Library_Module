package stepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import supportClass.GenericBaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import  webDriver.WebDriverDeclarationGenericMethods;

import java.io.File;

import static webDriver.WebDriverDeclarationGenericMethods.driver;


public class CucumberHooks extends GenericBaseClass {

    @FindBy(how = How.ID, using = "txtUserName")
    static WebElement log;
    @FindBy(how = How.ID, using = "txtPassword")
    static WebElement pswrd;
    @FindBy(how = How.ID, using = "btnLogin")
    static WebElement loginbtn;
    @FindBy(how = How.XPATH, using = "//a[@href=\"/LibraryManager/\"]")
    static WebElement GoButton;
    private static File file = new File("Properties/globalConfig.properties");
    @Before
    public void launch() throws Exception{
        System.out.println("Entered Background");
        Thread.sleep(3000);
        dm.getUrl(gm.readProperty(file, "url"));

        dm.implicitWait();
        dm.maximize();

        PageFactory.initElements(driver, CucumberHooks.class);
        // Write code here that turns the phrase above into concrete actions
        log.sendKeys(gm.readProperty(file, "id"));
        pswrd.sendKeys(gm.readProperty(file, "pswrd"));
        loginbtn.click();

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
    }



    @After
    public void teardown(){
        System.out.println("Entered Teardown method ");
        dm.closeDriver();
        System.out.println("Initializing the Webdriver to Null ");
        WebDriverDeclarationGenericMethods.driver=null;
    }
}
