package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class ReadInputScannerExample {

    public static void main(String args[]) throws IOException, InterruptedException  {
    	
    	System.out.println("****************************************************************************");
    	System.out.println("                            MCELLBLOCKS                                     ");
    	System.out.println("****************************************************************************");
    	String command = "adb devices";
    	List<String> deviceList = new ArrayList<String>();
		Process p;
		int i=1;
		try {
			p = Runtime.getRuntime().exec(command);
			p.waitFor();
			String line="";
            BufferedReader input1 = new BufferedReader(new InputStreamReader(p.getInputStream()));
			while ((line = input1.readLine()) != null) {
			    if (line.endsWith("device")) {
			        deviceList.add(line.split("\\t")[0]);
			    } if (line.endsWith("unauthorized")) {
			        deviceList.add(line.split("\\t")[0]);
			    }
			}
			}catch(Exception e){
				e.printStackTrace();
			}
		System.out.println("Devices connected:");
		for(String s:deviceList){
			System.out.println(i+"."+s);
		    i++;	
		}
		System.out.println(".............................................................................");
		System.out.println("Select the testcases to run:-");
    	System.out.println("1. Messaging through Trillian");
    	System.out.println("2. Text Messaging");
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        System.out.println("Please enter the testcase you want to run (1/2) :---");
        int number = scanner.nextInt();
        Date date = new Date();
        Process javaprocess;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss") ;
        if(number==1){
        	//SampleJavaTest sj = new SampleJavaTest();
        	String[] args1 = {};
        	SampleJavaTest.main(args1);
        
        }
        
        if(number==2){
        	String textPath="/home/saisreem/.npm-packages/lib/node_modules/appium/bin/./textMessages.sh ";
        	Process textProcess;
        	for(String s:deviceList){
        		System.out.println("-----------------------------------------------------------");
        		System.out.println("DeviceId:----"+s);
        		System.out.println("-----------------------------------------------------------");
        		System.out.println("Please enter the sender mobile number with country code:---");
        		String input = scanner.next();
        		System.out.println("-----------------------------------------------------------");
        		scanner.nextLine();
        		System.out.println("Please enter the message:---");
        		String message = scanner.nextLine();
        		textProcess = Runtime.getRuntime().exec(textPath+s+" "+input+" "+message);
        		textProcess.waitFor();
        		BufferedReader br = new BufferedReader(new InputStreamReader(textProcess.getInputStream()));
	            PrintWriter pw = new PrintWriter(textProcess.getOutputStream());
	            String line;

	            while ((line = br.readLine()) != null) {
	                System.out.println(line);
	                pw.flush();
	            }
        	}
        	
        }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }}
      /*  	String path="/home/saisreem/.npm-packages/lib/node_modules/appium/bin/";
        	String logpath="/home/saisreem/workspace/junittest/logs/trillianlog_";
        	String command1=path+"./appium.js > "+logpath+dateFormat.format(date)+".txt";
        	String command2="/home/saisreem/.npm-packages/lib/node_modules/appium/bin/./test.sh "+logpath+dateFormat.format(date)+".txt";
        	String java_command="/home/saisreem/.npm-packages/lib/node_modules/appium/bin/./javatest.sh";
        	String kill_command="fuser -k 4900/tcp";
        	System.out.println(command2);
        	Process pnew;
        	try {
        		String runappium="/home/saisreem/.npm-packages/lib/node_modules/appium/bin/./appium.js";
        		p = Runtime.getRuntime().exec(runappium);
        		//for(String s:deviceList){
        			System.out.println("Device Id:---");
        			command2 = "/home/saisreem/.npm-packages/lib/node_modules/appium/bin/./appium.js -p 4900 -U 1090963b";
        			//command2="/home/saisreem/.npm-packages/lib/node_modules/appium/bin/./test.sh "+s+" "+logpath+s+"_"+dateFormat.format(date)+".txt";
    				//System.out.println(i+"."+s);
        		Thread.sleep(10000);
    			//p = Runtime.getRuntime().exec(command2);
    			//Thread.sleep(1000);
    			javaprocess = Runtime.getRuntime().exec(java_command);
    			javaprocess.waitFor();
    			 BufferedReader br = new BufferedReader(new InputStreamReader(javaprocess.getInputStream()));
    	            PrintWriter pw = new PrintWriter(javaprocess.getOutputStream());
    	            String line;

    	            while ((line = br.readLine()) != null) {
    	                System.out.println(line);
    	                pw.flush();
    	            }
    		   //   Process killprocess;
    		     // killprocess = Runtime.getRuntime().exec(kill_command);
    		      //killprocess.waitFor();
    		      Thread.sleep(4000);
    		String command4 = "/home/saisreem/.npm-packages/lib/node_modules/appium/bin/./appium.js -p 4901 -U 1a5dacc6";
      		System.out.println("here:::::::::::::");
      		Thread.sleep(10000);
  			Process p2 = Runtime.getRuntime().exec(command4);
  			System.out.println("here:::::::::::::");
  			Thread.sleep(1000);
  			System.out.println("here:::::::::::::");
  			Process javaprocess2 = Runtime.getRuntime().exec(java_command);
  			System.out.println("here:::::::::::::");
  			javaprocess2.waitFor();
  			System.out.println("here:::::::::::::");
  			 BufferedReader br1 = new BufferedReader(new InputStreamReader(javaprocess2.getInputStream()));
  	            PrintWriter pw1 = new PrintWriter(javaprocess2.getOutputStream());
  	            String line11;

  	            while ((line11= br1.readLine()) != null) {
  	                System.out.println(line11);
  	                pw1.flush();
  	            }
  		      //Process killprocess1;
  		      //killprocess1 = Runtime.getRuntime().exec(kill_command);
  		      //killprocess1.waitFor();
  		      Thread.sleep(4000);
        		
    			}catch(Exception e){
    				e.printStackTrace();
    			}
        }*/
     
    
 


//Read more: http://javarevisited.blogspot.com/2012/12/how-to-read-input-from-command-line-in-java.html#ixzz3sOGrox1S

/* if(number==1){
System.out.println("Select the type of device :-");
System.out.println("1. Physical ");
System.out.println("2. Emulator");
}*/
// String input = scanner.nextLine();
// System.out.println("User Input from console: " + input);
//  System.out.println("Reading int from console in Java: ");
//   int number = scanner.nextInt();
// System.out.println("Integer input: " + number);
//java.util.Date date = new java.util.Date();