package supportClass;

import utility.GetterMethod;
import webDriver.WebDriverDeclarationGenericMethods;

import java.io.File;

public class GenericBaseClass {
   public GetterMethod gm = new GetterMethod();
   public WebDriverDeclarationGenericMethods dm= new WebDriverDeclarationGenericMethods();
   public static File globalConfig = new File("Properties/globalConfig.properties");
   public static File locatorsfile = new File("Properties/Locators.properties");
}
