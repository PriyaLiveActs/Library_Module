package supportClass;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class LogFile {
    public static final Logger Info_log= Logger.getLogger("Info_log");
    public static final Logger Error_log= Logger.getLogger("Error_log");
    static{
        init();
    }
    private static void  init(){
        DOMConfigurator.configure("log4J.xml");
    }
}
