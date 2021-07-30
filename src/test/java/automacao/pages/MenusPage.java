package automacao.pages;

import java.awt.Desktop.Action;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import automacao.attributes.MenusAttibutes;
import automacao.commons.TestRule;
import automacao.commons.Utils;

public class MenusPage extends MenusAttibutes {

	public MenusPage() {
		PageFactory.initElements(TestRule.getDriver(), this);
	}

	public void acessarMenuClientesInserir() {
		Actions actions = new Actions(TestRule.getDriver());
		actions.moveToElement(menuClientes);
		actions.moveToElement(submenuClientesInserir);
		Utils.wait(1);
		actions.click().build().perform();
	}
}
