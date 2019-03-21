package br.com.curso.appium.test;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import br.com.curso.appium.core.DSL;
import br.com.curso.appium.core.DriverFactory;
import br.com.curso.appium.page.FormularioPage;
import br.com.curso.appium.page.MenuPage;
import io.appium.java_client.MobileBy;

public class FormularioTeste {
	
	private MenuPage menu = new MenuPage();
	private FormularioPage formulario = new FormularioPage();
		
	@Before
	public void inicializarAppium() throws MalformedURLException {
		DriverFactory.getDriver();
		menu.acessarFormulario();
	}
	
	@After
	public void tearDown() {
		DriverFactory.killDriver();
	}
	
	@Test
	public void devePreencherCampo() throws MalformedURLException {
		formulario.escreverNome("Test");
		assertEquals("Test", formulario.obterNome());
	}
	
	@Test
	public void deveInteragirCombo() throws MalformedURLException {		
		formulario.selecionarCombo("PS4");
		
		Assert.assertEquals("PS4",formulario.obterValorCombo()); 
	}
	
	@Test
	public void deveInteragirSwitchCheckbox() throws MalformedURLException {
		// VERIFICAR STATUS
		Assert.assertFalse(formulario.isCheckSelected());
		Assert.assertTrue(formulario.isSwitchSelected());
		
		// CLICAR NOS ELEMENTOS
		formulario.clicarCheck();
		formulario.clicarSwitch();
		
		// VERIFICAR STATUS ALTERADO
		Assert.assertTrue(formulario.isCheckSelected());
		Assert.assertFalse(formulario.isSwitchSelected());	}
	
	@Test
	public void deveRealizarCadastro() throws MalformedURLException {
		formulario.escreverNome("Desafio 1");
		formulario.selecionarCombo("Nintendo Switch");
		formulario.clicarCheck();
		formulario.clicarSwitch();
		formulario.Salvar();
		
		// Validate changes on the form
		Assert.assertEquals("Nome: Desafio 1", formulario.obterNomeCadastrado());
		Assert.assertEquals("Console: switch", formulario.obterConsoleCadastrado());
		Assert.assertEquals("Switch: Off", formulario.obterSwitchCadastrado());
		Assert.assertEquals("Checkbox: Marcado", formulario.obterCheckCadastrado());
	}	
	

}
