package com.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.google.common.base.Stopwatch;

public class SeleniumMainCase {
  public static void main(String[] args) {

	    long startTime = System.currentTimeMillis();
    Result result = JUnitCore.runClasses(SendingPMessages.class);
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
//      System.out.println("#################################################################################");
    }
    if(result.wasSuccessful()){
    	 long stopTime = System.currentTimeMillis();
    	    long elapsedTime = stopTime - startTime;
    	 //   System.out.println(elapsedTime);
 //   System.out.println("#################################################################################");
    System.out.println(" Status     : PASS "); 
//    System.out.println(newLine);
    System.out.println(" Time taken : "+elapsedTime+" ms");
//    System.out.println(newLine);
//    System.out.println("#################################################################################");
    //System.out.println("success:"+result.wasSuccessful());
  }
  }
} 