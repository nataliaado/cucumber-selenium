package automacao;

import org.openqa.selenium.support.PageFactory;

public class LoginPage extends LoginAttributes {

	public LoginPage() {
		PageFactory.initElements(TestRule.getDriver(), this);
	}

	public void efetuarLogin() {
		login.sendKeys("john");
		senha.sendKeys("john");
		btnLogin.click();
	}
}
