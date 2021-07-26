package steps;

import org.junit.Assert;

import automacao.commons.Utils;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.ClientePage;
import pages.LoginPage;
import pages.MenusPage;

public class ClienteSteps {

	ClientePage clientePage = new ClientePage();
	MenusPage menusPage = new MenusPage();
	LoginPage loginPage = new LoginPage();

	@Dado("^efetuei login no sistema utilizando o usuario (.*) e a senha (.*)$")
	public void efetuarLogin(String strUsuario, String strSenha) throws Throwable {
		loginPage.efetuarLogin(strUsuario, strSenha);
	}

	@E("^acessei o menu Clientes >> Inserir$")
	public void acessarMenuClientesInserir() throws Throwable {
		menusPage.acessarMenuClientesInserir();
	}

	@Quando("^na tela de Identificacao informo os dados de Pessoa Fisica: (.*), (.*), (.*), (.*) e (.*)$")
	public void informarDadosIdentificacaoPF(String strNome, String strEmail, String strData_nascimento, String strSexo,
			String strEstado_civil) throws Throwable {
		clientePage.informarIdentificacaoPF(strNome, strEmail, strData_nascimento, strSexo, strEstado_civil);
		Utils.logPrint("Dados de Identificacao");
	}

	@E("^na tela de Identificacao clico em Avancar$")
	public void clicarAvancar() throws Throwable {
		clientePage.clicarAvancar();
	}

	@E("^na tela enderecos informo os enderecos$")
	public void informarEnderecos() throws Throwable {
		clientePage.informarEnderecos();
		Utils.logPrint("Enderecos");
	}

	@E("^na tela enderecos clico em Salvar$")
	public void clicarSalvar() throws Throwable {
		clientePage.clicarSalvar();
		Utils.logPrint("Cliente Cadastrado");
	}

	@Entao("^na tela enderecos sera exibida mensagem de sucesso$")
	public void verificarMensagemSucesso() throws Throwable {
		boolean blnExibiuMensagemSucesso = clientePage.verificarMensagemSucesso();

		if (blnExibiuMensagemSucesso) {
			Utils.logPass("Cliente Cadastrado com sucesso");
		} else {
			Utils.logFail("Erro ao cadastrar o cliente");
		}
		Assert.assertTrue("Não exibiu a mensagem de Sucesso", blnExibiuMensagemSucesso);
	}

}
