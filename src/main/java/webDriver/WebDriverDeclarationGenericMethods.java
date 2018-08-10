package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.picocontainer.annotations.Inject;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import utility.GetterMethod;
import utility.GetterMethod.*;

import static supportClass.GenericBaseClass.file;
import static supportClass.GenericBaseClass.locatorsfile;

public class WebDriverDeclarationGenericMethods {
    public static WebDriver driver;
    GetterMethod gm = new GetterMethod();

    private WebDriver getDriver() {
        GetBrowser browser = new GetBrowser();
        if (driver == null) {
            System.out.println("browser is null ");
            browser.browserFactory("chrome");
        } else {
           System.out.println("browser already assigned");
        }
        return driver;
    }

    public WebElement getElement(File file, String element) {
        String locator = gm.readProperty(file, element + "type");
        String value = gm.readProperty(file, element);
        WebElement webelement = null;

        if (locator.equalsIgnoreCase("ID"))
            webelement = getDriver().findElement(By.id(value));
        if (locator.equalsIgnoreCase("NAME"))
            webelement = getDriver().findElement(By.name(value));
        if (locator.equalsIgnoreCase("XPATH"))
            webelement = getDriver().findElement(By.xpath(value));
        if (locator.equalsIgnoreCase("LINKTEXT"))
            webelement = getDriver().findElement(By.linkText(value));
        if (locator.equalsIgnoreCase("TAGNAME"))
            webelement = getDriver().findElement(By.tagName(value));
        if (locator.equalsIgnoreCase("CSSSELECTOR"))
            webelement = getDriver().findElement(By.cssSelector(value));
        if (locator.equalsIgnoreCase("CLASSNAME"))
            webelement = getDriver().findElement(By.className(value));

        return webelement;
    }

    public List<WebElement> getElements(String element) throws IOException {

        String locator = gm.readProperty(locatorsfile, element + "type");
        String value = gm.readProperty(locatorsfile, element);
        List<WebElement> webelement = null;

        if (locator.equalsIgnoreCase("ID"))
            webelement = getDriver().findElements(By.id(value));
        if (locator.equalsIgnoreCase("NAME"))
            webelement = getDriver().findElements(By.name(value));
        if (locator.equalsIgnoreCase("XPATH"))
            webelement = getDriver().findElements(By.xpath(value));
        if (locator.equalsIgnoreCase("LINKTEXT"))
            webelement = getDriver().findElements(By.linkText(value));
        if (locator.equalsIgnoreCase("TAGNAME"))
            webelement = getDriver().findElements(By.tagName(value));
        if (locator.equalsIgnoreCase("CSSSELECTOR"))
            webelement = getDriver().findElements(By.cssSelector(value));
        if (locator.equalsIgnoreCase("CLASSNAME"))
            webelement = getDriver().findElements(By.className(value));

        return webelement;
    }

    public void maximize() {
        getDriver().manage().window().maximize();
    }

    public void getUrl(String url) throws Exception {
        implicitWait();
        Thread.sleep(3000);
        getDriver().get(url);
       /* implicitWait();
        getDriver();
        implicitWait();
        Thread.sleep(3000);
        WebDriverDeclarationGenericMethods.driver.get(url);*/
    }

    public void implicitWait() {
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void switchToParentWindow() {
        getDriver().switchTo().defaultContent();
    }

    public void switchToChildWindow(int wins) {
        ArrayList<String> s1 = new ArrayList<String>(getDriver().getWindowHandles());
        System.out.println("No. of child windows " + s1.size());
        getDriver().switchTo().window(s1.get(wins));
    }

    public void movehover(WebElement element) {
        implicitWait();
        new Actions(getDriver()).moveToElement(element).click().build().perform();
    }

    public void Clicking(WebElement element) {
       // System.out.println("Iam with webdriver ");
        element.click();
    }

    public void mouseRobot() throws Exception {
        Robot robot = new Robot();
        robot.mouseMove(200, 50);
        new Actions(getDriver()).click().build().perform();
    }

    public void switchFrame(String frameName) {
        getDriver().switchTo().frame(frameName);
    }

    public void enterText(WebElement element, String text) {
        element.sendKeys(text);
    }

    public void alertSwitch() {
        getDriver().switchTo().alert();
    }

    public void closeDriver() {
        getDriver().quit();
    }

    public void acceptAlert() {
        getDriver().switchTo().alert().accept();
    }
    public void dismissAlert(){
        getDriver().switchTo().alert().dismiss();
    }

}