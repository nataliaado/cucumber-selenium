package automacao;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.Before;

public class TestRule {

	private static WebDriver driver;

	@Before
	public void beforeCenario() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver/chromedriver.exe");

		// Para acessar a base de dados corretamente
		ChromeOptions options = new ChromeOptions();
		options.addArguments("user-data-dir=C:/Users/Nataliaado/AppData/Local/Google/Chrome/User Data");

		// Inicia o driver e navega até a página inicial
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/Nataliaado/Documents/versao2/Versão 2/index.html");

	}

	public static WebDriver getDriver() {
		return driver;
	}
}
