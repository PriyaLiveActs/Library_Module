package utility;


import static supportClass.LogFile.Error_log;

public class GenericPageMethods {

    //Verification Method
    //check whether Global master is opened or not
    public boolean gloMasterOpen(String attribute){
        if(attribute.equalsIgnoreCase("active")){
            Error_log.info("Global master is already opened!!! ");
            return true;
        }
        else
            Error_log.info("Nothing is opened");
            return false;
    }
}
