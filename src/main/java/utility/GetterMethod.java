package utility;

import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class GetterMethod {

  private Properties prop = new Properties();

  public String readProperty(File file, String key){
    String value= null;
    if(file.exists()){
        try
        {
           FileInputStream stream = new FileInputStream(file);
            //FileReader reader = new FileReader(file);
            prop.load(stream);
            value=prop.getProperty(key);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    else{
        System.out.println("unable to read file. File path is incorrect");
    }
      return value;
  }
    public String getPackage(String pack) {
        String[] packs = pack.split("\\.");
        return packs[1];
    }
  public File getFilePath(String page, String pack){
        return new File("Properties"+File.separator+pack+File.separator+page+".properties");
  }

}
