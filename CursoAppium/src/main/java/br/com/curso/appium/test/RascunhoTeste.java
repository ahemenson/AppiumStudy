package br.com.curso.appium.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.DriverManager;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class RascunhoTeste {
	
	@Test
	public void devePreencherCampo() throws MalformedURLException {

		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("deviceName", "emulator-5554");
		desiredCapabilities.setCapability("automationName", "uiautomator2");
		// desiredCapabilities.setCapability("platformVersion", "8.0");
		// desiredCapabilities.setCapability("appPackage", "com.google.android.calculator");
		// desiredCapabilities.setCapability("appActivity", "com.android.calculator2.Calculator");		
		desiredCapabilities.setCapability(MobileCapabilityType.APP, "/home/eminho/eclipse-workspace/CursoAppium/src/main/resources/CTAppium-1-1.apk");
		
		AndroidDriver<MobileElement> driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),
				desiredCapabilities);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<MobileElement> findElements = driver.findElements(By.className("android.widget.TextView"));
//		for (MobileElement el: findElements) {
//			System.out.println(el.getText());
//		}
		
		findElements.get(1).click();
		
		MobileElement campoName = driver.findElement(MobileBy.AccessibilityId("nome"));
		campoName.sendKeys("test");
		
		String value = campoName.getText();
		Assert.assertEquals("test",value);
		
		driver.quit();

	}
	
	@Test
	public void deveInteragirCombo() throws MalformedURLException {

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

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//  //class[@att='value']  //android.widget.TextView[@text='Formulário']"
		
		// SELECIONAR FORMULÁRIO
		driver.findElement(By.xpath("//android.widget.TextView[@text='Formulário']")).click();

		// CLICAR NO COMBO
		driver.findElement(MobileBy.AccessibilityId("console")).click();
		
		// SELECIONAR OPÇÃO
		driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='PS4']")).click();
				
		// VERIFICAR OPÇAO SELECIONADA
		String value = driver.findElement(By.xpath("//android.widget.Spinner/android.widget.TextView")).getText();
		Assert.assertEquals("PS4",value); 
				
		driver.quit();
	}
	
	@Test
	public void deveInteragirSwitchCheckbox() throws MalformedURLException {

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

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//  //class[@att='value']  //android.widget.TextView[@text='Formulário']"
		
		// SELECIONAR FORMULÁRIO
		driver.findElement(By.xpath("//*[@text='Formulário']")).click(); // qualquer elemento que tenha text = formulario

		// VERIFICAR STATUS
		MobileElement check = driver.findElement(By.className("android.widget.CheckBox"));
		MobileElement switch_el = driver.findElement(MobileBy.AccessibilityId("switch"));
		
		Assert.assertTrue(check.getAttribute("checked").equals("false")); // retorna uma string com a informação true, false
		
		Assert.assertTrue(switch_el.getAttribute("checked").equals("true")); // retorna uma string com a informação true, false 
		// CLICAR NOS ELEMENTOS
		check.click();
		switch_el.click();
		
			
		// VERIFICAR STATUS ALTERADO
        Assert.assertFalse(check.getAttribute("checked").equals("false")); 
		
		Assert.assertFalse(switch_el.getAttribute("checked").equals("true"));
		
		driver.quit();
	}


}
