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
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class SendingMotogMessages {
	@Test
    public void test() throws MalformedURLException, InterruptedException {
		File appDir = new File("/home/saisreem/workspace/junittest/");
		File app = new File(appDir, "Trillian_3.1.0.12.apk");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "2000");
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "2000");
		driver.findElementByClassName("android.widget.Button").click();
		List<WebElement> a = driver.findElements(By.className("android.widget.EditText"));
		a.get(1).click();
		driver.findElementById("com.ceruleanstudios.trillian.android:id/ShortLoginScreen_Edit_Username")
				.sendKeys("saisreepm");
		driver.findElementById("com.ceruleanstudios.trillian.android:id/ShortLoginScreen_Edit_Password")
				.sendKeys("saipm123");
		driver.findElementById("com.ceruleanstudios.trillian.android:id/ShortLoginScreen_Button_Login").click();
/*		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60000");
 * */
		Thread.sleep(10000);
		List<WebElement> b = driver.findElements(By.className("android.widget.ImageView"));
		Thread.sleep(10000);
		b.get(1).click();
		//driver.findElementById("android:id/button1").click();
		
		driver.findElementByClassName("android.app.ActionBar$Tab").click();
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "20000");
		List<WebElement> d = driver.findElements(By.className("android.app.ActionBar$Tab"));
		d.get(1).click();
		driver.findElementById("com.ceruleanstudios.trillian.android:id/ContactListScreen_ContactListTree_Contact_Name")
				.click();
		driver.findElementByClassName("android.widget.EditText").sendKeys("Re-testing to show Sri.");
		List<WebElement> e = driver.findElements(By.className("android.widget.ImageButton"));
		e.get(2).click();
		//driver.findElementByClassName("android.widget.ImageButton").click();
	}
}
