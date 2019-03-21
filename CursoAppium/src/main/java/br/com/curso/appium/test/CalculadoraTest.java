package br.com.curso.appium.test;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class CalculadoraTest {	
	
	@Test
	public void deveSomarDoisValores() throws MalformedURLException {
		
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName","Android");
		desiredCapabilities.setCapability("deviceName", "NewDevice1_API_26");
		desiredCapabilities.setCapability("automationName", "appium");
		desiredCapabilities.setCapability("platformVersion", "8.0");
		desiredCapabilities.setCapability("appPackage", "com.android.calculator2");
		desiredCapabilities.setCapability("appActivity", "com.android.calculator2.Calculator");

        AndroidDriver<MobileElement> driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
        
        MobileElement el1 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_2");
        el1.click();
        MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("plus");
        el2.click();
        MobileElement el3 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_2");
        el3.click();        
        MobileElement el6 = (MobileElement) driver.findElementById("com.android.calculator2:id/result");
        
        // System.out.println(el6.getText());
        
        assertEquals("4", el6.getText());
                
        driver.quit();
		
	}

}
