package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.picocontainer.annotations.Inject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import utility.GetterMethod;
import utility.GetterMethod.*;

import static supportClass.GenericBaseClass.locatorsfile;

public class WebDriverDeclarationGenericMethods
{
    public static WebDriver driver;
    GetterMethod gm = new GetterMethod();
    private WebDriver getDriver(){
        GetBrowser browser= new GetBrowser();
        if(driver==null){
            browser.browserFactory("chrome");
        }
        else{
            System.out.println("browser already assigned");
        }
        return driver;
    }

    public void maximize(){
        getDriver().manage().window().maximize();
    }
    public void getUrl(String url){
        getDriver().get(url);
    }
    public void implicitWait(){
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public void switchToParentWindow(){
        getDriver().switchTo().defaultContent();
    }
    public void switchToChildWindow(int wins){
        ArrayList<String> s1= new ArrayList<>(getDriver().getWindowHandles());
        System.out.println("No. of child windows "+s1.size());
        getDriver().switchTo().window(s1.get(wins));
    }

    public WebElement getElement(String element){
        String locator=gm.readProperty(locatorsfile,element+"type");
        String value=gm.readProperty(locatorsfile,element);
        WebElement webelement = null;

        if(locator.equalsIgnoreCase("ID"))
            webelement=getDriver().findElement(By.id(value));
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

        String locator = gm.readProperty(locatorsfile,element+"type");
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
    public void movehover(WebElement element){
        implicitWait();
        new Actions(getDriver()).moveToElement(element).build().perform();
    }
    public void Clicking(WebElement element){
        element.click();
    }
}
