package automacao;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class TestRule {

	private static WebDriver driver;
	private static ExtentHtmlReporter htmlReporter;
	private static ExtentReports extentReport;
	private static ExtentTest extentTest;

	@Before
	public void beforeCenario(Scenario cenario) {
		if (extentReport == null) {
			extentReport = new ExtentReports();
			htmlReporter = new ExtentHtmlReporter("src/test/resources/htmlReporter.html");
			extentReport.attachReporter(htmlReporter);
		}

		extentTest = extentReport.createTest(cenario.getId());

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

	@After
	public void afterCenario(Scenario cenario) {
		extentTest.log(Status.PASS, "Cenario " + cenario.getName() + " executado com sucesso");
		extentReport.flush();
	}

	public static WebDriver getDriver() {
		return driver;
	}
}
