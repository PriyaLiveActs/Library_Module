package supportClass;

import utility.GenericPageMethods;
import utility.GetterMethod;
import utility.ScreenshotsMethods;
import utility.VerifyValidation;
import webDriver.WebDriverDeclarationGenericMethods;
import utility.ScreenshotsMethods.*;
import java.io.File;

public class GenericBaseClass {

   public static String page=null;
   public static String pack=null;
   public static File file= null;

   public static GetterMethod gm = new GetterMethod();
   public static WebDriverDeclarationGenericMethods dm= new WebDriverDeclarationGenericMethods();
   public static File globalConfig = new File("Properties/globalConfig.properties");
   public static File locatorsfile = new File("Properties/Locators.properties");
   public static ScreenshotsMethods screenshot= new ScreenshotsMethods();
   public static VerifyValidation validation = new VerifyValidation();
   public static GenericPageMethods genericPageMethods = new GenericPageMethods();
}
