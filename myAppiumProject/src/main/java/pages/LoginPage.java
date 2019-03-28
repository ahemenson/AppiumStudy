package pages;

import org.openqa.selenium.By;

import core.DriverFactory;

public class LoginPage {
	
	public void inserirEmail(String nome) {
		//escrever(MobileBy.AccessibilityId("nome"), nome);	
		
		DriverFactory.getDriver().findElementById("email").sendKeys(nome);        
	}
	
	public void inserirSenha(String senha) {
		DriverFactory.getDriver().findElementById("password").sendKeys(senha);    	
	}
	
	public void clicarBotaoLogin() {
		DriverFactory.getDriver().findElementById("email_sign_in_button").click();		
		
	}
	
	public String getCurrentActivity() {
		return DriverFactory.getDriver().currentActivity();
	}
	
	
	
	public void clicarTermos() {
		DriverFactory.getDriver().findElementById("com.android.packageinstaller:id/desc_container").click();
	}
	
	

}
