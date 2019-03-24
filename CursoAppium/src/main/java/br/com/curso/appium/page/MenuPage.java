package br.com.curso.appium.page;

import org.openqa.selenium.By;

import br.com.curso.appium.core.BasePage;


public class MenuPage extends BasePage{
	
	
	
	public void acessarFormulario() {
		clicar(By.xpath("//*[@text='Formulário']"));
	}

}
