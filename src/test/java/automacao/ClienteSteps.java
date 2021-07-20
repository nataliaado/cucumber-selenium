package automacao;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class ClienteSteps {

	ClientePage clientePage = new ClientePage();
	MenusPage menusPage = new MenusPage();
	LoginPage loginPage = new LoginPage();

	@Dado("^efetuei login no sistema$")
	public void efetuarLogin() throws Throwable {
		loginPage.efetuarLogin();
	}

	@E("^acessei o menu Clientes >> Inserir$")
	public void acessarMenuClientesInserir() throws Throwable {
		menusPage.acessarMenuClientesInserir();
	}

	@Quando("^na tela de Identificacao informo os dados de Pessoa Fisica$")
	public void informarDadosIdentificacaoPF() throws Throwable {
		clientePage.informarIdentificacaoPF();
	}

	@E("^na tela de Identificacao clico em Avancar$")
	public void clicarAvancar() throws Throwable {
		clientePage.clicarAvancar();
	}

	@E("^na tela enderecos informo os enderecos$")
	public void informarEnderecos() throws Throwable {
		clientePage.informarEnderecos();
	}

	@E("^na tela enderecos clico em Salvar$")
	public void clicarSalvar() throws Throwable {
		clientePage.clicarSalvar();
	}

	@Entao("^na tela enderecos sera exibida mensagem de sucesso$")
	public void verificarMensagemSucesso() throws Throwable {
		clientePage.verificarMensagemSucesso();
	}

	@E("^efetuarei logout do sistema$")
	public void efetuarLogout() throws Throwable {

	}

}
