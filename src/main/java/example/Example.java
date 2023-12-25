package example;

import org.apache.log4j.Logger;

public class Example {

    final static Logger logger = Logger.getLogger(Example.class);
    
    public static void main(String[] args) {

        Example obj = new Example();
        obj.runMe("Sample Test Message");
        
    }
    
    private void runMe(String parameter){
        
        if(logger.isDebugEnabled()){
            logger.debug("This is debug : " + parameter);
        }
        
        if(logger.isInfoEnabled()){
            logger.info("This is info : " + parameter);
        }
        
        logger.warn("This is warn : " + parameter);
        logger.error("This is error : " + parameter);
        logger.fatal("This is fatal : " + parameter);
        
    }
    
}
