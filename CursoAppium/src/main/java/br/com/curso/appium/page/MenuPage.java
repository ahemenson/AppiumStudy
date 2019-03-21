package br.com.curso.appium.page;

import org.openqa.selenium.By;

import br.com.curso.appium.core.DSL;

public class MenuPage {
	
	private DSL dsl = new DSL();
	
	public void acessarFormulario() {
		dsl.clicar(By.xpath("//*[@text='Formulário']"));
	}

}
