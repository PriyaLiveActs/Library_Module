package webDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import supportClass.GenericBaseClass;
import webDriver.WebDriverDeclarationGenericMethods;
import org.openqa.selenium.WebDriver;

public class GetBrowser extends GenericBaseClass {

    protected WebDriver browserFactory(String browser)
    {
        switch(browser) {

            case "chrome":

                try{
                   String s= gm.readProperty(globalConfig,"chromeDriver");
                   String s1=gm.readProperty(globalConfig,"chromeDriverPath");
                   System.setProperty(s,s1);
                   WebDriverDeclarationGenericMethods.driver=new ChromeDriver();
                }
                catch(Exception e){
                 e.printStackTrace();
                }
                break;
            default :
                System.out.println("no broser name given");
        }
        return WebDriverDeclarationGenericMethods.driver;
    }
}
