package br.com.curso.appium.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class RascunhoTeste2 {
	
	@Test
	public void deveInstalarAPK() throws MalformedURLException {

		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("deviceName", "emulator-5554");
		desiredCapabilities.setCapability("automationName", "appium");
		// desiredCapabilities.setCapability("platformVersion", "8.0");
		// desiredCapabilities.setCapability("appPackage", "com.google.android.calculator");
		// desiredCapabilities.setCapability("appActivity", "com.android.calculator2.Calculator");		
		desiredCapabilities.setCapability(MobileCapabilityType.APP, "/home/eminho/eclipse-workspace/CursoAppium/src/main/resources/CTAppium-1-1.apk");
		
		AndroidDriver<MobileElement> driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),
				desiredCapabilities);

		
		driver.quit();

	}

}
