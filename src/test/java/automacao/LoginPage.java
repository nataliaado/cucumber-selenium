package automacao;

import org.openqa.selenium.support.PageFactory;

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
