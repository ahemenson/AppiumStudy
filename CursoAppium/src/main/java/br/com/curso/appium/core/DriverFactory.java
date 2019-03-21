package br.com.curso.appium.core;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class DriverFactory {	
	
	private static AndroidDriver<MobileElement> driver;	

	private static void createDriver() {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("deviceName", "emulator-5554");
		desiredCapabilities.setCapability("platformVersion", "8.0.0");
		desiredCapabilities.setCapability("automationName", "automator2");
		desiredCapabilities.setCapability(MobileCapabilityType.APP, "/home/eminho/eclipse-workspace/CursoAppium/src/main/resources/CTAppium-1-1.apk");

		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),
					desiredCapabilities);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	}
	
	public static AndroidDriver<MobileElement> getDriver() {
		if(driver == null) {
			createDriver();
		}
		return driver;
	}
	
	public static void killDriver() {
		if(driver != null) {
			driver.quit();
			driver = null;
		}
	}

}