package com.loggerdemo.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoggerDemoTest {


    final static Logger log = LogManager.getLogger(LoggerDemoTest.class.getName());


        @Test
        public static void maintest() throws Exception{

		 log.trace("trace");
		 log.debug("debug");
		 log.info("info");
		 log.warn("warn");
		 log.error("error");
		 log.fatal("fatal");

            try{
    			int s;
    			s = 9/3;
                System.out.println("The current value for 's' is now: " + s);
                Assert.assertEquals(3,s);

            }catch (Exception e){
                log.error("Failed to divide by zero.",e);
            }


        }
}

