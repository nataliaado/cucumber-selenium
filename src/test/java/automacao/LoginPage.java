package automacao;

public class LoginPage extends LoginAttributes {

	public void efetuarLogin() {
		login.sendKeys("john");
		senha.sendKeys("john");
		btnLogin.click();
	}
}
