package com.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.google.common.base.Stopwatch;

public class SeleniumTestCase {
  public static void main(String[] args) {

	    long startTime = System.currentTimeMillis();

    Result result = JUnitCore.runClasses(SendingMessages.class);
    //System.out.println("inside main::::");
   /* for (Run failure : result.getRunCount()) {
    	System.out.println("inside::::");
      System.out.println(failure.toString());
    }*/

  /*  long total = 0;
    for (int i = 0; i < 10000000; i++) {
       total += i;
    }*/
    String newLine = System.getProperty("line.separator");
    for (Failure failure : result.getFailures()) {
    	long stopTime = System.currentTimeMillis();
	    long elapsedTime = stopTime - startTime;
	   // System.out.println(elapsedTime);
//System.out.println("#################################################################################");
System.out.println(" Status     : FAIL "); 
//System.out.println(newLine);
System.out.println(" Time taken : "+elapsedTime+" ms");
//System.out.println(newLine);
      System.out.println(failure.toString());
  //    System.out.println("#################################################################################");
    }
    if(result.wasSuccessful()){
    	 long stopTime = System.currentTimeMillis();
    	    long elapsedTime = stopTime - startTime;
    	 //   System.out.println(elapsedTime);
 //   System.out.println("#################################################################################");
    System.out.println(" Status     : PASS "); 
  //  System.out.println(newLine);
    System.out.println(" Time taken : "+elapsedTime+" ms");
   // System.out.println(newLine);
//    System.out.println("#################################################################################");
    //System.out.println("success:"+result.wasSuccessful());
  }
  }
} 