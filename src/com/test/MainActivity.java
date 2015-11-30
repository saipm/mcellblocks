package com.test;

import static org.junit.Assert.*;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import android.content.Intent;
import android.net.Uri;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class MainActivity {
	
	
public static void main(String[] args) {
	long phonenumber = 4259519067L;

  
		Intent smsIntent = new Intent(Intent.ACTION_SENDTO);
		smsIntent.addCategory(Intent.CATEGORY_DEFAULT);
		smsIntent.setType("vnd.android-dir/mms-sms");
		smsIntent.setData(Uri.parse("sms:" + phonenumber)); 
	}
}
