package automacao.pages;

import org.openqa.selenium.support.PageFactory;

import automacao.attributes.LoginAttributes;
import automacao.commons.TestRule;

public class LoginPage extends LoginAttributes {

	public LoginPage() {
		PageFactory.initElements(TestRule.getDriver(), this);
	}

	public void efetuarLogin(String strUsuario, String strSenha) {
		login.sendKeys(strUsuario);
		senha.sendKeys(strSenha);
		btnLogin.click();
	}
}
