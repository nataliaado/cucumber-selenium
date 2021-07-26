package pages;

import java.awt.Desktop.Action;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import automacao.attributes.MenusAttibutes;
import automacao.commons.TestRule;

public class MenusPage extends MenusAttibutes {

	public MenusPage() {
		PageFactory.initElements(TestRule.getDriver(), this);
	}

	public void acessarMenuClientesInserir() {
		Actions actions = new Actions(TestRule.getDriver());
		actions.moveToElement(menuClientes);
		actions.moveToElement(submenuClientesInserir);
		actions.click().build().perform();
	}
}