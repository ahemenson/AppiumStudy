package br.com.curso.appium.core;

import static br.com.curso.appium.core.DriverFactory.getDriver;

import org.openqa.selenium.By;

public class BasePage {
	
	public void escrever(By by, String texto) {
		getDriver().findElement(by).sendKeys(texto);
		hideKeyboard();
	}
	
	public void hideKeyboard() {
		getDriver().hideKeyboard();
	}
	
	public String obterTexto(By by) {
		return getDriver().findElement(by).getText();		
	}
	
	private void clicarPorTexto(String texto) {
		clicar(By.xpath("//android.widget.CheckedTextView[@text='"+texto+"']"));
	}
	
	public void clicar(By by) {
		getDriver().findElement(by).click();
	}
	
	public void selecionarComboBox(By by, String valor) {
		getDriver().findElement(by).click();
		clicarPorTexto(valor);		
	}
	
	public boolean isCheckMarcado(By by) {
		return getDriver().findElement(by).getAttribute("checked").equals("true");	
	}
	
	

}
